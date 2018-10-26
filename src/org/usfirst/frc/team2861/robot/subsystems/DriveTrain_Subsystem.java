package org.usfirst.frc.team2861.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2861.robot.RobotMap;
import org.usfirst.frc.team2861.robot.commands.TankDrive_Command;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;

/**
 *
 */   
@SuppressWarnings("deprecation")
public class DriveTrain_Subsystem extends Subsystem {
	
	///////////////////////////////////Robotdrive Values/////////////////////////////////////// 
	private RobotDrive robotDrive = new RobotDrive(RobotMap.Left_Motor, RobotMap.Right_Motor);
	private AnalogGyro gyroSensor = new AnalogGyro(RobotMap.Gyro);
	private Encoder leftEncoder = new Encoder(RobotMap.LeftEncoder_A, RobotMap.LeftEncoder_B);
	private Encoder rightEncoder = new Encoder(RobotMap.RightEncoder_A, RobotMap.RightEncoder_B);
	private Encoder auxEncoder = new Encoder(RobotMap.AuxEncoder_A, RobotMap.AuxEncoder_B);
	//private Ultrasonic leftUltrasonicSensor = new Ultrasonic(RobotMap.LeftUltrasonic, RobotMap.LeftUltrasonic);
    //private Ultrasonic rightUltrasonicSensor = new Ultrasonic(RobotMap.RightUltrasonic, RobotMap.RightUltrasonic);*/
	///////////////////////////////////////////////////////////////////////////////////////////
	
    public void initDefaultCommand() {
    	setDefaultCommand(new TankDrive_Command());
    }
    
    /////////////////////////////Drive Functions////////////////////////////////
    public void teleopDrive(Joystick leftJoystick, Joystick rightJoystick) {
    	robotDrive.tankDrive(-leftJoystick.getY(), -rightJoystick.getY()); }
    public void stop() {
    	robotDrive.tankDrive(0, 0); }
    ////////////////////////////////////////////////////////////////////////////
    
    ///////////////////////Encoder Functions/////////////////////////////
    public void resetLeftEncoder() { leftEncoder.reset(); }
    public void resetRightEncoder() { rightEncoder.reset(); }
    public void resetAuxEncoder() { auxEncoder.reset(); }
    public void distanceLeftEncoder() { leftEncoder.getDistance(); }
    public void distanceRightEncoder() { rightEncoder.getDistance(); }
    public void distanceAuxEncoder() { auxEncoder.getDistance(); }
    /////////////////////////////////////////////////////////////////////
    
    //////////////////////Gyro Functions///////////////////////
    public void initializeGyro() { gyroSensor.initGyro(); }
    public void resetGyro() { gyroSensor.reset(); }
    public void calibrateGyro() { gyroSensor.calibrate(); }
    public void getAngleGyro() { gyroSensor.getAngle(); }
    public void getCenterGyro() { gyroSensor.getCenter(); }
    public void getOffsetGyro() { gyroSensor.getOffset(); }
    public void getRateGyro() { gyroSensor.getRate(); }
    ////////////////////////////////////////////////////////////
    
    //////////////////////////Ultrasonic Functions///////////////////////////////////////
    /*public void getLeftSonicDist() { leftUltrasonicSensor.getDistanceUnits(); }
    public void getRightSonicDist() { rightUltrasonicSensor.getDistanceUnits(); }
    public void getLeftSonicRangeInches() { leftUltrasonicSensor.getRangeInches(); }
    public void getRightSonicRangeInches() { rightUltrasonicSensor.getRangeInches(); }
    public void pingLeftSonic() { leftUltrasonicSensor.ping(); }
    public void pingRightSonic() { rightUltrasonicSensor.ping(); }*/
    /////////////////////////////////////////////////////////////////////////////////////
}

