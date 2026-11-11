package first.robot;

import org.wpilib.tunable.Selectable;
import org.wpilib.tunable.Tunables;

public class RobotContainer {
    private final Selectable<String> m_autoChooser = new Selectable<>();

    public void initAutoChooser() {
        m_autoChooser.addDefault("No Auto", "NO_AUTO");
        m_autoChooser.add("Super Duper Fun Auto", "FUN_AUTO");
        Tunables.publish("Auto Mode", m_autoChooser);
    }
}
