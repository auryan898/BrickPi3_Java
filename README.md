# BrickPi3 Java

This project is the [BrickPi3 C++ drivers](https://github.com/DexterInd/BrickPi3/tree/master/Software/C) converted
to Java code built on a Raspberry Pi 3 B running [Raspbian for Robots](https://www.dexterindustries.com/raspberry-pi-robot-software/).  

You can find the original [BrickPi3 github repo here](https://github.com/DexterInd/BrickPi3).

Used [SWIG 4.0](http://www.swig.org/) to convert the code.

## Usage

Include the BrickPi3_Java.jar library into your project. It is runnable, 
and running it will copy the C++ driver library to `~/.brickpi3java/libbrickpi.so`
The following command can be used to ensure that it worked:
  
    java -Ddebug=true -jar BrickPi3_Java.jar
  
Note: if an `UnsatisfiedLinkError` occurs, then this is not compatible with your system 
(should only be Raspbian for Robots from Dexter Industries), or it can give an error if 
there is no BrickPi3 HAT attached to your Raspberry Pi: 

    detect error: get_manufacturer failed. Perhaps the BrickPi3 is not connected, or the address is incorrect.
