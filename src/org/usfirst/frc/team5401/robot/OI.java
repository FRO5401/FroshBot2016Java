package org.usfirst.frc.team5401.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
	
	//Set up Joysticks
	Joystick XboxController = new Joystick(1);
	
	//Create Buttons
	Button XboxA 					= new JoystickButton(XboxController, RobotMap.XBOX_A);
	Button XboxB					= new JoystickButton(XboxController, RobotMap.XBOX_B);
	Button XboxX					= new JoystickButton(XboxController, RobotMap.XBOX_X);
	Button XboxY					= new JoystickButton(XboxController, RobotMap.XBOX_Y);
	Button XboxLeftBumper			= new JoystickButton(XboxController, RobotMap.XBOX_LEFT_BUMPER);
	Button XboxRightBumper			= new JoystickButton(XboxController, RobotMap.XBOX_RIGHT_BUMPER);
	Button XboxBack					= new JoystickButton(XboxController, RobotMap.XBOX_BACK);
	Button XboxStart				= new JoystickButton(XboxController, RobotMap.XBOX_START);
	Button XboxL3					= new JoystickButton(XboxController, RobotMap.XBOX_L3);
	Button XboxR3				 	= new JoystickButton(XboxController, RobotMap.XBOX_R3);
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public double readXboxLeftStickY(){
		return XboxController.getRawAxis(RobotMap.XBOX_LEFT_STICK_Y);
	}
	
	public double readXboxRightStickY(){
		return XboxController.getRawAxis(RobotMap.XBOX_RIGHT_STICK_Y);
	}
	
	public boolean getBrakeButton(){
		return XboxController.getRawButton(RobotMap.XBOX_RIGHT_BUMPER);
	}
	
	public boolean getPrecisionButton(){
		return XboxController.getRawButton(RobotMap.XBOX_LEFT_BUMPER);
	}
	
}

