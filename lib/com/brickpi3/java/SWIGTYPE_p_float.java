/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class SWIGTYPE_p_float extends SWIG {
  private transient long swigCPtr;

  protected SWIGTYPE_p_float(long cPtr, @SuppressWarnings("unused") boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected SWIGTYPE_p_float() {
    swigCPtr = 0;
  }

  protected static long getCPtr(SWIGTYPE_p_float obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

   public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof SWIGTYPE_p_float)
      equal = (((SWIGTYPE_p_float)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  public int hashCode() {
    return (int)swigCPtr;
  }
  protected long getPointer() {
    return swigCPtr;
  }
}

