/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class sensor_gyro_t extends SWIG {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected sensor_gyro_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sensor_gyro_t obj) {
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
        brickpiJNI.delete_sensor_gyro_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  boolean equal = false;
  if (obj instanceof sensor_gyro_t)
    equal = (((sensor_gyro_t)obj).swigCPtr == this.swigCPtr);
  return equal;
  }
  public int hashCode() {
    return (int)swigCPtr;
  }
  protected long getPointer() {
    return swigCPtr;
  }

  public void setAbs(short value) {
    brickpiJNI.sensor_gyro_t_abs_set(swigCPtr, this, value);
  }

  public short getAbs() {
    return brickpiJNI.sensor_gyro_t_abs_get(swigCPtr, this);
  }

  public void setDps(short value) {
    brickpiJNI.sensor_gyro_t_dps_set(swigCPtr, this, value);
  }

  public short getDps() {
    return brickpiJNI.sensor_gyro_t_dps_get(swigCPtr, this);
  }

  public sensor_gyro_t() {
    this(brickpiJNI.new_sensor_gyro_t(), true);
  }

}
