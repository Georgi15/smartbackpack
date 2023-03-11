#include <DHT.h>
#include "BluetoothSerial.h"
#include <LiquidCrystal_I2C.h>
#include <Keypad.h>


char keys[4][4] = {
  {'1', '2', '3', 'U'},
  {'4', '5', '6', 'D'},
  {'7', '8', '9', 'C'},
  {'L', '0', 'R', 'E'}
};
const int rows = 4;
const int cols = 4;
byte row_pins[] = {16, 4, 2, 15};
byte col_pins[] = {23, 19, 18, 5};

Keypad my_keypad = Keypad(makeKeymap(keys), row_pins, col_pins, rows, cols);

#if !defined(CONFIG_BT_ENABLED) || !defined(CONFIG_BLUEDROID_ENABLED)
#error Bluetooth is not enabled! Please run `make menuconfig` to and enable it
#endif

BluetoothSerial SerialBT;

bool device_connected = false;
bool unlocked = false;
String data_string = "";
String data_buf;
String incoming_data;
String entered_pin = "";
String pin = "1234";

#define dhttype 11
#define dht_pin 25
#define SERVICE_UUID        "6E400001-B5A3-F393-E0A9-E0A9-E50E24DCCA9E"
#define CHARACTERISTIC_UUID "6E400003-B5A3-F393-E0A9-E0A9-E50E24DCCA9E"
#define pin_code 69420

LiquidCrystal_I2C lcd(0x27, 16, 2);
DHT dht(dht_pin, dhttype);

void setup() {
  Serial.begin(9600);
  SerialBT.begin("ESP32");
  Serial.println("The device started, now you can pair it with bluetooth!");
  lcd.init();
  lcd.backlight();
  dht.begin();
}

void loop() {
  float air_h = dht.readHumidity();
  float air_t = dht.readTemperature();
  float all_data[2] = {air_h, air_t};
  for(int i=0;i<2;i++)
  {
    data_string += String(all_data[i]);
    data_string += "|";
  }

  SerialBT.println(data_string);
  Serial.println("Sent value: " + String(data_string));
  data_string = "";
  delay(500);
  
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Enter pincode: ");
  lcd.setCursor(0, 1);
  while(unlocked == false)
  {
    char key_ = my_keypad.getKey();
    entered_pin += key_;
    if(key_ == '\n' && entered_pin == pin)
    {
      unlocked = true;
      break;
    }
    else
    if(key_ == '\n' && entered_pin!=pin)
    {
      lcd.setCursor(0, 0);
      lcd.print("Enter pincode: ");
      lcd.setCursor(0, 1);
      entered_pin = "";
      continue;
    }
    lcd.print(entered_pin);
    Serial.println(entered_pin);
  }
  lcd.clear();
  lcd.setCursor(0, 0);
  if(unlocked == true)
  {
    lcd.setCursor(0, 0);
    lcd.print("air_hum is " + String(air_h));
    lcd.setCursor(0, 1);
    lcd.print("air_temp is " + String(air_t));
    Serial.println(air_h);
    Serial.println(air_t);
  }
  

  
  
}
