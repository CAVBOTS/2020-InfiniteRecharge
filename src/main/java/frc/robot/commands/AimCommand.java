/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.*;
import frc.robot.subsystems.LimeLightSubsystem;
import com.revrobotics.CANSparkMax;

public class AimCommand extends CommandBase {
    /**
     * Creates a new LimeLight.
     */
    private final LimeLightSubsystem lime;
    private double xoffset;
    private double yoffset;
    private double area;
    private CANSparkMax leftMotor;
    private CANSparkMax rightMotor;
    private CANSparkMax leftFollower;
    private CANSparkMax rightFollower;

    
  
    public AimCommand(LimeLightSubsystem lime, CANSparkMax left, CANSparkMax right, CANSparkMax leftfol, CANSparkMax rightfol) {
        this.lime = lime;
        this.leftMotor = left;
        this.rightMotor = right;
        this.leftFollower = leftfol;
        this.rightFollower = rightfol;
        addRequirements(lime);
      // Use addRequirements() here to declare subsystem dependencies.
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        //initialize limelight
        xoffset = lime.gettx().getDouble(0); // returns horizantal degress
        yoffset = lime.getty().getDouble(0); // returns vertical off set of degrees from origin
        area = lime.getta().getDouble(0);  //returns how much the target is in the area

    }
  
    // Called every time the scheduler runs while the command is scheduled.
   // @Override
    public void aime() {
    while(xoffset>-.5 && xoffset<.5 )
    {
        if(xoffset>0.5) //moving it left
            leftMotor.set(.2);//TODO Set numbers
        if(xoffset<0.5)
            rightMotor.set(.2);
        leftFollower.follow(leftMotor);
        rightFollower.follow(rightMotor);
    }
    leftMotor.set(0);
    rightMotor.set(0);
    leftFollower.follow(leftMotor);
    rightFollower.follow(rightMotor);
    
    
    SmartDashboard.putNumber("x degrees off target: ", xoffset);
    SmartDashboard.putNumber("y degrees off target: ", yoffset);
    SmartDashboard.putNumber("Target Area: ", area);

    xoffset = lime.gettx().getDouble(0); // returns horizantal degress
    yoffset = lime.getty().getDouble(0); // returns vertical off set of degrees from origin
    area = lime.getta().getDouble(0);  //returns how much the target is in the area
      
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    leftMotor.set(0);
    rightMotor.set(0);
    leftFollower.follow(leftMotor);
    rightFollower.follow(rightMotor);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }