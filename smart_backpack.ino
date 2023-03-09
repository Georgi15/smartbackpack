#include <DHT.h>
#include <TinyGPS++.h>
#include  <SoftwareSerial.h>
#include "BluetoothSerial.h"
#if !defined(CONFIG_BT_ENABLED) || !defined(CONFIG_BLUEDROID_ENABLED)
#error Bluetooth is not enabled! Please run `make menuconfig` to and enable it
#endif

#define dhttype 11
#define dht_pin 33
#define TXPin 35
#define RXPin 34
#define SERVICE_UUID        "4fafc201-1fb5-459e-8fcc-c5c9c331914b"
#define CHARACTERISTIC_UUID "beb5483e-36e1-4688-b7f5-ea07361b26a8"

static const uint32_t GPSBaud = 9600;
TinyGPSPlus gps;

SoftwareSerial ss(RXPin, TXPin);

BluetoothSerial BTS;


DHT dht(dht_pin, dhttype);

void setup() {
  Serial.begin(115200);
  ss.begin(GPSBaud);
  Serial.println("Starting BLE work!");
  
  dht.begin();

  BTS.begin();
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
      float gps_location[2] = {gps_lat, gps_long};

      //date
      int gps_year = gps.date.year();
      int gps_month = gps.date.month();
      int gps_day = gps.date.day();
      int gps_date[3] = {gps_day, gps_month, gps_year};

      //time
      int gps_hour = gps.time.hour();
      int gps_minute = gps.time.minute();
      int gps_second = gps.time.second();
      int gps_time[3] = {gps_hour, gps_minute, gps_second};

      //speed
      float gps_speed = gps.speed.kmph();

      //altitude
      float gps_altitude = gps.altitude.meters();

      //number of satelites in use
      int gps_satelite_count = gps.satellites.value();

      //course in degrees
      float gps_course = gps.course.deg();
    }
  }
  
}
