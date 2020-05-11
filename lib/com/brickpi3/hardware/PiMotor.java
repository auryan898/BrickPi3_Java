package com.brickpi3.hardware;

import com.brickpi3.java.SWIGTYPE_p_int;
import com.brickpi3.java.SWIGTYPE_p_short;
import com.brickpi3.java.SWIGTYPE_p_signed_char;
import com.brickpi3.java.SWIGTYPE_p_unsigned_char;
import com.brickpi3.java.brickpi;

public class PiMotor {
  protected SWIGTYPE_p_unsigned_char motorState = brickpi.new_ucharp();
  protected SWIGTYPE_p_signed_char motorPower = brickpi.new_charp();
  protected SWIGTYPE_p_int motorPosition = brickpi.new_intp();
  protected SWIGTYPE_p_short motorSpeed = brickpi.new_shortp(); // DPS degrees per second
  private PiMotorPort port;
  private PiBrick brick;
  private short portAddress;

  public PiMotor(PiBrick brick, PiMotorPort port) {
    if (brick == null || port == null)
      throw new IllegalArgumentException("Cannot create motor from null values");
    this.port = port;
    this.brick = brick;
    portAddress = (short)this.port.getPortAddress();
  }

  protected void update() {
    brick.getBrickPi3().get_motor_status(portAddress, motorState, motorPower, motorPosition, motorSpeed);
  }
  
  public int getState() {
    update();
    return brickpi.ucharp_value(motorState);
  }
  
  public int getPower() {
    update();
    return brickpi.charp_value(motorPower);
  }
  
  public int getPosition() {
    update();
    return brickpi.intp_value(motorPosition);
  }
  
  public int getSpeed() {
    update();
    return brickpi.shortp_value(motorSpeed);
  }

  public void setPower(byte power) {
    brick.getBrickPi3().set_motor_power(portAddress, power);
  }
  
  public void setPosition(int position) {
    brick.getBrickPi3().set_motor_position(portAddress, position);
  }
  
  public void setPositionRelative(int position) {
    brick.getBrickPi3().set_motor_position_relative(portAddress, position);
  }
  
  public void setSpeed(short degreePerSecond) {
    brick.getBrickPi3().set_motor_dps(portAddress, degreePerSecond);
  }
  
  
}
