package com.brickpi3.java.hardware;

import com.brickpi3.java.sensor_touch_t;

public class PiTouchSensor extends PiBaseSensor {
  protected sensor_touch_t device;

  public PiTouchSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, PiSensorType.SENSOR_TYPE_TOUCH, new sensor_touch_t());
    this.device = (sensor_touch_t) sensorDevice;
  }
  
  public void setNXTMode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_TOUCH_NXT);
  }
  
  public void setEV3Mode() {
    super.setSensorType(PiSensorType.SENSOR_TYPE_TOUCH_EV3);
  }

  public boolean getPressed() {
    super.update();
    return device.getPressed();
  }
}
