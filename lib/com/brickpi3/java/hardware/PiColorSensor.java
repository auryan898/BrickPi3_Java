package com.brickpi3.java.hardware;

import com.brickpi3.java.SWIG;
import com.brickpi3.java.sensor_color_t;

public class PiColorSensor extends PiBaseSensor {

  protected sensor_color_t device;

  public PiColorSensor(PiBrick brick, PiSensorPort port) {
    super(brick, port, new sensor_color_t());
    device = (sensor_color_t) sensorDevice;
  }

  public void setEV3AmbientMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_COLOR_AMBIENT);
  }

  public void setEV3ColorMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_COLOR_COLOR);
  }

  public void setEV3ColorComponentMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_COLOR_COLOR_COMPONENTS);
  }

  public void setEV3RawReflectedMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_COLOR_RAW_REFLECTED);
  }

  public void setEV3ReflectedMode() {
    setSensorType(PiSensorType.SENSOR_TYPE_EV3_COLOR_REFLECTED);
  }

  public void setNXTRedOn() {
    setSensorType(PiSensorType.SENSOR_TYPE_NXT_COLOR_RED);
  }

  public void setNXTBlueOn() {
    setSensorType(PiSensorType.SENSOR_TYPE_NXT_COLOR_BLUE);
  }

  public void setNXTGreenOn() {
    setSensorType(PiSensorType.SENSOR_TYPE_NXT_COLOR_GREEN);
  }

  public void setNXTAllOn() {
    setSensorType(PiSensorType.SENSOR_TYPE_NXT_COLOR_FULL);
  }

  public void setNXTOff() {
    setSensorType(PiSensorType.SENSOR_TYPE_NXT_COLOR_OFF);
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_color_t#getColor()
   */
  public byte getColor() {
    super.update();
    return device.getColor();
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_color_t#getReflected_red()
   */
  public short getReflected_red() {
    super.update();
    return device.getReflected_red();
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_color_t#getReflected_green()
   */
  public short getReflected_green() {
    super.update();
    return device.getReflected_green();
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_color_t#getReflected_blue()
   */
  public short getReflected_blue() {
    super.update();
    return device.getReflected_blue();
  }

  /**
   * @return
   * @see    com.brickpi3.java.sensor_color_t#getAmbient()
   */
  public short getAmbient() {
    super.update();
    return device.getAmbient();
  }

}
