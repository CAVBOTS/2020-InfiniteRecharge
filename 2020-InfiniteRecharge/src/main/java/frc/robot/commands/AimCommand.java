package frc.robot.commands;
//putting robot into position

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.*;
import frc.robot.subsystems.LimeLightSubsystem;
import com.revrobotics.CANSparkMax;

public class AimCommand extends CommandBase {
    //set all variables
    private final LimeLightSubsystem lime;
    private double xoffset;
    private double yoffset;
    private double area;
    private CANSparkMax leftMotor;
    private CANSparkMax rightMotor;
    private CANSparkMax leftFollower;
    private CANSparkMax rightFollower;
    private boolean inposition = false;

    
    //initialize motors
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
        lime = new LimeLightSubsystem();
        xoffset = lime.gettx().getDouble(0); // returns horizantal degress
        yoffset = lime.getty().getDouble(0); // returns vertical off set of degrees from origin
        area = lime.getta().getDouble(0);  //returns how much the target is in the area

    }
  
  
    public void aime() {
    while(xoffset>-.5 && xoffset<.5 && area>0.8 && area<0.6)
    {
        //moes it backward if too close
        if(area>.8) //TODO Calibrate area
        {
          leftMotor.set(-.2);
          rightMotor.set(-.2);
          leftFollower.follow(leftMotor);
          rightMotor.follow(rightMotor);
        }
        else if(area<0.6)//move forward if too back
        {
          leftMotor.set(0.2);
          rightMotor.set(0.2);
          leftFollower.follow(leftMotor);
          rightMotor.follow(rightMotor);
        }
        else if(xoffset>0.5) //moving it left if camera to the right
            leftMotor.set(.2);//TODO Calibrate numbers
        else if(xoffset<0.5)  //moving it right if camera to the left
            rightMotor.set(.2);
        leftFollower.follow(leftMotor);
        rightFollower.follow(rightMotor);

        //recalculate target positioning
        xoffset = lime.gettx().getDouble(0); // returns horizantal degress
        area = lime.getta().getDouble(0);  //returns how much the target is in the area
    }
    leftMotor.set(0);  //stop motors when done aiming
    rightMotor.set(0);
    leftFollower.follow(leftMotor);
    rightFollower.follow(rightMotor);
    
    //post target offput 
    SmartDashboard.putNumber("x degrees off target: ", xoffset);
    SmartDashboard.putNumber("y degrees off target: ", yoffset);
    SmartDashboard.putNumber("Target Area: ", area);

    
    inposition = true;
      
    }

    public boolean isinposition(){
      return inposition;
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      //turning off motors
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