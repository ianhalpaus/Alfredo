/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2861.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	////////////PWM//////////////////
	public static int
		Left_Motor = 0,
		Right_Motor = 1,
		Aux_Motor = 2,
		Left_Servo = 3,
		Right_Servo = 4;
	/////////////////////////////////
	
	///////////DIO///////////////////
	public static int
		LeftEncoder_A = 0,
		LeftEncoder_B = 1,
		RightEncoder_A = 2,
		RightEncoder_B = 3,
		AuxEncoder_A = 4,
		AuxEncoder_B = 5,
		Gyro = 6,
		LimitSwitch = 7,
		LeftUltrasonic = 8,
		RightUltrasonic = 9;
	/////////////////////////////////
	
	
}
