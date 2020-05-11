package com.brickpi3.hardware;

import com.brickpi3.java.sensor_gyro_t;

public class PiGyroSensor extends PiBaseSensor {

  protected sensor_gyro_t device;

  public PiGyroSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, new sensor_gyro_t());
    device = (sensor_gyro_t) sensorDevice;
  }

  public void setAbsMode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_EV3_GYRO_ABS);
  }

  public void setDpsMode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_EV3_GYRO_DPS);
  }

  public void setAbsDpsMode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_EV3_GYRO_ABS_DPS);
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_gyro_t#getAbs()
   */
  public short getAbs() {
    super.update();
    return device.getAbs();
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_gyro_t#getDps()
   */
  public short getDps() {
    super.update();
    return device.getDps();
  }

}
