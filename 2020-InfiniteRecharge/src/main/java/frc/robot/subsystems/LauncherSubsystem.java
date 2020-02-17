package frc.robot.subsystems;
 
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
 
 
public class LauncherSubsystem extends SubsystemBase 
{
 
  private CANSparkMax m = new CANSparkMax(13,MotorType.kBrushless);
  public static void flywheel(double d)
  {
    
  }
 
  DoubleSolenoid leftSolenoid = new DoubleSolenoid(13,1,0); //(CAN ID, Pneumatic ID, Pneumatic ID2)
  DoubleSolenoid rightSolenoid = new DoubleSolenoid(13,3,2); //(CAN ID, Pneumatic ID, Pneumatic ID2)
  public void angle(boolean p)
  {
      
      if(p == true) 
    {                        
      leftSolenoid.set(DoubleSolenoid.Value.kForward);                         
      leftSolenoid.set(DoubleSolenoid.Value.kReverse); 
    }
 
      if(p == true)
    {
      rightSolenoid.set(DoubleSolenoid.Value.kForward);                         
      rightSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
 
  }
 
  public LauncherSubsystem() 
  {
 
  }
 
  @Override
  public void periodic() 
  {
    
    // This method will be called once per scheduler run
  }
 
 
}

