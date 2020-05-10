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

%include "enumsimple.swg"

%include "various.i"
%include "arrays_java.i"
%typemap(in) uint8_t {
  $1 = $input;
}

%include "BrickPi3.h"
