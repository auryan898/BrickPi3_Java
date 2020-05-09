/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class sensor_light_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected sensor_light_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sensor_light_t obj) {
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
        brickpiJNI.delete_sensor_light_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAmbient(SWIGTYPE_p_int16_t value) {
    brickpiJNI.sensor_light_t_ambient_set(swigCPtr, this, SWIGTYPE_p_int16_t.getCPtr(value));
  }

  public SWIGTYPE_p_int16_t getAmbient() {
    return new SWIGTYPE_p_int16_t(brickpiJNI.sensor_light_t_ambient_get(swigCPtr, this), true);
  }

  public void setReflected(SWIGTYPE_p_int16_t value) {
    brickpiJNI.sensor_light_t_reflected_set(swigCPtr, this, SWIGTYPE_p_int16_t.getCPtr(value));
  }

  public SWIGTYPE_p_int16_t getReflected() {
    return new SWIGTYPE_p_int16_t(brickpiJNI.sensor_light_t_reflected_get(swigCPtr, this), true);
  }

  public sensor_light_t() {
    this(brickpiJNI.new_sensor_light_t(), true);
  }

}