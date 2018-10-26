/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ExampleSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private DifferentialDrive drive;
  private SpeedControllerGroup r;
  private SpeedControllerGroup l;

  public WPI_TalonSRX r0, r1, l0, l1;  //declares 4 talons, Talons regulate voltage given to motor

  public void DriveTrain()
  {

    //Connecting each Talon to each Drive Motor
    this.r0 = new WPI_TalonSRX(RobotMap.rightDriveMotorOne);   
    this.r1 = new WPI_TalonSRX(RobotMap.rightDriveMotorTwo);
    this.l0 = new WPI_TalonSRX(RobotMap.leftDriveMotorOne);
    this.l1 = new WPI_TalonSRX(RobotMap.leftDriveMotorTwo);


    this.r = new SpeedControllerGroup(r0, r1);
    this.l = new SpeedControllerGroup(l0, l1);

    r1.follow(r0);    //Set motor to match another motor
    l1.follow(l0);

    this.r.setInverted(false);
    this.l.setInverted(false);

    this.drive = new DifferentialDrive(l0,r0);


  }
/* -- FOR LATER --
  public void arcade (double moveValue, double rotateValue)
  {
    tank(moveValue - rotateValue, moveValue + rotateValue);
  }
*/

// Y value (forward backward), Z value (rotate)
  public void arcadeNoConstants(double moveValue, double rotateValue)   
  {
    drive.arcadeDrive(moveValue, rotateValue);

  }




  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
