package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//test
import frc.robot.Constants;

public class LauncherSubsystem extends SubsystemBase 
{
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
      // Set the default command for a subsystem here.
      // setDefaultCommand(new MySpecialCommand());
    }

      private CANSparkMax leftMotor = new CANSparkMax(Constants.dm_motorleftID, MotorType.kBrushless);
      private CANSparkMax rightMotor = new CANSparkMax(Constants.dm_motorrightID, MotorType.kBrushless);
  
      private CANSparkMax leftMotorFollow = new CANSparkMax(Constants.dm_leftfollowerID, MotorType.kBrushless);
      private CANSparkMax rightMotorFollow = new CANSparkMax(Constants.dm_rightfollowerID, MotorType.kBrushless);

}
