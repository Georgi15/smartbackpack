#include <DHT.h>
#include <TinyGPS++.h>
#include  <SoftwareSerial.h>
#include "BluetoothSerial.h"
#include <LiquidCrystal_I2C.h>

#if !defined(CONFIG_BT_ENABLED) || !defined(CONFIG_BLUEDROID_ENABLED)
#error Bluetooth is not enabled! Please run `make menuconfig` to and enable it
#endif

BluetoothSerial SerialBT;

bool device_connected = false;
String data_string = "";
String data_buf;
String incoming_data;

#define dhttype 11
#define dht_pin 33
#define TXPin 35
#define RXPin 34
#define SERVICE_UUID        "6E400001-B5A3-F393-E0A9-E0A9-E50E24DCCA9E"
#define CHARACTERISTIC_UUID "6E400003-B5A3-F393-E0A9-E0A9-E50E24DCCA9E"
#define pin_code 69420

static const uint32_t GPSBaud = 9600;
TinyGPSPlus gps;

SoftwareSerial ss(RXPin, TXPin);

LiquidCeystal_I2C lcd(0x27, 16, 2)
DHT dht(dht_pin, dhttype);

void setup() {
  Serial.begin(9600);
  ss.begin(GPSBaud);
  SerialBT.begin("ESP32");
  Serial.println("The device started, now you can pair it with bluetooth!");
  lcd.init();
  lcd.backlight();
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

        
      float all_data[13] = {air_h, air_t, gps_lat, gps_long, gps_altitude, gps_speed, gps_day, gps_month, gps_year, gps_hour, gps_minute, gps_second};
      for(int i=0;i<13;i++)
      {
        data_string += String(all_data[i]);
        data_string += "|";
      }

      SerialBT.println(data_string);
      Serial.println("Sent value: " + String(data_string));
      
      delay(500);
    }
  }
  while(ss.available() < 0)
  {
        
      float all_data[2] = {air_h, air_t};
      for(int i=0;i<2;i++)
      {
        data_string += String(all_data[i]);
        data_string += "|";
      }

      SerialBT.println(data_string);
      Serial.println("Sent value: " + String(data_string));
      delay(500);
  }
  
  if(SerialBT.available())
  {
    char recieved_data = SerialBT.read();
    if(recieved_data != '\n')
    {
      incoming_data += String(recieved_data);
    }
    else
    {
      incoming_data = "";
    }
    Serial.write(recieved_data);
  }
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Enter pincode: ");
  


  
}
