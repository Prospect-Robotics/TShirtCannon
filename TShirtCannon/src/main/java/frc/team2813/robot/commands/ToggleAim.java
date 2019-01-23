package frc.team2813.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ToggleAim extends InstantCommand {

    private DoubleSolenoid solenoid;

    public ToggleAim(DoubleSolenoid solenoid) {
        super();
        this.solenoid = solenoid;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called once when the command executes
    protected void initialize() {
        solenoid.set(solenoid.get() == DoubleSolenoid.Value.kForward ? DoubleSolenoid.Value.kReverse : DoubleSolenoid.Value.kForward);
    }

}