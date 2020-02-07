package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.*;
import frc.robot.Constants;
import frc.robot.subsystems.LimeLightSubsystem;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class AutonomousCommand extends CommandBase {
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
    public Constants jaba = new Constants();

    
  
    public AutonomousCommand(LimeLightSubsystem lime) {
        this.lime = lime;
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

        //initialize motors
        leftMotor = new CANSparkMax(0, MotorType.kBrushless);
        rightMotor = new CANSparkMax(2, MotorType.kBrushless);
        leftFollower = new CANSparkMax(1, MotorType.kBrushless);
        rightFollower = new CANSparkMax(3, MotorType.kBrushless);
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
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