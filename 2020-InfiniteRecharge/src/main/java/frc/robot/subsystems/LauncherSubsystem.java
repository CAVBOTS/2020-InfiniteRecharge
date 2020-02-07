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

      private CANSparkMax leftMotor = new CANSparkMax(0, MotorType.kBrushless);
      private CANSparkMax rightMotor = new CANSparkMax(2, MotorType.kBrushless);
  
      private CANSparkMax leftMotorFollow = new CANSparkMax(1, MotorType.kBrushless);
      private CANSparkMax rightMotorFollow = new CANSparkMax(3, MotorType.kBrushless);

}
