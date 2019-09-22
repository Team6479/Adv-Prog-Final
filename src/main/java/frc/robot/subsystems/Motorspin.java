/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/** Add your docs here. */
public class Motorspin extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private Spark motor;

  public Motorspin() {
    motor = new Spark(RobotMap.MOTOR_SPIN);
  }
  public void on() {
    motor.set(1.0);
  }
  public void off() {
    motor.set(0.0);
  }
  public void toggle() {
    if (motor.get() == 1.0) {
      this.off();
    } else {
      this.on();
    }
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
