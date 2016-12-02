package org.usfirst.frc.team5401.robot.subsystems;

import org.usfirst.frc.team5401.robot.RobotMap;
import org.usfirst.frc.team5401.robot.commands.XboxTankDrive;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class DriveBase extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Victor leftDrive1;
	private Victor leftDrive2;
	private Victor rightDrive1;
	private Victor rightDrive2;
	
	public DriveBase(){
		leftDrive1  = new Victor(RobotMap.LEFT_MOTOR_1);
		leftDrive2  = new Victor(RobotMap.LEFT_MOTOR_2);
		rightDrive1 = new Victor(RobotMap.RIGHT_MOTOR_1);
		rightDrive2 = new Victor(RobotMap.RIGHT_MOTOR_2);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new XboxTankDrive());
    }
    
    public void drive(double leftDriveDesired, double rightDriveDesired){
    	leftDrive1.set(leftDriveDesired * -1);
    	leftDrive2.set(leftDriveDesired * -1);
    	rightDrive1.set(rightDriveDesired);
    	rightDrive2.set(rightDriveDesired);
    }
    
    public void stop(){
    	leftDrive1.set(0);
    	leftDrive2.set(0);
    	rightDrive1.set(0);
    	rightDrive2.set(0);
    }
}

