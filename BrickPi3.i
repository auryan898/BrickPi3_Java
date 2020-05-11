%module brickpi
%{
#include "BrickPi3.h"
%}

// for loading the shared library
%pragma(java) jniclasscode=%{
  static {
    com.brickpi3.java.LibraryExtractionHelper.loadBrickPiLibrary();
  }

  public static long getPointer(SWIG swig) {
    return swig.getPointer();
  }
  
  public static SWIGTYPE_p_void createVoid(long cPtr, boolean futureUse) {
    return new SWIGTYPE_p_void(cPtr, futureUse);
  }
%}
%include "arrays_java.i"
%include "stdint.i"
%include "enumsimple.swg"
%include "cpointer.i"
%include "various.i"


%typemap(javabase) SWIGTYPE, SWIGTYPE *, SWIGTYPE &, SWIGTYPE [], SWIGTYPE (CLASS::*) "SWIG"

%typemap(javacode) SWIGTYPE, SWIGTYPE *, SWIGTYPE &, SWIGTYPE [], SWIGTYPE (CLASS::*) %{
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
%pointer_functions(signed char, charp);
%pointer_functions(unsigned char, ucharp);
%pointer_functions(spi_ioc_transfer, spi_ioc_transferp);
