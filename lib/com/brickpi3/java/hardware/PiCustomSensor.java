package com.brickpi3.java.hardware;

import com.brickpi3.java.sensor_custom_t;

public class PiCustomSensor extends PiBaseSensor {

  protected sensor_custom_t device;

  public PiCustomSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, PiSensorType.SENSOR_TYPE_CUSTOM, new sensor_custom_t());
    device = (sensor_custom_t) sensorDevice;
  }

  /**
   * @param value
   * @see com.brickpi3.java.sensor_custom_t#setAdc1(int)
   */
  public void setAdc1(int value) {
    device.setAdc1(value);
    super.update();
  }

  /**
   * @return
   * @see com.brickpi3.java.sensor_custom_t#getAdc1()
   */
  public int getAdc1() {
    super.update();
    return device.getAdc1();
  }

  /**
   * @param value
   * @see com.brickpi3.java.sensor_custom_t#setAdc6(int)
   */
  public void setAdc6(int value) {
    device.setAdc6(value);
    super.update();
  }

  /**
   * @return
   * @see com.brickpi3.java.sensor_custom_t#getAdc6()
   */
  public int getAdc6() {
    super.update();
    return device.getAdc6();
  }

  /**
   * @param value
   * @see com.brickpi3.java.sensor_custom_t#setPin5(boolean)
   */
  public void setPin5(boolean value) {
    device.setPin5(value);
    super.update();
  }

  /**
   * @return
   * @see com.brickpi3.java.sensor_custom_t#getPin5()
   */
  public boolean getPin5() {
    super.update();
    return device.getPin5();
  }

  /**
   * @param value
   * @see com.brickpi3.java.sensor_custom_t#setPin6(boolean)
   */
  public void setPin6(boolean value) {
    device.setPin6(value);
    super.update();
  }

  /**
   * @return
   * @see com.brickpi3.java.sensor_custom_t#getPin6()
   */
  public boolean getPin6() {
    super.update();
    return device.getPin6();
  }

}
