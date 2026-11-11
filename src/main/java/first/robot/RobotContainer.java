package first.robot;

import org.wpilib.command2.Command;
import org.wpilib.command2.InstantCommand;
import org.wpilib.command2.WaitCommand;
import org.wpilib.tunable.Selectable;
import org.wpilib.tunable.Tunable;
import org.wpilib.tunable.Tunables;

import java.security.KeyStore;

public class RobotContainer {
  private final Selectable<Command> m_autoChooser = new Selectable<>();
  private final Selectable<Boolean> m_sideChooser = new Selectable<>();

  public Boolean autoSide = false;

  public RobotContainer() {
    initBindings();
    initSubsystems();
    initTelemetry();
  }

  public void initSubsystems() {

  }

  public void initBindings() {

  }

  public void initSideChooser() {
    m_sideChooser.addDefault("No Flip", false);
    m_sideChooser.add("Depot", false);
    m_sideChooser.add("Outpost", true);
    m_sideChooser.onChange((flip) -> autoSide = flip);
    Tunables.publish("Auto Side", m_sideChooser);
  }

  public void initAutoChooser() {
    m_autoChooser.addDefault("No Auto", new InstantCommand());
    m_autoChooser.add("Super Duper Fun Auto", new WaitCommand(0));
    Tunables.publish("Auto Mode", m_autoChooser);
  }

  public void initTelemetry() {
    initSideChooser();
    initAutoChooser();
  }
}
