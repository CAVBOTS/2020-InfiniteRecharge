package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.subsystems.LimeLightSubsystem;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;

//test
import frc.robot.Constants;

public class LauncherSubsystem extends SubsystemBase 
{
  private CANSparkMax angle;
  private CANSparkMax cannonwheel;
  private CANSparkMax elevator;
  private LimeLightSubsystem lime;
  private int count = 0;
  private DigitalInput limit = new DigitalInput(2);
  private java.lang.Timer time = new Timer();

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    //initialize
    public LauncherSubsystem()
    {
      //initialize motors
      angle = new CANSparkMax(Constants.rotorymotorID, MotorType.kBrushless);
      cannonwheel = new CANSparkMax(Constants.wheelmotorID, MotorType.kBrushless);
      elevator = new CANSparkMax(Constants.e_motorID, MotorType.kBrushless);
    
    }

      //launch balls
    public void autoset(){
     //TODO find a way to get this to move for certain amount of time
        angle.set(1);
        time.delay(.1);
        angle.set(0);
        //TODO configure launching settings
    }

    //set angle power to change angle depending on input
    public void setangle(double power){
      angle.set(power);
    }

    //launch balls
    public void launch(){
       //TODO input scheduler stuff or delay
        cannonwheel.set(1);
        time.delay(.1);
        cannonwheel.set(0);
    }

    //lifts balls in the elevator
    public void lift(double power){
      elevator.set(power);
      // time.delay(0.1);
      // elevator.set(0);
    }

    //returns the count on the limit switch
    public int getcount(){
      return count;
    }

    @Override
  public void periodic() {
    if(limit.get())
      count++;
    
  }

  public void stop(){
    cannonwheel.set(0);
    lift(0);
    angle.set(0);
  }



}
