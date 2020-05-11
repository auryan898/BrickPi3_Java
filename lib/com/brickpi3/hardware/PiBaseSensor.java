package com.brickpi3.hardware;

import com.brickpi3.java.SWIGTYPE_p_void;

public abstract class PiBaseSensor {
  protected PiSensorPort port;
  protected PiBrick brick;
  protected PiSensorType sensorType;
  protected short portAddress;

  public PiBaseSensor(PiBrick brick, PiSensorPort port, PiSensorType sensorType) {
    this(brick, port);
    this.setSensorType(sensorType);
  }

  public PiBaseSensor(PiBrick brick, PiSensorPort port) {
    this.port = port;
    this.brick = brick;
    this.portAddress = (short) port.getAddress();
  }

  protected void update(SWIGTYPE_p_void sensorPtr) {
    brick.getBrickPi3().get_sensor(portAddress, sensorPtr);
  }

  void setSensorType(PiSensorType sensorType) {
    this.sensorType = sensorType;
  }
}
