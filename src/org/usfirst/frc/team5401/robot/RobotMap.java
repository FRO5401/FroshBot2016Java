package org.usfirst.frc.team5401.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//Drive Motors
	public static final int LEFT_MOTOR 	= 0;
	public static final int RIGHT_MOTOR = 1;
	
	//Xbox Controller Values
	public static final int XBOX_LEFT_STICK_X 	= 0;
	public static final int XBOX_LEFT_STICK_Y 	= 1;
	public static final int XBOX_LEFT_TRIGGER 	= 2;
	public static final int XBOX_RIGHT_TRIGGER 	= 3;
	public static final int XBOX_RIGHT_STICK_X 	= 4;
	public static final int XBOX_RIGHT_STICK_Y 	= 5;
	
	public static final int XBOX_A				= 1;
	public static final int XBOX_B				= 2;
	public static final int XBOX_X				= 3;
	public static final int XBOX_Y				= 4;
	public static final int XBOX_LEFT_BUMPER	= 5;
	public static final int XBOX_RIGHT_BUMPER	= 6;
	public static final int XBOX_BACK			= 7;
	public static final int XBOX_START			= 8;
	public static final int XBOX_L3				= 9;
	public static final int XBOX_R3				= 10;
	
	//Drive Sensitivity
	public static final double Drive_Sensitivity_Default	=	1;
	public static final double Drive_Sensitivity_Precise	=	0.4;
	
}
