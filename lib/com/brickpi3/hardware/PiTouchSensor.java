package com.brickpi3.hardware;

import com.brickpi3.java.SWIGTYPE_p_void;
import com.brickpi3.java.sensor_touch_t;

public class PiTouchSensor extends PiBaseSensor {

  sensor_touch_t device = new sensor_touch_t();
  private SWIGTYPE_p_void sensorPtr = new SWIGTYPE_p_void(device.getPointer(), false);

  public PiTouchSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, PiSensorType.SENSOR_TYPE_TOUCH);
  }

  public void update() {
    super.update(sensorPtr);
  }

}
