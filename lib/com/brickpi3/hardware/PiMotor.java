package com.brickpi3.hardware;

import com.brickpi3.java.SWIGTYPE_p_int;
import com.brickpi3.java.SWIGTYPE_p_short;
import com.brickpi3.java.SWIGTYPE_p_signed_char;
import com.brickpi3.java.SWIGTYPE_p_unsigned_char;
import com.brickpi3.java.brickpi;

public class PiMotor {
  protected SWIGTYPE_p_unsigned_char motorState;
  protected SWIGTYPE_p_signed_char motorPower;
  protected SWIGTYPE_p_int motorPosition = brickpi.new_intp();
  protected SWIGTYPE_p_short motorSpeed = brickpi.new_shortp(); // DPS degrees per second
  private PiMotorPort port;
  private PiBrick brick;

  public PiMotor(PiBrick brick, PiMotorPort port) {
    if (brick == null || port == null)
      throw new IllegalArgumentException("Cannot create motor from null values");
    this.port = port;
    this.brick = brick;
  }

  protected void update() {
    brick.getBrickPi3().get_motor_status((short)port.getPortAddress(), motorState, motorPower, motorPosition, motorSpeed);
  }
  
  public int getState() {
    return 0;
  }
  
  public int getPower() {
    return 0;
  }
  
  public int getPosition() {
    return brickpi.intp_value(motorPosition);
  }
  
  public int getSpeed() {
    return brickpi.shortp_value(motorSpeed);
  }

}
