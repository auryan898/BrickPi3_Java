package com.brickpi3.hardware;

import com.brickpi3.java.sensor_light_t;

public class PiNXTLightSensor extends PiBaseSensor {

  protected sensor_light_t device;

  public PiNXTLightSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, PiSensorType.SENSOR_TYPE_NXT_LIGHT_OFF, new sensor_light_t());
    device = (sensor_light_t) sensorDevice;
  }

  public void setLightOn() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_NXT_LIGHT_ON);
  }

  public void setLightOff() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_NXT_LIGHT_OFF);
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_light_t#getAmbient()
   */
  public short getAmbient() {
    super.update();
    return device.getAmbient();
  }
}
