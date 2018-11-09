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
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class HandSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

    public WPI_TalonSRX rh = new WPI_TalonSRX(RobotMap.rightHandMotor);
    public WPI_TalonSRX lh = new WPI_TalonSRX(RobotMap.leftHandMotor);
    public WPI_TalonSRX w = new WPI_TalonSRX(RobotMap.wristMotor);



/* -- FOR LATER --
  public void arcade (double moveValue, double rotateValue)
  {
    tank(moveValue - rotateValue, moveValue + rotateValue);
  }
*/

    public void handShoot()
    {
      rh.set(1);
      lh.set(1);
    }

    public void handStop()
    {
      rh.set(0);
      lh.set(0);
    }

    public void handSuck()
    {
      rh.set(-1);
      lh.set(-1);
    }

    public void wristMove(double moveVal)
    {   
        w.set(moveVal);
    }



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
