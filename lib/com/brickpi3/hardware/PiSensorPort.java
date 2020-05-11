package com.brickpi3.hardware;

import com.brickpi3.java.brickpiConstants;

public enum PiSensorPort {
  S1, S2, S3, S4;

  public int getAddress() {
    switch (this) {
      case S1:
        return brickpiConstants.PORT_1;
      case S2:
        return brickpiConstants.PORT_2;
      case S3:
        return brickpiConstants.PORT_3;
      case S4:
        return brickpiConstants.PORT_4;
      default:
        return -1;
    }
  }

  public String toString() {
    return "Port " + (this.ordinal() + 1);
  }
}