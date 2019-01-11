package frc.team2813.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team2813.robot.commands.ToggleSolenoid;

public class OI {
	
	public static Joystick joystick;
	public static final int JOYSTICK_ID = 0;
	private final Solenoid solenoid = new Solenoid(0,1);
	
	public OI() {
		joystick = new Joystick(JOYSTICK_ID);
		new JoystickButton(joystick, 1).whileHeld(new ToggleSolenoid(solenoid));
		
		
		
	}
	
}
