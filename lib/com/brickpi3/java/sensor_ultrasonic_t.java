/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class sensor_ultrasonic_t extends SWIG {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected sensor_ultrasonic_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sensor_ultrasonic_t obj) {
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
        brickpiJNI.delete_sensor_ultrasonic_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

   public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof sensor_ultrasonic_t)
      equal = (((sensor_ultrasonic_t)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  public int hashCode() {
    return (int)swigCPtr;
  }
  protected long getPointer() {
    return swigCPtr;
  }

  public void setCm(float value) {
    brickpiJNI.sensor_ultrasonic_t_cm_set(swigCPtr, this, value);
  }

  public float getCm() {
    return brickpiJNI.sensor_ultrasonic_t_cm_get(swigCPtr, this);
  }

  public void setInch(float value) {
    brickpiJNI.sensor_ultrasonic_t_inch_set(swigCPtr, this, value);
  }

  public float getInch() {
    return brickpiJNI.sensor_ultrasonic_t_inch_get(swigCPtr, this);
  }

  public void setPresence(boolean value) {
    brickpiJNI.sensor_ultrasonic_t_presence_set(swigCPtr, this, value);
  }

  public boolean getPresence() {
    return brickpiJNI.sensor_ultrasonic_t_presence_get(swigCPtr, this);
  }

  public sensor_ultrasonic_t() {
    this(brickpiJNI.new_sensor_ultrasonic_t(), true);
  }

}
