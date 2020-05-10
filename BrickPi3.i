%module brickpi
%{
#include "BrickPi3.h"
%}

// for loading the shared library
%pragma(java) jniclasscode=%{
  static {
    com.brickpi3.java.LibraryExtractionHelper.loadBrickPiLibrary();
  }
%}
%include "arrays_java.i"
%include "stdint.i"
%include "enumsimple.swg"
%include "cpointer.i"
%include "various.i"


%typemap(javabase) SWIGTYPE, SWIGTYPE *, SWIGTYPE &, SWIGTYPE [], SWIGTYPE (CLASS::*) "SWIG"

%typemap(javacode) SWIGTYPE, SWIGTYPE *, SWIGTYPE &, SWIGTYPE [], SWIGTYPE (CLASS::*) %{
  public boolean equals(Object obj) {
  boolean equal = false;
  if (obj instanceof $javaclassname)
    equal = ((($javaclassname)obj).swigCPtr == this.swigCPtr);
  return equal;
  }
  public int hashCode() {
    return (int)swigCPtr;
  }
  protected long getPointer() {
    return swigCPtr;
  }
%}

%apply char *BYTE {char * str};

%include "BrickPi3.h"
%pointer_functions(float, floatp);
%pointer_functions(short,shortp);
%pointer_functions(long, longp);
%pointer_functions(int, intp);
%pointer_functions(int16_t,int16_tp);
%pointer_functions(int32_t,int32_tp);
%pointer_functions(int8_t,int8_tp);
%pointer_functions(uint16_t,uint16_tp);
%pointer_functions(uint8_t,uint8_tp);
%pointer_functions(spi_ioc_transfer, spi_ioc_transferp);
