package frc.team2813.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team2813.robot.commands.*;

public class OI {
	
	public static Joystick joystick;
	public static final int JOYSTICK_ID = 0;
	private final Solenoid solenoid = new Solenoid(0,1);
	private final Solenoid solenoid1 = new Solenoid(0,2);
	
	public OI() {
		joystick = new Joystick(JOYSTICK_ID);
		new JoystickButton(joystick, 1).whenPressed(new ToggleSolenoid(solenoid));
		new JoystickButton(joystick, 2).whenPressed(new ToggleSolenoid(solenoid1));
		JoystickButton a = new JoystickButton(joystick, 3);
		
	}
	
}
