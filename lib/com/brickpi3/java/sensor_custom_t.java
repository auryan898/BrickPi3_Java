/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class sensor_custom_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected sensor_custom_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sensor_custom_t obj) {
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
        brickpiJNI.delete_sensor_custom_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof sensor_custom_t)
      equal = (((sensor_custom_t)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  public int hashCode() {
    return (int)swigCPtr;
  }

  public void setAdc1(SWIGTYPE_p_uint16_t value) {
    brickpiJNI.sensor_custom_t_adc1_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getAdc1() {
    return new SWIGTYPE_p_uint16_t(brickpiJNI.sensor_custom_t_adc1_get(swigCPtr, this), true);
  }

  public void setAdc6(SWIGTYPE_p_uint16_t value) {
    brickpiJNI.sensor_custom_t_adc6_set(swigCPtr, this, SWIGTYPE_p_uint16_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint16_t getAdc6() {
    return new SWIGTYPE_p_uint16_t(brickpiJNI.sensor_custom_t_adc6_get(swigCPtr, this), true);
  }

  public void setPin5(boolean value) {
    brickpiJNI.sensor_custom_t_pin5_set(swigCPtr, this, value);
  }

  public boolean getPin5() {
    return brickpiJNI.sensor_custom_t_pin5_get(swigCPtr, this);
  }

  public void setPin6(boolean value) {
    brickpiJNI.sensor_custom_t_pin6_set(swigCPtr, this, value);
  }

  public boolean getPin6() {
    return brickpiJNI.sensor_custom_t_pin6_get(swigCPtr, this);
  }

  public sensor_custom_t() {
    this(brickpiJNI.new_sensor_custom_t(), true);
  }

}
