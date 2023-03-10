#include <DHT.h>
#include <TinyGPS++.h>
#include  <SoftwareSerial.h>
#include <BLEDevice.h>
#include <BLEServer.h>
#include <BLEUtils.h>
#include <BLE2902.h>

int txValue;
BLECharacteristic *pCharacteristics;
bool device_connected = false;
String data_string = "";
String data_buf;

#define dhttype 11
#define dht_pin 33
#define TXPin 35
#define RXPin 34
#define SERVICE_UUID        "6E400001-B5A3-F393-E0A9-E0A9-E50E24DCCA9E"
#define CHARACTERISTIC_UUID "6E400003-B5A3-F393-E0A9-E0A9-E50E24DCCA9E"

static const uint32_t GPSBaud = 9600;
TinyGPSPlus gps;

SoftwareSerial ss(RXPin, TXPin);


DHT dht(dht_pin, dhttype);

class MyServerCallbacks: public BLEServerCallbacks
{
  void onConnect(BLEServer* pServer)
  {
    device_connected = true;
  };
  void onDisconnect(BLEServer* pServer)
  {
    device_connected = false;
  }
};

void setup() {
  Serial.begin(9600);
  ss.begin(GPSBaud);
  BLEServer *pServer = BLEDevice::createServer();
  pServer->setCallbacks(new MyServerCallbacks());

  BLEService *pService = pServer->createService(SERVICE_UUID);

  pCharacteristics = pService->createCharacteristic(
                        CHARACTERISTIC_UUID,
                        BLECharacteristic::PROPERTY_NOTIFY
                     );

  pCharacteristics->addDescriptor(new BLE2902);

  pService->start();

  pServer->getAdvertising()->start();
  
  
  
  dht.begin();
}

void loop() {
  float air_h = dht.readHumidity();
  float air_t = dht.readTemperature();    

  while(ss.available() > 0)
  {
    gps.encode(ss.read());
    if(gps.location.isUpdated())
    {
      //location
      float gps_lat = gps.location.lat();
      float gps_long = gps.location.lng();

      //date
      float gps_year = gps.date.year();
      float gps_month = gps.date.month();
      float gps_day = gps.date.day();

      //time
      float gps_hour = gps.time.hour();
      float gps_minute = gps.time.minute();
      float gps_second = gps.time.second();

      //speed
      float gps_speed = gps.speed.kmph();

      //altitude
      float gps_altitude = gps.altitude.meters();

      //number of satelites in use
      //float gps_satelite_count = gps.satellites.value();

      //course in degrees
      float gps_course = gps.course.deg();
      
      if(device_connected)
      {

        
        float all_data[13] = {air_h, air_t, gps_lat, gps_long, gps_altitude, gps_course, gps_speed, gps_day, gps_month, gps_year, gps_hour, gps_minute, gps_second};
        for(int i=0;i<13;i++)
        {
          data_string += String(all_data[i]);
          data_string += "|";
        }

        pCharacteristics->setValue(data_string);

        pCharacteristics->notify();
        Serial.println("Sent value: " + String(data_string));
        delay(500);
      }
    }
  }
  while(ss.available() < 0)
  {
      if(device_connected)
      {

        
        float all_data[2] = {air_h, air_t};
        for(int i=0;i<2;i++)
        {
          data_string += String(all_data[i]);
          data_string += "|";
        }
        
        pCharacteristics->setValue(data_string);

        pCharacteristics->notify();
        Serial.println("Sent value: " + String(data_string));
        delay(500);
      }
  }
      

}
