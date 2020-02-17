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

    //hanging motors
    public static final int hangmotorID = 12;
    public static final int hangfollowerID = 13;

}
