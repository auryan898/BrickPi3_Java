package com.brickpi3.hardware;

import com.brickpi3.java.sensor_touch_t;

public class PiTouchSensor extends PiBaseSensor {

  private sensor_touch_t device;

  public PiTouchSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, PiSensorType.SENSOR_TYPE_TOUCH, new sensor_touch_t());
    this.device = (sensor_touch_t)sensorDevice;
  }
  
  public boolean getPressed() {
    return device.getPressed();
  }
}
