/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final class Constants {
        //initialize CAN IDS
        public final static int PDP = 0;
    
        //drivetrain motors
        public final static int dm_motorleftID = 1;
        public final static int dm_leftfollowerID = 2;
        public final static int dm_motorrightID = 3;
        public final static int dm_rightfollowerID = 4;
        public final static int driver1= 1;
        public final static int driver2 = 2;
    
        //launcher motors
        public static final int rotorymotorID = 5;
        public static final int wheelmotorID = 6;
        
    
        //limelight ids
        public static final int aimingID = 1; // button for aiming 
    
        //Colorwheel
        public static final int colormotorID = 7;
    
        //intake subsystem
        public static final int intakemotorID = 8;
        public static final int compressorID = 1;
        public static final int firstID = 2; //first pnuematic
        public static final int secondID = 3; //second pnuematic
        public static final int limitID = 4;
        public static final int compID = 1;
        public static final int intake = 5;//button to intake
        public static final int raiseIntake = 5; //button to raise intake
        public static final int lowerIntake = 6; // button to lower intake
    
        //Rack and pinion 
        public final static int rackone = 10;//right motor
        public final static int racktwo = 11;//left motor
        public final static int maxencodervalue = 8; // used in the if statement to check max height 
        public final static int minencodervalue = -8; // used in the if statemnt to check the min height
        public final static int climbupright = 10; //this is the button used on the operator to move right motor up
        public final static int climbupleft = 11; // this is the button used on the operator to move left motor up
        public final static int climbdownright = 12; // this is the button used on the operator to move the right motor down
        public final static int climbdownleft = 13; // this is the button used on the operator to move the left motor down
    
        //elevator motors
        public static final int e_leftmotorID = 12;
        public static final int e_rightmotorID = 13;
    
        //hanging motors
        public static final int hangmotorID = 14;
        public static final int hangfollowerID = 15;
    
        // declares x and y in drive method in drive train sub
        public final static int drivey = 5;
        public final static int drivex = 5;




    //initialize CAN IDS
    public static final int PDP = 0;

    //drivetrain motors
    public static final int dm_motorleftID = 1;
    public static final int dm_leftfollowerID = 2;
    public static final int dm_motorrightID = 3;
    public static final int dm_rightfollowerID = 4;

    //Launcher motors
    public static final int rotorymotorID = 5;
    public static final int wheelmotorID = 6;
    
    //Colorwheel
    public static final int colormotorID = 7;
    
    //intake motors
    public static final int intakemotorID = 8;
    public static final int compressorID = 1;
    public static final int firstID = 2;
    public static final int secondID = 3;
    public static final int limidID = 4;

    //Rack and pinion motors
    public static final int rackone = 9;
    public static final int racktwo = 10;

    //elevator motors
    public static final int e_motorID = 11;

    //hanging motors move stuff left and right
    public static final int hangmotorID = 12;
    }

}
