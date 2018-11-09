/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * An example command.  You can replace me with your own command.
 */
public class Hand extends Command {
  public Hand() {
    // Use requires() here to declare subsystem dependencies

    requires(Robot.m_handsubsystem);

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    //Hand Shoot
    if (Robot.m_oi.operatorStick.getRawButtonPressed(12))
    {
      Robot.m_handsubsystem.handShoot();
    } 
    else
    {
      Robot.m_handsubsystem.handStop();
    }

    //Hand Suck
    if (Robot.m_oi.operatorStick.getRawButtonPressed(11))
    {
      Robot.m_handsubsystem.handSuck();
    } 
    else
    {
      Robot.m_handsubsystem.handStop();
    }

    //Hand 
    Robot.m_handsubsystem.wristMove(Robot.m_oi.getOperatorY());


  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
