package org.usfirst.frc.team5401.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5401.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private DoubleSolenoid pistonLeft;
	private DoubleSolenoid pistonRight;
	
	public Pneumatics(){
		pistonLeft  = new DoubleSolenoid(RobotMap.SOLENOID_CAN, RobotMap.LEFT_LIFT, RobotMap.LEFT_LOWER);
		pistonRight = new DoubleSolenoid(RobotMap.SOLENOID_CAN, RobotMap.RIGHT_LIFT, RobotMap.RIGHT_LOWER);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void liftLeft(){
    	pistonLeft.set(DoubleSolenoid.Value.kForward);
    }
    
    public void lowerLeft(){
    	pistonLeft.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void liftRight(){
    	pistonRight.set(DoubleSolenoid.Value.kForward);
    }

	public void lowerRight(){
		pistonRight.set(DoubleSolenoid.Value.kReverse);
	}
    
}

