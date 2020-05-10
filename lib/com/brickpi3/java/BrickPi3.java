/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class BrickPi3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BrickPi3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BrickPi3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        brickpiJNI.delete_BrickPi3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof BrickPi3)
      equal = (((BrickPi3)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  public int hashCode() {
    return (int)swigCPtr;
  }

  public BrickPi3(SWIGTYPE_p_uint8_t addr) {
    this(brickpiJNI.new_BrickPi3__SWIG_0(SWIGTYPE_p_uint8_t.getCPtr(addr)), true);
  }

  public BrickPi3() {
    this(brickpiJNI.new_BrickPi3__SWIG_1(), true);
  }

  public int detect(boolean critical) {
    return brickpiJNI.BrickPi3_detect__SWIG_0(swigCPtr, this, critical);
  }

  public int detect() {
    return brickpiJNI.BrickPi3_detect__SWIG_1(swigCPtr, this);
  }

  public int get_manufacturer(String str) {
    return brickpiJNI.BrickPi3_get_manufacturer(swigCPtr, this, str);
  }

  public int get_board(String str) {
    return brickpiJNI.BrickPi3_get_board(swigCPtr, this, str);
  }

  public int get_version_hardware(String str) {
    return brickpiJNI.BrickPi3_get_version_hardware(swigCPtr, this, str);
  }

  public int get_version_firmware(String str) {
    return brickpiJNI.BrickPi3_get_version_firmware(swigCPtr, this, str);
  }

  public int get_id(String str) {
    return brickpiJNI.BrickPi3_get_id(swigCPtr, this, str);
  }

  public int set_led(SWIGTYPE_p_uint8_t value) {
    return brickpiJNI.BrickPi3_set_led(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public float get_voltage_3v3() {
    return brickpiJNI.BrickPi3_get_voltage_3v3__SWIG_0(swigCPtr, this);
  }

  public float get_voltage_5v() {
    return brickpiJNI.BrickPi3_get_voltage_5v__SWIG_0(swigCPtr, this);
  }

  public float get_voltage_9v() {
    return brickpiJNI.BrickPi3_get_voltage_9v__SWIG_0(swigCPtr, this);
  }

  public float get_voltage_battery() {
    return brickpiJNI.BrickPi3_get_voltage_battery__SWIG_0(swigCPtr, this);
  }

  public int get_voltage_3v3(SWIGTYPE_p_float voltage) {
    return brickpiJNI.BrickPi3_get_voltage_3v3__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(voltage));
  }

  public int get_voltage_5v(SWIGTYPE_p_float voltage) {
    return brickpiJNI.BrickPi3_get_voltage_5v__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(voltage));
  }

  public int get_voltage_9v(SWIGTYPE_p_float voltage) {
    return brickpiJNI.BrickPi3_get_voltage_9v__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(voltage));
  }

  public int get_voltage_battery(SWIGTYPE_p_float voltage) {
    return brickpiJNI.BrickPi3_get_voltage_battery__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(voltage));
  }

  public int set_sensor_type(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_uint8_t type, SWIGTYPE_p_uint16_t flags, i2c_struct_t i2c_struct) {
    return brickpiJNI.BrickPi3_set_sensor_type__SWIG_0(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_uint8_t.getCPtr(type), SWIGTYPE_p_uint16_t.getCPtr(flags), i2c_struct_t.getCPtr(i2c_struct), i2c_struct);
  }

  public int set_sensor_type(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_uint8_t type, SWIGTYPE_p_uint16_t flags) {
    return brickpiJNI.BrickPi3_set_sensor_type__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_uint8_t.getCPtr(type), SWIGTYPE_p_uint16_t.getCPtr(flags));
  }

  public int set_sensor_type(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_uint8_t type) {
    return brickpiJNI.BrickPi3_set_sensor_type__SWIG_2(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_uint8_t.getCPtr(type));
  }

  public int transact_i2c(SWIGTYPE_p_uint8_t port, i2c_struct_t i2c_struct) {
    return brickpiJNI.BrickPi3_transact_i2c(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), i2c_struct_t.getCPtr(i2c_struct), i2c_struct);
  }

  public int get_sensor(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_void value_ptr) {
    return brickpiJNI.BrickPi3_get_sensor(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_void.getCPtr(value_ptr));
  }

  public int set_motor_power(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int8_t power) {
    return brickpiJNI.BrickPi3_set_motor_power(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int8_t.getCPtr(power));
  }

  public int set_motor_position(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int32_t position) {
    return brickpiJNI.BrickPi3_set_motor_position(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int32_t.getCPtr(position));
  }

  public int set_motor_position_relative(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int32_t position) {
    return brickpiJNI.BrickPi3_set_motor_position_relative(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int32_t.getCPtr(position));
  }

  public int set_motor_dps(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int16_t dps) {
    return brickpiJNI.BrickPi3_set_motor_dps(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int16_t.getCPtr(dps));
  }

  public int set_motor_limits(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_uint8_t power, SWIGTYPE_p_uint16_t dps) {
    return brickpiJNI.BrickPi3_set_motor_limits(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_uint8_t.getCPtr(power), SWIGTYPE_p_uint16_t.getCPtr(dps));
  }

  public int get_motor_status(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_uint8_t state, SWIGTYPE_p_int8_t power, SWIGTYPE_p_int32_t position, SWIGTYPE_p_int16_t dps) {
    return brickpiJNI.BrickPi3_get_motor_status(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_uint8_t.getCPtr(state), SWIGTYPE_p_int8_t.getCPtr(power), SWIGTYPE_p_int32_t.getCPtr(position), SWIGTYPE_p_int16_t.getCPtr(dps));
  }

  public int offset_motor_encoder(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int32_t position) {
    return brickpiJNI.BrickPi3_offset_motor_encoder(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int32_t.getCPtr(position));
  }

  public int reset_motor_encoder(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int32_t value) {
    return brickpiJNI.BrickPi3_reset_motor_encoder__SWIG_0(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int32_t.getCPtr(value));
  }

  public int reset_motor_encoder(SWIGTYPE_p_uint8_t port) {
    return brickpiJNI.BrickPi3_reset_motor_encoder__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port));
  }

  public int set_motor_encoder(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int32_t value) {
    return brickpiJNI.BrickPi3_set_motor_encoder(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int32_t.getCPtr(value));
  }

  public int get_motor_encoder(SWIGTYPE_p_uint8_t port, SWIGTYPE_p_int32_t value) {
    return brickpiJNI.BrickPi3_get_motor_encoder__SWIG_0(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port), SWIGTYPE_p_int32_t.getCPtr(value));
  }

  public SWIGTYPE_p_int32_t get_motor_encoder(SWIGTYPE_p_uint8_t port) {
    return new SWIGTYPE_p_int32_t(brickpiJNI.BrickPi3_get_motor_encoder__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(port)), true);
  }

  public int reset_all() {
    return brickpiJNI.BrickPi3_reset_all(swigCPtr, this);
  }

}
