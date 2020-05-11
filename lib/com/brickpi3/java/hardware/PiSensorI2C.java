package com.brickpi3.java.hardware;

import com.brickpi3.java.i2c_struct_t;

public class PiSensorI2C extends PiBaseSensor {
  protected i2c_struct_t device;

  public PiSensorI2C(PiBrick brick, PiSensorPort port) {
    super(brick, port, PiSensorType.SENSOR_TYPE_I2C, new i2c_struct_t());
    device = (i2c_struct_t) sensorDevice;
  }

  /**
   * @param value
   * @see         com.brickpi3.java.i2c_struct_t#setSpeed(short)
   */
  public void setSpeed(short value) {
    device.setSpeed(value);
    super.update();
  }

  /**
   * @return
   * @see    com.brickpi3.java.i2c_struct_t#getSpeed()
   */
  public short getSpeed() {
    super.update();
    return device.getSpeed();
  }

  /**
   * @param value
   * @see         com.brickpi3.java.i2c_struct_t#setDelay(short)
   */
  public void setDelay(short value) {
    device.setDelay(value);
    super.update();
  }

  /**
   * @return
   * @see    com.brickpi3.java.i2c_struct_t#getDelay()
   */
  public short getDelay() {
    super.update();
    return device.getDelay();
  }

  /**
   * @param value
   * @see         com.brickpi3.java.i2c_struct_t#setAddress(short)
   */
  public void setAddress(short value) {
    device.setAddress(value);
    super.update();
  }

  /**
   * @return
   * @see    com.brickpi3.java.i2c_struct_t#getAddress()
   */
  public short getAddress() {
    super.update();
    return device.getAddress();
  }

  /**
   * @param value
   * @see         com.brickpi3.java.i2c_struct_t#setLength_write(short)
   */
  public void setLength_write(short value) {
    device.setLength_write(value);
    super.update();
  }

  /**
   * @return
   * @see    com.brickpi3.java.i2c_struct_t#getLength_write()
   */
  public short getLength_write() {
    super.update();
    return device.getLength_write();
  }

  /**
   * @param value
   * @see         com.brickpi3.java.i2c_struct_t#setBuffer_write(short[])
   */
  public void setBuffer_write(short[] value) {
    device.setBuffer_write(value);
    super.update();
  }

  /**
   * @return
   * @see    com.brickpi3.java.i2c_struct_t#getBuffer_write()
   */
  public short[] getBuffer_write() {
    super.update();
    return device.getBuffer_write();
  }

  /**
   * @param value
   * @see         com.brickpi3.java.i2c_struct_t#setLength_read(short)
   */
  public void setLength_read(short value) {
    device.setLength_read(value);
    super.update();
  }

  /**
   * @return
   * @see    com.brickpi3.java.i2c_struct_t#getLength_read()
   */
  public short getLength_read() {
    super.update();
    return device.getLength_read();
  }

  /**
   * @param value
   * @see         com.brickpi3.java.i2c_struct_t#setBuffer_read(short[])
   */
  public void setBuffer_read(short[] value) {
    device.setBuffer_read(value);
    super.update();
  }

  /**
   * @return
   * @see    com.brickpi3.java.i2c_struct_t#getBuffer_read()
   */
  public short[] getBuffer_read() {
    super.update();
    return device.getBuffer_read();
  }

}
