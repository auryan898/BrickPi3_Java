package com.brickpi3.hardware;

import com.brickpi3.java.brickpiConstants;

public enum PiSensorType {
  SENSOR_TYPE_NONE,
  SENSOR_TYPE_I2C,
  SENSOR_TYPE_CUSTOM,
  SENSOR_TYPE_TOUCH,
  SENSOR_TYPE_TOUCH_NXT,
  SENSOR_TYPE_TOUCH_EV3,
  SENSOR_TYPE_NXT_LIGHT_ON,
  SENSOR_TYPE_NXT_LIGHT_OFF,
  SENSOR_TYPE_NXT_COLOR_RED,
  SENSOR_TYPE_NXT_COLOR_GREEN,
  SENSOR_TYPE_NXT_COLOR_BLUE,
  SENSOR_TYPE_NXT_COLOR_FULL,
  SENSOR_TYPE_NXT_COLOR_OFF,
  SENSOR_TYPE_NXT_ULTRASONIC,
  SENSOR_TYPE_EV3_GYRO_ABS,
  SENSOR_TYPE_EV3_GYRO_DPS,
  SENSOR_TYPE_EV3_GYRO_ABS_DPS,
  SENSOR_TYPE_EV3_COLOR_REFLECTED,
  SENSOR_TYPE_EV3_COLOR_AMBIENT,
  SENSOR_TYPE_EV3_COLOR_COLOR,
  SENSOR_TYPE_EV3_COLOR_RAW_REFLECTED,
  SENSOR_TYPE_EV3_COLOR_COLOR_COMPONENTS,
  SENSOR_TYPE_EV3_ULTRASONIC_CM,
  SENSOR_TYPE_EV3_ULTRASONIC_INCHES,
  SENSOR_TYPE_EV3_ULTRASONIC_LISTEN,
  SENSOR_TYPE_EV3_INFRARED_PROXIMITY,
  SENSOR_TYPE_EV3_INFRARED_SEEK,
  SENSOR_TYPE_EV3_INFRARED_REMOTE;

  public int getSensorTypeAddress() {
    switch (this) {
      case SENSOR_TYPE_NONE:
        return brickpiConstants.SENSOR_TYPE_NONE;
      case SENSOR_TYPE_I2C:
        return brickpiConstants.SENSOR_TYPE_I2C;
      case SENSOR_TYPE_CUSTOM:
        return brickpiConstants.SENSOR_TYPE_CUSTOM;
      case SENSOR_TYPE_TOUCH:
        return brickpiConstants.SENSOR_TYPE_TOUCH;
      case SENSOR_TYPE_TOUCH_NXT:
        return brickpiConstants.SENSOR_TYPE_TOUCH_NXT;
      case SENSOR_TYPE_TOUCH_EV3:
        return brickpiConstants.SENSOR_TYPE_TOUCH_EV3;
      case SENSOR_TYPE_NXT_LIGHT_ON:
        return brickpiConstants.SENSOR_TYPE_NXT_LIGHT_ON;
      case SENSOR_TYPE_NXT_LIGHT_OFF:
        return brickpiConstants.SENSOR_TYPE_NXT_LIGHT_OFF;
      case SENSOR_TYPE_NXT_COLOR_RED:
        return brickpiConstants.SENSOR_TYPE_NXT_COLOR_RED;
      case SENSOR_TYPE_NXT_COLOR_GREEN:
        return brickpiConstants.SENSOR_TYPE_NXT_COLOR_GREEN;
      case SENSOR_TYPE_NXT_COLOR_BLUE:
        return brickpiConstants.SENSOR_TYPE_NXT_COLOR_BLUE;
      case SENSOR_TYPE_NXT_COLOR_FULL:
        return brickpiConstants.SENSOR_TYPE_NXT_COLOR_FULL;
      case SENSOR_TYPE_NXT_COLOR_OFF:
        return brickpiConstants.SENSOR_TYPE_NXT_COLOR_OFF;
      case SENSOR_TYPE_NXT_ULTRASONIC:
        return brickpiConstants.SENSOR_TYPE_NXT_ULTRASONIC;
      case SENSOR_TYPE_EV3_GYRO_ABS:
        return brickpiConstants.SENSOR_TYPE_EV3_GYRO_ABS;
      case SENSOR_TYPE_EV3_GYRO_DPS:
        return brickpiConstants.SENSOR_TYPE_EV3_GYRO_DPS;
      case SENSOR_TYPE_EV3_GYRO_ABS_DPS:
        return brickpiConstants.SENSOR_TYPE_EV3_GYRO_ABS_DPS;
      case SENSOR_TYPE_EV3_COLOR_REFLECTED:
        return brickpiConstants.SENSOR_TYPE_EV3_COLOR_REFLECTED;
      case SENSOR_TYPE_EV3_COLOR_AMBIENT:
        return brickpiConstants.SENSOR_TYPE_EV3_COLOR_AMBIENT;
      case SENSOR_TYPE_EV3_COLOR_COLOR:
        return brickpiConstants.SENSOR_TYPE_EV3_COLOR_COLOR;
      case SENSOR_TYPE_EV3_COLOR_RAW_REFLECTED:
        return brickpiConstants.SENSOR_TYPE_EV3_COLOR_RAW_REFLECTED;
      case SENSOR_TYPE_EV3_COLOR_COLOR_COMPONENTS:
        return brickpiConstants.SENSOR_TYPE_EV3_COLOR_COLOR_COMPONENTS;
      case SENSOR_TYPE_EV3_ULTRASONIC_CM:
        return brickpiConstants.SENSOR_TYPE_EV3_ULTRASONIC_CM;
      case SENSOR_TYPE_EV3_ULTRASONIC_INCHES:
        return brickpiConstants.SENSOR_TYPE_EV3_ULTRASONIC_INCHES;
      case SENSOR_TYPE_EV3_ULTRASONIC_LISTEN:
        return brickpiConstants.SENSOR_TYPE_EV3_ULTRASONIC_LISTEN;
      case SENSOR_TYPE_EV3_INFRARED_PROXIMITY:
        return brickpiConstants.SENSOR_TYPE_EV3_INFRARED_PROXIMITY;
      case SENSOR_TYPE_EV3_INFRARED_SEEK:
        return brickpiConstants.SENSOR_TYPE_EV3_INFRARED_SEEK;
      case SENSOR_TYPE_EV3_INFRARED_REMOTE:
        return brickpiConstants.SENSOR_TYPE_EV3_INFRARED_REMOTE;
      default:
        return brickpiConstants.SENSOR_TYPE_NONE;
    }
  }
}
