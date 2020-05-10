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


%include various.i

%include "BrickPi3.h"
