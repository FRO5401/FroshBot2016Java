package org.usfirst.frc.team5401.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5401.robot.Robot;

/**
 *
 */
public class Lift extends Command {
	
	private String direction;
	
    public Lift(String d) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.pneumatics);
        direction = d;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (direction.equals("left")){
    		Robot.pneumatics.liftLeft();
    	} else if (direction.equals("right")){
    		Robot.pneumatics.liftRight();
    	} else {
    		System.out.println("ERROR: Lift has an incorrect value.");
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
