package frc.team2813.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class FireCannon extends InstantCommand {

    private Solenoid solenoid;
    public FireCannon(Solenoid solenoid) {
        super();
        this.solenoid = solenoid;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called once when the command executes
    protected void initialize() {
        solenoid.set(true);
        try {
            Thread.sleep(500);
            solenoid.set(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
            solenoid.set(false);
        }
    }

}