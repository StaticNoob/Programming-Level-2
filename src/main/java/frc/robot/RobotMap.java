/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //Designated numbering

  //      DRIVETRAIN MOTORS
  public final static int leftDriveMotorOne = 3;
  public final static int leftDriveMotorTwo = 2;
  public final static int rightDriveMotorOne = 1;
  public final static int rightDriveMotorTwo = 0;


  //     PICK-UP MOTORS
  public final static int rightHandMotor = 6;
  public final static int leftHandMotor = 7;
  public final static int wristMotor = 9;


  //     PNEUMATICS  
  public final static int handRotatorSolenoidChannelIn = 0; 
  public final static int handRotatorSolenoidChannelOut = 1; 
  public final static int pcmID = 61; 


  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;




}
