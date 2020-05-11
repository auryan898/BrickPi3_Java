package com.brickpi3.java.hardware;

import com.brickpi3.java.sensor_infrared_t;

public class PiInfraredSensor extends PiBaseSensor {
  protected sensor_infrared_t device;

  public PiInfraredSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, new sensor_infrared_t());
    this.device = (sensor_infrared_t) sensorDevice;
  }

  public void setProximityMode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_EV3_INFRARED_PROXIMITY);
  }

  public void setRemoteMode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_EV3_INFRARED_REMOTE);
  }

  public void setSeekMode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_EV3_INFRARED_SEEK);
  }

  public byte[] getDistance() {
    super.update();
    return device.getDistance();
  }

  public byte[] getHeading() {
    super.update();
    return device.getHeading();
  }

  public short getProximity() {
    super.update();
    return device.getProximity();
  }

  public short[] getRemote() {
    super.update();
    return device.getRemote();
  }
}
