/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package main.java.frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import frc.robot.subsystems.LauncherSubsystem;
import frc.robot.subsystems.IntakeSub;
import edu.wpi.first.wpilibj.Timer;

public class LauncherCommand extends CommandBase {
  /**
   * Creates a new LimeLight.
   */
  private LauncherSubsystem launch;
  private IntakeSub intake;
  private int count;
  private Timer time = new Timer();


  public LauncherCommand() {
      addRequirements(LauncherSubsystem);
      addRequirements(IntakeSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    launch = new LauncherSubsystem();
    intake = new InstakeSub();
    count = 0;
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //if there are balls in the robot, then launch and lift up more balls to the cannon
    while(intake.getcount()-launch.getcount()!=0){ 
        launch.autoset();
        launch.launch();
        launch.lift(1); //TODO set numbers and intake and delay
        time.delay(0.1);
        launch.lift(0);
    }
    launch.stop();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) { //stop motors
      launch.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}