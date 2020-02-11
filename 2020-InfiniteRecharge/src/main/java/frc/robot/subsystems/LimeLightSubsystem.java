/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.networktables.NetworkTable; 
import edu.wpi.first.networktables.NetworkTableEntry; 
import edu.wpi.first.networktables.NetworkTableInstance;


public class LimeLightSubsystem extends SubsystemBase {

    NetworkTable table;
    NetworkTableEntry tx; 
    NetworkTableEntry ty; 
    NetworkTableEntry ta;

  public LimeLightSubsystem() {
    table = NetworkTableInstance.getDefault().getTable("limelight");
    tx = table.getEntry("tx"); 
    ty = table.getEntry("ty"); 
    ta = table.getEntry("ta");

  }

  public NetworkTableEntry gettx(){
      return tx;
  }

  public NetworkTableEntry getty(){
    return ty;
  }

  public NetworkTableEntry getta(){
    return ta;
  }

}