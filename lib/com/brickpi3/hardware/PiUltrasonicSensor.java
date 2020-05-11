package com.brickpi3.hardware;

import com.brickpi3.java.sensor_ultrasonic_t;

public class PiUltrasonicSensor extends PiBaseSensor {

  protected sensor_ultrasonic_t device;

  public PiUltrasonicSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, new sensor_ultrasonic_t());
    device = (sensor_ultrasonic_t) sensorDevice;
  }
  
  public void setCentimeterMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_ULTRASONIC_CM);
  }
  
  public void setInchMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_ULTRASONIC_INCHES);
  }
  
  public void setListenMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_ULTRASONIC_LISTEN);
  }
  
  public void setNXTMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_NXT_ULTRASONIC);
  }

  /**
   * @return
   * @see com.brickpi3.java.sensor_ultrasonic_t#getCm()
   */
  public float getCm() {
    super.update();
    return device.getCm();
  }

  /**
   * @return
   * @see com.brickpi3.java.sensor_ultrasonic_t#getInch()
   */
  public float getInch() {
    super.update();
    return device.getInch();
  }

  /**
   * @return
   * @see com.brickpi3.java.sensor_ultrasonic_t#getPresence()
   */
  public boolean getPresence() {
    super.update();
    return device.getPresence();
  }
}
