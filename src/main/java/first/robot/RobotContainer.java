package first.robot;

import first.robot.constants.SWERVE;
import first.robot.constants.USB;
import first.robot.subsystems.*;
import first.team4201.lib.simulation.FieldSim;
import first.team4201.lib.utils.CtreTelemetry;
import org.wpilib.command2.Command;
import org.wpilib.command2.InstantCommand;
import org.wpilib.command2.WaitCommand;
import org.wpilib.command2.button.CommandXboxController;
import org.wpilib.epilogue.Logged;
import org.wpilib.tunable.Selectable;
import org.wpilib.tunable.Tunables;
import org.wpilib.units.Units;

public class RobotContainer {
  private final Selectable<Command> m_autoChooser = new Selectable<>();
  private final Selectable<Boolean> m_sideChooser = new Selectable<>();

  public Boolean autoSide = false;

  private CommandXboxController m_driverController;

  private final CtreTelemetry m_swerveTelemetry =
      new CtreTelemetry(SWERVE.kMaxSpeed.in(Units.MetersPerSecond), SWERVE.kModuleTranslations);
  private final FieldSim m_fieldSim = new FieldSim();

  @Logged(importance = Logged.Importance.INFO)
  private Flywheel m_flywheel;

  @Logged(importance = Logged.Importance.INFO)
  private Hood m_hood;

  @Logged(importance = Logged.Importance.INFO)
  private Indexer m_indexer;

  @Logged(importance = Logged.Importance.INFO)
  private Intake m_intake;

  @Logged(importance = Logged.Importance.INFO)
  private IntakePivot m_intakePivot;

  @Logged(importance = Logged.Importance.INFO)
  private Uptake m_uptake;

  @Logged(importance = Logged.Importance.INFO)
  private Vision m_vision;

  public RobotContainer() {
    initBindings();
    initSubsystems();
    initTelemetry();
  }

  public void initSubsystems() {
    m_flywheel = new Flywheel();
    m_hood = new Hood();
    m_indexer = new Indexer();
    m_intake = new Intake();
    m_intakePivot = new IntakePivot();
    m_uptake = new Uptake();
    m_vision = new Vision();
  }

  public void initBindings() {
    m_driverController = new CommandXboxController(USB.driver_xBoxController);
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
    m_vision.registerFieldSim(m_fieldSim);

    initSideChooser();
    initAutoChooser();
  }
}
