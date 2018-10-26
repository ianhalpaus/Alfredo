/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2861.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//////////////////Main Joysticks////////////////////////
	Joystick leftJoystick = new Joystick(0);
	Joystick rightJoystick = new Joystick(1);
	////////////////////////////////////////////////////////
	
	/////////////////Left Joystick Buttons///////////////////////
	Button leftButton0 = new JoystickButton(leftJoystick, 0);
	Button leftButton1 = new JoystickButton(leftJoystick, 1);
	Button leftButton2 = new JoystickButton(leftJoystick, 2);
	Button leftButton3 = new JoystickButton(leftJoystick, 3);
	Button leftButton4 = new JoystickButton(leftJoystick, 4);
	Button leftButton5 = new JoystickButton(leftJoystick, 5);
	Button leftButton6 = new JoystickButton(leftJoystick, 6);
	Button leftButton7 = new JoystickButton(leftJoystick, 7);
	Button leftButton8 = new JoystickButton(leftJoystick, 8);
	Button leftButton9 = new JoystickButton(leftJoystick, 9);
	Button leftButton10 = new JoystickButton(leftJoystick, 10);
	Button leftButton11 = new JoystickButton(leftJoystick, 11);
	Button leftButton12 = new JoystickButton(leftJoystick, 12);
	/////////////////////////////////////////////////////////////
	
	/////////////////Right Joystick Buttons///////////////////////
	Button rightButton0 = new JoystickButton(rightJoystick, 0);
	Button rightButton1 = new JoystickButton(rightJoystick, 1);
	Button rightButton2 = new JoystickButton(rightJoystick, 2);
	Button rightButton3 = new JoystickButton(rightJoystick, 3);
	Button rightButton4 = new JoystickButton(rightJoystick, 4);
	Button rightButton5 = new JoystickButton(rightJoystick, 5);
	Button rightButton6 = new JoystickButton(rightJoystick, 6);
	Button rightButton7 = new JoystickButton(rightJoystick, 7);
	Button rightButton8 = new JoystickButton(rightJoystick, 8);
	Button rightButton9 = new JoystickButton(rightJoystick, 9);
	Button rightButton10 = new JoystickButton(rightJoystick, 10);
	Button rightButton11 = new JoystickButton(rightJoystick, 11);
	Button rightButton12 = new JoystickButton(rightJoystick, 12);
	//////////////////////////////////////////////////////////////
	
	
	
	public OI() {
		
	}
	/////////////////////Initialize Joysticks////////////////////////
	public Joystick getLeftJoystick() { return leftJoystick; }
	public Joystick getRightJoystick() { return rightJoystick; }
	/////////////////////////////////////////////////////////////////
	

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:
	
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
