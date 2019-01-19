/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Right_Drive extends Subsystem {
  
  private final TalonSRX m_rightMaster;
  private final TalonSRX m_rightSlave1;
  private final TalonSRX m_rightSlave2;

public Right_Drive() {

  m_rightMaster = new TalonSRX(5);
  m_rightSlave1 = new TalonSRX(6);
  m_rightSlave2 = new TalonSRX(7);

  m_rightSlave1.follow(m_rightMaster);
  m_rightSlave2.follow(m_rightMaster);
}  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand(){

  } 
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  

  public void setPower(double rightPercentOutput){
    m_rightMaster.set(ControlMode.PercentOutput,rightPercentOutput);
  }
}

