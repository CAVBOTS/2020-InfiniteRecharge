/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import frc.robot.subsystems.ColorWheel;
import edu.wpi.first.wpilibj2.command.CommandBase;
/**
 * An example command that uses an example subsystem.
 */
public class ColorWheelPositionControl extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ColorWheel m_colorcode;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ColorWheelPositionControl(ColorWheel colorcode) {
    m_colorcode = colorcode;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(colorcode);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    String gameData;
    gameData = DriverStation.getInstance().getGameSpecificMessage();
  if(gameData.length() > 0)
  {
  switch (gameData.charAt(0))
  {
    case 'B' :// Blue case code find red
    if(m_colorcode.isRed()){//makes sure the color isn't on red
      while(m_colorcode.isRed()){
        m_colorcode.ColorWheelmotoron();
      }
      m_colorcode.ColorWheelmotoroff();
    }
    else{
      while(!(m_colorcode.isRed())){//actually moves the color to red
        m_colorcode.ColorWheelmotoron();
      }}
      m_colorcode.ColorWheelmotoroff();
      m_colorcode.ColorWheelmotorclose();
      break;
    case 'G' ://Green case code, find yellow
      if(m_colorcode.isYellow()){//makes sure the color isn't on yellow
      while(m_colorcode.isYellow()){
        m_colorcode.ColorWheelmotoron();;
      }
      m_colorcode.ColorWheelmotoroff();
    }
    else{
      while(!(m_colorcode.isYellow())){//actually moves the color to yellow
        m_colorcode.ColorWheelmotoron();;
      }}
      m_colorcode.ColorWheelmotoroff();
      m_colorcode.ColorWheelmotorclose();
      break;
    case 'R' ://red case code find blue
    if(m_colorcode.isBlue()){//makes sure the color isn't on blue
      while(m_colorcode.isBlue()){
        m_colorcode.ColorWheelmotoron();;
    }
    m_colorcode.ColorWheelmotoroff();
  }
  else{
    while(!(m_colorcode.isBlue())){//actually moves the color to blue
        m_colorcode.ColorWheelmotoron();;
    }}
    m_colorcode.ColorWheelmotoroff();
    m_colorcode.ColorWheelmotorclose();
    break;//Red case code
    case 'Y' ://Yellow case code find blue
    if(m_colorcode.isGreen()){//makes sure the color isn't on green
    while(m_colorcode.isGreen()){
        m_colorcode.ColorWheelmotoron();;
    }
    m_colorcode.ColorWheelmotoroff();
  }
  else{
    while(!(m_colorcode.isGreen())){//actually moves the color to green
        m_colorcode.ColorWheelmotoron();;
    }}
    m_colorcode.ColorWheelmotoroff();
    m_colorcode.ColorWheelmotorclose(); 
      break;//Yellow case code
    default :
      //This is corrupt data
      break;
  }
  } else {
  //Code for no data received yet
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
//Made by Wynter Japp
