package first.robot;

import org.wpilib.command2.Command;
import org.wpilib.command2.InstantCommand;
import org.wpilib.command2.WaitCommand;
import org.wpilib.tunable.Selectable;
import org.wpilib.tunable.Tunables;

public class RobotContainer {
  private final Selectable<Command> m_autoChooser = new Selectable<>();

  public RobotContainer() {
    initBindings();
    initSubsystems();

    initTelemetry();
  }

  public void initSubsystems() {

  }

  public void initTelemetry() {
    initAutoChooser();
  }

  public void initBindings() {

  }

  public void initAutoChooser() {
    m_autoChooser.addDefault("No Auto", new InstantCommand());
    m_autoChooser.add("Super Duper Fun Auto", new WaitCommand(0));
    Tunables.publish("Auto Mode", m_autoChooser);
  }
}
