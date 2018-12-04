/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class HandSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

    public WPI_TalonSRX rh;
    public WPI_TalonSRX lh;
    public WPI_TalonSRX w;
    private double HAND_DAMPENER = 0.5;
    private double WRIST_DAMPENER = 0.5;
    public DoubleSolenoid ds;
    public Compressor comp;


  public HandSubsystem()
  {

    //Connecting each Talon to each Drive Motor
    this.rh = new WPI_TalonSRX(RobotMap.rightHandMotor);   
    this.lh = new WPI_TalonSRX(RobotMap.leftHandMotor);
    this.w = new WPI_TalonSRX(RobotMap.wristMotor);
    this.ds = new DoubleSolenoid(RobotMap.pcmID, RobotMap.handRotatorSolenoidChannelIn, RobotMap.handRotatorSolenoidChannelOut);
    this.comp = new Compressor(RobotMap.pcmID);

    comp.stop();

  }
/* -- FOR LATER --
  public void arcade (double moveValue, double rotateValue)
  {
    tank(moveValue - rotateValue, moveValue + rotateValue);
  }
*/

    public void handShoot()
    {
      rh.set(1 - HAND_DAMPENER);
      lh.set(1 - HAND_DAMPENER);
    }

    public void handStop()
    {
      rh.set(0);
      lh.set(0);
    }

    public void handSuck()
    {
      rh.set(-1 + HAND_DAMPENER);
      lh.set(-1 + HAND_DAMPENER);
    }

    public void wristMove(double moveVal)
    {   
      w.set(moveVal - WRIST_DAMPENER);
    }


    //----------------- PNEUMATICS (Hand Open/Close) -----------------


    /**
    *     NO IDEA IF THIS DOES I THINK IT DOES
    */
    public void handSolenoidOpen()  
    {
      //FIND OUT WHAT kFORWARD DOES
      ds.set(DoubleSolenoid.Value.kForward);
    }

    /**
    *     NO IDEA IF THIS DOES I THINK IT DOES
    */
    public void handSolenoidClose()    
    {
      //FIND OUT WHAT kREVERS DOES
      ds.set(DoubleSolenoid.Value.kReverse);
    }

    /** 
     *      I THINK THIS SHOULD STOP THE COMPRESSOR MOVEMENT
    */
    public void handSolenoidStop()   
    {
      ds.set(DoubleSolenoid.Value.kOff);
    }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
