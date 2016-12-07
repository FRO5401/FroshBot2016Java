package org.usfirst.frc.team5401.robot.commands;

import org.usfirst.frc.team5401.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Lower extends Command {

	private String direction;
	
    public Lower(String d) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.pneumatics);
        direction = d;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (direction.equals("left")){
    		Robot.pneumatics.lowerLeft();
    	} else if (direction.equals("right")){
    		Robot.pneumatics.lowerRight();
    	} else {
    		System.out.println("ERROR: Lower has an incorrect value.");
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
