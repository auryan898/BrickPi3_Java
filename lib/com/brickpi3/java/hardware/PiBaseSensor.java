package com.brickpi3.java.hardware;

import com.brickpi3.java.SWIG;
import com.brickpi3.java.brickpiJNI;

public abstract class PiBaseSensor {
  protected PiSensorPort port;
  protected PiBrick brick;
  protected PiSensorType sensorType;
  protected short portAddress;
  protected SWIG sensorDevice;

  public PiBaseSensor(PiBrick brick, PiSensorPort port, PiSensorType sensorType, SWIG sensorDevice) {
    this(brick, port, sensorDevice);
    this.setSensorType(sensorType);
  }

  public PiBaseSensor(PiBrick brick, PiSensorPort port, SWIG sensorDevice) {
    this.sensorDevice = sensorDevice;
    this.port = port;
    this.brick = brick;
    this.portAddress = (short) port.getAddress();
    this.setSensorType(PiSensorType.SENSOR_TYPE_NONE);
  }

  protected int update() {
    if (sensorType == PiSensorType.SENSOR_TYPE_NONE) {
      throw new RuntimeException("Error: Sensor mode has not been initialized prior to usage");
    }
    return brick.getBrickPi3().get_sensor(portAddress, brickpiJNI.swigToVoidPtr(sensorDevice));
  }

  void setSensorType(PiSensorType sensorType) {
    this.sensorType = sensorType;
    brick.getBrickPi3().set_sensor_type(portAddress, (short) sensorType.getSensorTypeAddress());
  }
}
