package com.brickpi3.hardware;

import com.brickpi3.java.BrickPi3;

public class PiBrick {
  protected BrickPi3 b;

  byte[] str = new byte[33];

  public PiBrick() {
    b = new BrickPi3();
  }

  public PiBrick(short address) {
    b = new BrickPi3(address);
  }

  protected BrickPi3 getBrickPi3() {
    return b;
  }

  /**
   * 
   * @see com.brickpi3.java.BrickPi3#delete()
   */
  protected void delete() {
    b.delete();
  }

  /**
   * @param  obj
   * @return
   * @see        com.brickpi3.java.BrickPi3#equals(java.lang.Object)
   */
  public boolean equals(Object obj) {
    return b.equals(obj);
  }

  /**
   * @return
   * @see    com.brickpi3.java.BrickPi3#hashCode()
   */
  public int hashCode() {
    return b.hashCode();
  }

  /**
   * @param  critical
   * @return
   * @see             com.brickpi3.java.BrickPi3#detect(boolean)
   */
  public int detect(boolean critical) {
    return b.detect(critical);
  }

  /**
   * @return
   * @see    com.brickpi3.java.BrickPi3#detect()
   */
  public int detect() {
    return b.detect();
  }

  /**
   * @param  str
   * @return
   * @see        com.brickpi3.java.BrickPi3#get_manufacturer(byte[])
   */
  public String getManufacturer() throws RuntimeException {
    int error;
    if ((error = b.get_manufacturer(str)) != 0)
      throw new RuntimeException("Error Code: " + error);
    return new String(str);
  }

  /**
   * @param  str
   * @return
   * @see        com.brickpi3.java.BrickPi3#get_board(byte[])
   */
  public String getBoardAddress() throws RuntimeException {
    int error;
    if ((error = b.get_board(str)) != 0)
      throw new RuntimeException("Error Code: " + error);
    return new String(str);
  }

  /**
   * @param  str
   * @return
   * @see        com.brickpi3.java.BrickPi3#get_version_hardware(byte[])
   */
  public String getVersionHardware() {
    int error;
    if ((error = b.get_version_hardware(str)) != 0)
      throw new RuntimeException("Error Code: " + error);
    return new String(str);
  }

  /**
   * @param  str
   * @return
   * @see        com.brickpi3.java.BrickPi3#get_version_firmware(byte[])
   */
  public String getVersionFirmward() {
    int error;
    if ((error = b.get_version_firmware(str)) != 0)
      throw new RuntimeException("Error Code: " + error);
    return new String(str);
  }

  /**
   * @param  str
   * @return
   * @see        com.brickpi3.java.BrickPi3#get_id(byte[])
   */
  public String getID() {
    int error;
    if ((error = b.get_id(str)) != 0)
      throw new RuntimeException("Error Code: " + error);
    return new String(str);
  }

  /**
   * @param  value
   * @return
   * @see          com.brickpi3.java.BrickPi3#set_led(short)
   */
  public int setLED(short value) {
    return b.set_led(value);
  }

  /**
   * @return
   * @see    com.brickpi3.java.BrickPi3#get_voltage_3v3()
   */
  public float getVoltage3V3() {
    return b.get_voltage_3v3();
  }

  /**
   * @return
   * @see    com.brickpi3.java.BrickPi3#get_voltage_5v()
   */
  public float getVoltage5V() {
    return b.get_voltage_5v();
  }

  /**
   * @return
   * @see    com.brickpi3.java.BrickPi3#get_voltage_9v()
   */
  public float getVoltage9V() {
    return b.get_voltage_9v();
  }

  /**
   * @return
   * @see    com.brickpi3.java.BrickPi3#get_voltage_battery()
   */
  public float getVoltageBattery() {
    return b.get_voltage_battery();
  }

  /**
   * @return
   * @see    com.brickpi3.java.BrickPi3#reset_all()
   */
  public int resetAll() {
    return b.reset_all();
  }

  /**
   * @return
   * @see    java.lang.Object#toString()
   */
  public String toString() {
    return b.toString();
  }

}