package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//test
import frc.robot.Constants;

public class LauncherSubsystem extends SubsystemBase 
{
  private CANSparkMax cannonMotor;
  private CANSparkMax cannonFollow;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    //initialize
    public LauncherSubsystem()
    {
      angle = new CANSparkMax(Constants.dm_motorleftID, MotorType.kBrushless);
      cannonwheel = new CANSparkMax(Constants.dm_motorrightID, MotorType.kBrushless);
      
    }

      //launch balls
    public void launch(){

    }



}
