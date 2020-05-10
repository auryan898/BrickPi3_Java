/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brickpi3.java;

public class brickpiJNI {

  static {
    com.brickpi3.java.LibraryExtractionHelper.loadBrickPiLibrary();
  }

  public final static native String FIRMWARE_VERSION_REQUIRED_get();
  public final static native int LONGEST_SPI_TRANSFER_get();
  public final static native int LONGEST_I2C_TRANSFER_get();
  public final static native int SPI_TARGET_SPEED_get();
  public final static native String SPIDEV_FILE_NAME_get();
  public final static native int ERROR_NONE_get();
  public final static native int ERROR_SPI_FILE_get();
  public final static native int ERROR_SPI_RESPONSE_get();
  public final static native int ERROR_WRONG_MANUFACTURER_get();
  public final static native int ERROR_WRONG_DEVICE_get();
  public final static native int ERROR_FIRMWARE_MISMATCH_get();
  public final static native int ERROR_SENSOR_TYPE_MISMATCH_get();
  public final static native void spi_file_handle_set(int jarg1);
  public final static native int spi_file_handle_get();
  public final static native void spi_xfer_struct_set(long jarg1);
  public final static native long spi_xfer_struct_get();
  public final static native void spi_array_out_set(short[] jarg1);
  public final static native short[] spi_array_out_get();
  public final static native void spi_array_in_set(short[] jarg1);
  public final static native short[] spi_array_in_get();
  public final static native int spi_setup();
  public final static native int spi_transfer_array(short jarg1, long jarg2, long jarg3);
  public final static native void fatal_error__SWIG_0(String jarg1);
  public final static native int BPSPI_MESSAGE_NONE_get();
  public final static native int BPSPI_MESSAGE_GET_MANUFACTURER_get();
  public final static native int BPSPI_MESSAGE_GET_NAME_get();
  public final static native int BPSPI_MESSAGE_GET_HARDWARE_VERSION_get();
  public final static native int BPSPI_MESSAGE_GET_FIRMWARE_VERSION_get();
  public final static native int BPSPI_MESSAGE_GET_ID_get();
  public final static native int BPSPI_MESSAGE_SET_LED_get();
  public final static native int BPSPI_MESSAGE_GET_VOLTAGE_3V3_get();
  public final static native int BPSPI_MESSAGE_GET_VOLTAGE_5V_get();
  public final static native int BPSPI_MESSAGE_GET_VOLTAGE_9V_get();
  public final static native int BPSPI_MESSAGE_GET_VOLTAGE_VCC_get();
  public final static native int BPSPI_MESSAGE_SET_ADDRESS_get();
  public final static native int BPSPI_MESSAGE_SET_SENSOR_TYPE_get();
  public final static native int BPSPI_MESSAGE_GET_SENSOR_1_get();
  public final static native int BPSPI_MESSAGE_GET_SENSOR_2_get();
  public final static native int BPSPI_MESSAGE_GET_SENSOR_3_get();
  public final static native int BPSPI_MESSAGE_GET_SENSOR_4_get();
  public final static native int BPSPI_MESSAGE_I2C_TRANSACT_1_get();
  public final static native int BPSPI_MESSAGE_I2C_TRANSACT_2_get();
  public final static native int BPSPI_MESSAGE_I2C_TRANSACT_3_get();
  public final static native int BPSPI_MESSAGE_I2C_TRANSACT_4_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_POWER_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_POSITION_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_POSITION_KP_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_POSITION_KD_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_DPS_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_DPS_KP_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_DPS_KD_get();
  public final static native int BPSPI_MESSAGE_SET_MOTOR_LIMITS_get();
  public final static native int BPSPI_MESSAGE_OFFSET_MOTOR_ENCODER_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_A_ENCODER_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_B_ENCODER_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_C_ENCODER_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_D_ENCODER_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_A_STATUS_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_B_STATUS_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_C_STATUS_get();
  public final static native int BPSPI_MESSAGE_GET_MOTOR_D_STATUS_get();
  public final static native int SENSOR_TYPE_NONE_get();
  public final static native int SENSOR_TYPE_I2C_get();
  public final static native int SENSOR_TYPE_CUSTOM_get();
  public final static native int SENSOR_TYPE_TOUCH_get();
  public final static native int SENSOR_TYPE_TOUCH_NXT_get();
  public final static native int SENSOR_TYPE_TOUCH_EV3_get();
  public final static native int SENSOR_TYPE_NXT_LIGHT_ON_get();
  public final static native int SENSOR_TYPE_NXT_LIGHT_OFF_get();
  public final static native int SENSOR_TYPE_NXT_COLOR_RED_get();
  public final static native int SENSOR_TYPE_NXT_COLOR_GREEN_get();
  public final static native int SENSOR_TYPE_NXT_COLOR_BLUE_get();
  public final static native int SENSOR_TYPE_NXT_COLOR_FULL_get();
  public final static native int SENSOR_TYPE_NXT_COLOR_OFF_get();
  public final static native int SENSOR_TYPE_NXT_ULTRASONIC_get();
  public final static native int SENSOR_TYPE_EV3_GYRO_ABS_get();
  public final static native int SENSOR_TYPE_EV3_GYRO_DPS_get();
  public final static native int SENSOR_TYPE_EV3_GYRO_ABS_DPS_get();
  public final static native int SENSOR_TYPE_EV3_COLOR_REFLECTED_get();
  public final static native int SENSOR_TYPE_EV3_COLOR_AMBIENT_get();
  public final static native int SENSOR_TYPE_EV3_COLOR_COLOR_get();
  public final static native int SENSOR_TYPE_EV3_COLOR_RAW_REFLECTED_get();
  public final static native int SENSOR_TYPE_EV3_COLOR_COLOR_COMPONENTS_get();
  public final static native int SENSOR_TYPE_EV3_ULTRASONIC_CM_get();
  public final static native int SENSOR_TYPE_EV3_ULTRASONIC_INCHES_get();
  public final static native int SENSOR_TYPE_EV3_ULTRASONIC_LISTEN_get();
  public final static native int SENSOR_TYPE_EV3_INFRARED_PROXIMITY_get();
  public final static native int SENSOR_TYPE_EV3_INFRARED_SEEK_get();
  public final static native int SENSOR_TYPE_EV3_INFRARED_REMOTE_get();
  public final static native int SENSOR_STATE_VALID_DATA_get();
  public final static native int SENSOR_STATE_NOT_CONFIGURED_get();
  public final static native int SENSOR_STATE_CONFIGURING_get();
  public final static native int SENSOR_STATE_NO_DATA_get();
  public final static native int SENSOR_STATE_I2C_ERROR_get();
  public final static native int SENSOR_CONFIG_I2C_MID_CLOCK_get();
  public final static native int SENSOR_CONFIG_PIN_1_PULL_get();
  public final static native int SENSOR_CONFIG_I2C_REPEAT_get();
  public final static native int SENSOR_CONFIG_PIN_5_DIR_get();
  public final static native int SENSOR_CONFIG_PIN_5_STATE_get();
  public final static native int SENSOR_CONFIG_PIN_6_DIR_get();
  public final static native int SENSOR_CONFIG_PIN_6_STATE_get();
  public final static native int SENSOR_CONFIG_REPORT_1_ADC_get();
  public final static native int SENSOR_CONFIG_REPORT_6_ADC_get();
  public final static native int PORT_1_get();
  public final static native int PORT_2_get();
  public final static native int PORT_3_get();
  public final static native int PORT_4_get();
  public final static native int PORT_A_get();
  public final static native int PORT_B_get();
  public final static native int PORT_C_get();
  public final static native int PORT_D_get();
  public final static native int MOTOR_FLOAT_get();
  public final static native int REMOTE_BIT_RED_UP_get();
  public final static native int REMOTE_BIT_RED_DOWN_get();
  public final static native int REMOTE_BIT_BLUE_UP_get();
  public final static native int REMOTE_BIT_BLUE_DOWN_get();
  public final static native int REMOTE_BIT_BROADCAST_get();
  public final static native void i2c_struct_t_speed_set(long jarg1, i2c_struct_t jarg1_, short jarg2);
  public final static native short i2c_struct_t_speed_get(long jarg1, i2c_struct_t jarg1_);
  public final static native void i2c_struct_t_delay_set(long jarg1, i2c_struct_t jarg1_, short jarg2);
  public final static native short i2c_struct_t_delay_get(long jarg1, i2c_struct_t jarg1_);
  public final static native void i2c_struct_t_address_set(long jarg1, i2c_struct_t jarg1_, short jarg2);
  public final static native short i2c_struct_t_address_get(long jarg1, i2c_struct_t jarg1_);
  public final static native void i2c_struct_t_length_write_set(long jarg1, i2c_struct_t jarg1_, short jarg2);
  public final static native short i2c_struct_t_length_write_get(long jarg1, i2c_struct_t jarg1_);
  public final static native void i2c_struct_t_buffer_write_set(long jarg1, i2c_struct_t jarg1_, short[] jarg2);
  public final static native short[] i2c_struct_t_buffer_write_get(long jarg1, i2c_struct_t jarg1_);
  public final static native void i2c_struct_t_length_read_set(long jarg1, i2c_struct_t jarg1_, short jarg2);
  public final static native short i2c_struct_t_length_read_get(long jarg1, i2c_struct_t jarg1_);
  public final static native void i2c_struct_t_buffer_read_set(long jarg1, i2c_struct_t jarg1_, short[] jarg2);
  public final static native short[] i2c_struct_t_buffer_read_get(long jarg1, i2c_struct_t jarg1_);
  public final static native long new_i2c_struct_t();
  public final static native void delete_i2c_struct_t(long jarg1);
  public final static native void sensor_custom_t_adc1_set(long jarg1, sensor_custom_t jarg1_, int jarg2);
  public final static native int sensor_custom_t_adc1_get(long jarg1, sensor_custom_t jarg1_);
  public final static native void sensor_custom_t_adc6_set(long jarg1, sensor_custom_t jarg1_, int jarg2);
  public final static native int sensor_custom_t_adc6_get(long jarg1, sensor_custom_t jarg1_);
  public final static native void sensor_custom_t_pin5_set(long jarg1, sensor_custom_t jarg1_, boolean jarg2);
  public final static native boolean sensor_custom_t_pin5_get(long jarg1, sensor_custom_t jarg1_);
  public final static native void sensor_custom_t_pin6_set(long jarg1, sensor_custom_t jarg1_, boolean jarg2);
  public final static native boolean sensor_custom_t_pin6_get(long jarg1, sensor_custom_t jarg1_);
  public final static native long new_sensor_custom_t();
  public final static native void delete_sensor_custom_t(long jarg1);
  public final static native void sensor_touch_t_pressed_set(long jarg1, sensor_touch_t jarg1_, boolean jarg2);
  public final static native boolean sensor_touch_t_pressed_get(long jarg1, sensor_touch_t jarg1_);
  public final static native long new_sensor_touch_t();
  public final static native void delete_sensor_touch_t(long jarg1);
  public final static native void sensor_light_t_ambient_set(long jarg1, sensor_light_t jarg1_, short jarg2);
  public final static native short sensor_light_t_ambient_get(long jarg1, sensor_light_t jarg1_);
  public final static native void sensor_light_t_reflected_set(long jarg1, sensor_light_t jarg1_, short jarg2);
  public final static native short sensor_light_t_reflected_get(long jarg1, sensor_light_t jarg1_);
  public final static native long new_sensor_light_t();
  public final static native void delete_sensor_light_t(long jarg1);
  public final static native void sensor_color_t_color_set(long jarg1, sensor_color_t jarg1_, byte jarg2);
  public final static native byte sensor_color_t_color_get(long jarg1, sensor_color_t jarg1_);
  public final static native void sensor_color_t_reflected_red_set(long jarg1, sensor_color_t jarg1_, short jarg2);
  public final static native short sensor_color_t_reflected_red_get(long jarg1, sensor_color_t jarg1_);
  public final static native void sensor_color_t_reflected_green_set(long jarg1, sensor_color_t jarg1_, short jarg2);
  public final static native short sensor_color_t_reflected_green_get(long jarg1, sensor_color_t jarg1_);
  public final static native void sensor_color_t_reflected_blue_set(long jarg1, sensor_color_t jarg1_, short jarg2);
  public final static native short sensor_color_t_reflected_blue_get(long jarg1, sensor_color_t jarg1_);
  public final static native void sensor_color_t_ambient_set(long jarg1, sensor_color_t jarg1_, short jarg2);
  public final static native short sensor_color_t_ambient_get(long jarg1, sensor_color_t jarg1_);
  public final static native long new_sensor_color_t();
  public final static native void delete_sensor_color_t(long jarg1);
  public final static native void sensor_ultrasonic_t_cm_set(long jarg1, sensor_ultrasonic_t jarg1_, float jarg2);
  public final static native float sensor_ultrasonic_t_cm_get(long jarg1, sensor_ultrasonic_t jarg1_);
  public final static native void sensor_ultrasonic_t_inch_set(long jarg1, sensor_ultrasonic_t jarg1_, float jarg2);
  public final static native float sensor_ultrasonic_t_inch_get(long jarg1, sensor_ultrasonic_t jarg1_);
  public final static native void sensor_ultrasonic_t_presence_set(long jarg1, sensor_ultrasonic_t jarg1_, boolean jarg2);
  public final static native boolean sensor_ultrasonic_t_presence_get(long jarg1, sensor_ultrasonic_t jarg1_);
  public final static native long new_sensor_ultrasonic_t();
  public final static native void delete_sensor_ultrasonic_t(long jarg1);
  public final static native void sensor_gyro_t_abs_set(long jarg1, sensor_gyro_t jarg1_, short jarg2);
  public final static native short sensor_gyro_t_abs_get(long jarg1, sensor_gyro_t jarg1_);
  public final static native void sensor_gyro_t_dps_set(long jarg1, sensor_gyro_t jarg1_, short jarg2);
  public final static native short sensor_gyro_t_dps_get(long jarg1, sensor_gyro_t jarg1_);
  public final static native long new_sensor_gyro_t();
  public final static native void delete_sensor_gyro_t(long jarg1);
  public final static native void sensor_infrared_t_proximity_set(long jarg1, sensor_infrared_t jarg1_, short jarg2);
  public final static native short sensor_infrared_t_proximity_get(long jarg1, sensor_infrared_t jarg1_);
  public final static native void sensor_infrared_t_distance_set(long jarg1, sensor_infrared_t jarg1_, byte[] jarg2);
  public final static native byte[] sensor_infrared_t_distance_get(long jarg1, sensor_infrared_t jarg1_);
  public final static native void sensor_infrared_t_heading_set(long jarg1, sensor_infrared_t jarg1_, byte[] jarg2);
  public final static native byte[] sensor_infrared_t_heading_get(long jarg1, sensor_infrared_t jarg1_);
  public final static native void sensor_infrared_t_remote_set(long jarg1, sensor_infrared_t jarg1_, short[] jarg2);
  public final static native short[] sensor_infrared_t_remote_get(long jarg1, sensor_infrared_t jarg1_);
  public final static native long new_sensor_infrared_t();
  public final static native void delete_sensor_infrared_t(long jarg1);
  public final static native int BrickPi3_set_address(int jarg1, String jarg2);
  public final static native long new_BrickPi3__SWIG_0(short jarg1);
  public final static native long new_BrickPi3__SWIG_1();
  public final static native int BrickPi3_detect__SWIG_0(long jarg1, BrickPi3 jarg1_, boolean jarg2);
  public final static native int BrickPi3_detect__SWIG_1(long jarg1, BrickPi3 jarg1_);
  public final static native int BrickPi3_get_manufacturer(long jarg1, BrickPi3 jarg1_, byte[] jarg2);
  public final static native int BrickPi3_get_board(long jarg1, BrickPi3 jarg1_, byte[] jarg2);
  public final static native int BrickPi3_get_version_hardware(long jarg1, BrickPi3 jarg1_, byte[] jarg2);
  public final static native int BrickPi3_get_version_firmware(long jarg1, BrickPi3 jarg1_, byte[] jarg2);
  public final static native int BrickPi3_get_id(long jarg1, BrickPi3 jarg1_, byte[] jarg2);
  public final static native int BrickPi3_set_led(long jarg1, BrickPi3 jarg1_, short jarg2);
  public final static native float BrickPi3_get_voltage_3v3__SWIG_0(long jarg1, BrickPi3 jarg1_);
  public final static native float BrickPi3_get_voltage_5v__SWIG_0(long jarg1, BrickPi3 jarg1_);
  public final static native float BrickPi3_get_voltage_9v__SWIG_0(long jarg1, BrickPi3 jarg1_);
  public final static native float BrickPi3_get_voltage_battery__SWIG_0(long jarg1, BrickPi3 jarg1_);
  public final static native int BrickPi3_get_voltage_3v3__SWIG_1(long jarg1, BrickPi3 jarg1_, long jarg2);
  public final static native int BrickPi3_get_voltage_5v__SWIG_1(long jarg1, BrickPi3 jarg1_, long jarg2);
  public final static native int BrickPi3_get_voltage_9v__SWIG_1(long jarg1, BrickPi3 jarg1_, long jarg2);
  public final static native int BrickPi3_get_voltage_battery__SWIG_1(long jarg1, BrickPi3 jarg1_, long jarg2);
  public final static native int BrickPi3_set_sensor_type__SWIG_0(long jarg1, BrickPi3 jarg1_, short jarg2, short jarg3, int jarg4, long jarg5, i2c_struct_t jarg5_);
  public final static native int BrickPi3_set_sensor_type__SWIG_1(long jarg1, BrickPi3 jarg1_, short jarg2, short jarg3, int jarg4);
  public final static native int BrickPi3_set_sensor_type__SWIG_2(long jarg1, BrickPi3 jarg1_, short jarg2, short jarg3);
  public final static native int BrickPi3_transact_i2c(long jarg1, BrickPi3 jarg1_, short jarg2, long jarg3, i2c_struct_t jarg3_);
  public final static native int BrickPi3_get_sensor(long jarg1, BrickPi3 jarg1_, short jarg2, long jarg3);
  public final static native int BrickPi3_set_motor_power(long jarg1, BrickPi3 jarg1_, short jarg2, byte jarg3);
  public final static native int BrickPi3_set_motor_position(long jarg1, BrickPi3 jarg1_, short jarg2, int jarg3);
  public final static native int BrickPi3_set_motor_position_relative(long jarg1, BrickPi3 jarg1_, short jarg2, int jarg3);
  public final static native int BrickPi3_set_motor_dps(long jarg1, BrickPi3 jarg1_, short jarg2, short jarg3);
  public final static native int BrickPi3_set_motor_limits(long jarg1, BrickPi3 jarg1_, short jarg2, short jarg3, int jarg4);
  public final static native int BrickPi3_get_motor_status(long jarg1, BrickPi3 jarg1_, short jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native int BrickPi3_offset_motor_encoder(long jarg1, BrickPi3 jarg1_, short jarg2, int jarg3);
  public final static native int BrickPi3_reset_motor_encoder__SWIG_0(long jarg1, BrickPi3 jarg1_, short jarg2, long jarg3);
  public final static native int BrickPi3_reset_motor_encoder__SWIG_1(long jarg1, BrickPi3 jarg1_, short jarg2);
  public final static native int BrickPi3_set_motor_encoder(long jarg1, BrickPi3 jarg1_, short jarg2, int jarg3);
  public final static native int BrickPi3_get_motor_encoder__SWIG_0(long jarg1, BrickPi3 jarg1_, short jarg2, long jarg3);
  public final static native int BrickPi3_get_motor_encoder__SWIG_1(long jarg1, BrickPi3 jarg1_, short jarg2);
  public final static native int BrickPi3_reset_all(long jarg1, BrickPi3 jarg1_);
  public final static native void delete_BrickPi3(long jarg1);
  public final static native long new_floatp();
  public final static native long copy_floatp(float jarg1);
  public final static native void delete_floatp(long jarg1);
  public final static native void floatp_assign(long jarg1, float jarg2);
  public final static native float floatp_value(long jarg1);
  public final static native long new_shortp();
  public final static native long copy_shortp(short jarg1);
  public final static native void delete_shortp(long jarg1);
  public final static native void shortp_assign(long jarg1, short jarg2);
  public final static native short shortp_value(long jarg1);
  public final static native long new_longp();
  public final static native long copy_longp(int jarg1);
  public final static native void delete_longp(long jarg1);
  public final static native void longp_assign(long jarg1, int jarg2);
  public final static native int longp_value(long jarg1);
  public final static native long new_intp();
  public final static native long copy_intp(int jarg1);
  public final static native void delete_intp(long jarg1);
  public final static native void intp_assign(long jarg1, int jarg2);
  public final static native int intp_value(long jarg1);
  public final static native long new_int16_tp();
  public final static native long copy_int16_tp(short jarg1);
  public final static native void delete_int16_tp(long jarg1);
  public final static native void int16_tp_assign(long jarg1, short jarg2);
  public final static native short int16_tp_value(long jarg1);
  public final static native long new_int32_tp();
  public final static native long copy_int32_tp(int jarg1);
  public final static native void delete_int32_tp(long jarg1);
  public final static native void int32_tp_assign(long jarg1, int jarg2);
  public final static native int int32_tp_value(long jarg1);
  public final static native long new_int8_tp();
  public final static native long copy_int8_tp(byte jarg1);
  public final static native void delete_int8_tp(long jarg1);
  public final static native void int8_tp_assign(long jarg1, byte jarg2);
  public final static native byte int8_tp_value(long jarg1);
  public final static native long new_uint16_tp();
  public final static native long copy_uint16_tp(int jarg1);
  public final static native void delete_uint16_tp(long jarg1);
  public final static native void uint16_tp_assign(long jarg1, int jarg2);
  public final static native int uint16_tp_value(long jarg1);
  public final static native long new_uint8_tp();
  public final static native long copy_uint8_tp(short jarg1);
  public final static native void delete_uint8_tp(long jarg1);
  public final static native void uint8_tp_assign(long jarg1, short jarg2);
  public final static native short uint8_tp_value(long jarg1);
  public final static native long new_spi_ioc_transferp();
  public final static native long copy_spi_ioc_transferp(long jarg1);
  public final static native void delete_spi_ioc_transferp(long jarg1);
  public final static native void spi_ioc_transferp_assign(long jarg1, long jarg2);
  public final static native long spi_ioc_transferp_value(long jarg1);
}
