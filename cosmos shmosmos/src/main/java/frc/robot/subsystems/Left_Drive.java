/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Left_Drive extends Subsystem {
  
  private final TalonSRX m_leftMaster;
  private final TalonSRX m_leftSlave1;
  private final TalonSRX m_leftSlave2;


public Left_Drive() {

  m_leftMaster = new TalonSRX(2);
  m_leftSlave1 = new TalonSRX(3);
  m_leftSlave2 = new TalonSRX(4);

  m_leftSlave1.follow(m_leftMaster);
  m_leftSlave2.follow(m_leftMaster);
} 






  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setPower(double leftPercentOutput) {
    m_leftMaster.set(ControlMode.PercentOutput,leftPercentOutput);

  }






public void stopDrive() {
}
}
