// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot.subsystems;

import static org.wpilib.units.Units.Rotations;

import org.wpilib.command2.SubsystemBase;
import org.wpilib.epilogue.Logged;

import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import first.robot.constants.CAN;

public class IntakePivot extends SubsystemBase {

  @Logged(name = "Intake Pivot", importance = Logged.Importance.DEBUG)
  private final TalonFX m_motor = new TalonFX(CAN.kIntakePivotMotor, CAN.S3);

  private final MotionMagicVoltage m_request = new MotionMagicVoltage(Rotations.of(0)).withEnableFOC(true);

  /** Creates a new IntakePivot. */
  public IntakePivot() {
    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
