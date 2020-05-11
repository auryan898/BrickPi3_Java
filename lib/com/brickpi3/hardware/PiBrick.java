package com.brickpi3.hardware;

import com.brickpi3.java.BrickPi3;
import com.brickpi3.java.SWIGTYPE_p_uint8_t;
import com.brickpi3.java.brickpi;

class PiBrick {
  protected BrickPi3 b;
  public PiBrick() {
    b = new BrickPi3();
  }
  
  public PiBrick(int address) {
    SWIGTYPE_p_uint8_t addr = brickpi.new_uint8_tp();
  }
}