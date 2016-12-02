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
	
	private Victor leftDrive;
	private Victor rightDrive;
	
	public DriveBase(){
		leftDrive = new Victor(RobotMap.LEFT_MOTOR);
		rightDrive = new Victor(RobotMap.RIGHT_MOTOR);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new XboxTankDrive());
    }
    
    public void drive(double leftDriveDesired, double rightDriveDesired){
    	leftDrive.set(leftDriveDesired * -1);	//Left motor must be reversed to match right
    	rightDrive.set(rightDriveDesired);
    }
    
    public void stop(){
    	leftDrive.set(0);
    	rightDrive.set(0);
    }
}

