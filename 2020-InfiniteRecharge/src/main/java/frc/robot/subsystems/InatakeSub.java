/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.Constants;

public class IntakeSub extends SubsystemBase {
  private CANSparkMax intake_motor = new CANSparkMax(Constants.intakemotorID, MotorType.kBrushless);
  private DoubleSolenoid lifter = new DoubleSolenoid(Constants.compressorID, MotorType.kBrushless);
  private DigitalInput limitswitch = new DigitalInput(Constants.limitID);
  private int count = 0;
  /**
   * Creates a new ExampleSubsystem.
   */
  public IntakeSub() {

  }

  public int getcount(){
    return count;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
