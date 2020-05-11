/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class sensor_color_t extends SWIG {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected sensor_color_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(sensor_color_t obj) {
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
        brickpiJNI.delete_sensor_color_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
  boolean equal = false;
  if (obj instanceof sensor_color_t)
    equal = (((sensor_color_t)obj).swigCPtr == this.swigCPtr);
  return equal;
  }
  public int hashCode() {
    return (int)swigCPtr;
  }
  protected long getPointer() {
    return swigCPtr;
  }

  public void setColor(byte value) {
    brickpiJNI.sensor_color_t_color_set(swigCPtr, this, value);
  }

  public byte getColor() {
    return brickpiJNI.sensor_color_t_color_get(swigCPtr, this);
  }

  public void setReflected_red(short value) {
    brickpiJNI.sensor_color_t_reflected_red_set(swigCPtr, this, value);
  }

  public short getReflected_red() {
    return brickpiJNI.sensor_color_t_reflected_red_get(swigCPtr, this);
  }

  public void setReflected_green(short value) {
    brickpiJNI.sensor_color_t_reflected_green_set(swigCPtr, this, value);
  }

  public short getReflected_green() {
    return brickpiJNI.sensor_color_t_reflected_green_get(swigCPtr, this);
  }

  public void setReflected_blue(short value) {
    brickpiJNI.sensor_color_t_reflected_blue_set(swigCPtr, this, value);
  }

  public short getReflected_blue() {
    return brickpiJNI.sensor_color_t_reflected_blue_get(swigCPtr, this);
  }

  public void setAmbient(short value) {
    brickpiJNI.sensor_color_t_ambient_set(swigCPtr, this, value);
  }

  public short getAmbient() {
    return brickpiJNI.sensor_color_t_ambient_get(swigCPtr, this);
  }

  public sensor_color_t() {
    this(brickpiJNI.new_sensor_color_t(), true);
  }

}
