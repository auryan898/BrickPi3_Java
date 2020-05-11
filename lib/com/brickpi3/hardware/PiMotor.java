package com.brickpi3.hardware;

import com.brickpi3.java.SWIGTYPE_p_int16_t;
import com.brickpi3.java.SWIGTYPE_p_int32_t;
import com.brickpi3.java.SWIGTYPE_p_int8_t;
import com.brickpi3.java.SWIGTYPE_p_uint8_t;

public class PiMotor {
  protected SWIGTYPE_p_uint8_t MotorState;
  protected SWIGTYPE_p_int8_t MotorPower;
  protected SWIGTYPE_p_int32_t MotorPosition;
  protected SWIGTYPE_p_int16_t MotorSpeed; // DPS degrees per second
  private PiPort port;
  private PiBrick brick;

  public PiMotor(PiPort port) {
    this.port = port;
    this.brick = port.getPiBrick();
  }

  public void update() {
    
  }

}
