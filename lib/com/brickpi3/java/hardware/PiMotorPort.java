package com.brickpi3.java.hardware;

import com.brickpi3.java.brickpiConstants;

public enum PiMotorPort {
  A, B, C, D;

  public int getPortAddress() {
    switch (this) {
      case A:
        return brickpiConstants.PORT_A;
      case B:
        return brickpiConstants.PORT_B;
      case C:
        return brickpiConstants.PORT_C;
      case D:
        return brickpiConstants.PORT_D;
      default:
        return -1;
    }
  }

  public String toString() {
    return "Port " + this.name();
  }
}
