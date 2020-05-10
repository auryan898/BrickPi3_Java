#!/bin/sh
swig -c++ -java -package com.brickpi3.java -outdir lib/com/brickpi3/java BrickPi3.i
g++ -c -fpic BrickPi3_wrap.cxx -I/usr/lib/jvm/jdk-8-oracle-arm32-vfp-hflt/include -I/usr/lib/jvm/jdk-8-oracle-arm32-vfp-hflt/include/linux
g++ -fpic -shared BrickPi3_wrap.o -o lib/libbrickpi.so
