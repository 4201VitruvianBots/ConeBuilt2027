package first.robot.constants;

import org.wpilib.hardware.bus.CANPort;

import com.ctre.phoenix6.CANBus;

import first.robot.subsystems.Flywheel;
import first.robot.subsystems.Hood;
import first.robot.subsystems.Indexer;
import first.robot.subsystems.Intake;

public class CAN {

    
  ///@brief On this bus are all Drivetrain devices
  public static final CANBus S0 = new CANBus(CANPort.CAN_S0); 
  /// On this bus:
  /// - Indexer 1, 
  /// - Indexer 2, 
  /// - Intake 1
  public static final CANBus S1 = new CANBus(CANPort.CAN_S1);
  /// On this bus:
  /// - Hood
  public static final CANBus S2 = new CANBus(CANPort.CAN_S2); 
  /// On this bus: 
  /// - Indexer 3,
  /// - Indexer 4,
  /// - Intake 2,
  /// - Intake Pivot
  public static final CANBus S3 = new CANBus(CANPort.CAN_S3); 
  /// @brief On this bus are all flywheel motors
  public static final CANBus S4 = new CANBus(CANPort.CAN_S4); 
  /// @brief On this bus just put things we want out
  public static final CANBus dummyBus = new CANBus(CANPort.CAN_D16);

  public static final int pigeon = 9;

  public static final int frontLeftCanCoder = 10;
  public static final int frontRightCanCoder = 11;
  public static final int backLeftCanCoder = 12;
  public static final int backRightCanCoder = 13;

  public static final int frontLeftDriveMotor = 20;
  public static final int frontLeftTurnMotor = 21;
  public static final int frontRightDriveMotor = 22;
  public static final int frontRightTurnMotor = 23;
  public static final int backLeftDriveMotor = 24;
  public static final int backLeftTurnMotor = 25;
  public static final int backRightDriveMotor = 26;
  public static final int backRightTurnMotor = 27;

  public static final int kShooterHoodMotor = 34;

  public static final int kShooterRollerMotor1 = 40;
  public static final int kShooterRollerMotor2 = 41;
  public static final int kShooterRollerMotor3 = 42;
  public static final int kShooterRollerMotor4 = 43; //TODO: change to a value that is real

  public static final int kIndexerMotor1 = 51;
  public static final int kIndexerMotor2 = 50;
  public static final int kIndexerMotor3 = 52; //same with these
  public static final int kIndexerMotor4 = 58;

  public static final int kIntakeRollerMotor1 = 53;
  public static final int kIntakeRollerMotor2 = 54;

  public static final int kIntakePivotMotor = 55;
}
