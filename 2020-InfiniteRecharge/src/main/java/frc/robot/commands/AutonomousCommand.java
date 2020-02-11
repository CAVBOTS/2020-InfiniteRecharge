package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.LimeLightSubsystem;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.commands.AimCommand;

public class AutonomousCommand extends CommandBase {
    /**
     * Creates a new LimeLight.
     */
    private LimeLightSubsystem lime;
    private CANSparkMax leftMotor;
    private CANSparkMax rightMotor;
    private CANSparkMax leftFollower;
    private CANSparkMax rightFollower;
    private AimCommand aim;// = new AimCommand(null, leftFollower, leftFollower, leftFollower, leftFollower);

    
  
    public AutonomousCommand() {
        
      // Use addRequirements() here to declare subsystem dependencies.
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {

        //initialize motors
        leftMotor = new CANSparkMax(Constants.dm_motorleftID, MotorType.kBrushless);
        rightMotor = new CANSparkMax(Constants.dm_motorrightID, MotorType.kBrushless);
        leftFollower = new CANSparkMax(Constants.dm_leftfollowerID, MotorType.kBrushless);
        rightFollower = new CANSparkMax(Constants.dm_rightfollowerID, MotorType.kBrushless);
        aim = new AimCommand(lime, leftMotor, rightMotor, leftFollower, rightFollower);
    }
  
    public void setmotors(Double power){
      leftMotor.set(power);
      rightMotor.set(power);
      leftFollower.follow(leftMotor);
      rightFollower.follow(rightMotor);
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      Double ta = lime.getta().getDouble(0);
      if(ta>.7){ //TODO determine area
        if(ta>.8)
          while(lime.getta().getDouble(0)>.7)
          {
            setmotors(-0.2);
          }
        setmotors(0.0);
        aim.aime();
      }
      else{
        while(lime.getta().getDouble(0)<.7)
          {
            setmotors(0.2);
          }
        setmotors(0.0);
        aim.aime();
      }
        
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    setmotors(0.0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }