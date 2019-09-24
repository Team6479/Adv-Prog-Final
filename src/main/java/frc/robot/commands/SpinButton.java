/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SpinButton extends Command {
  public SpinButton() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain);
  }
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.drivetrain.zero();
    
  }
  private boolean finished = false;
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    final double FULL_CIRCLE = 10.0;
    if (Robot.drivetrain.distanceTraveled() < FULL_CIRCLE * 2){
      Robot.drivetrain
          .getDrive()
          .arcadeDrive(0.0, 1.0);
    } else {
      Robot.drivetrain
          .getDrive()
          .arcadeDrive(0.0, 0.0);
          finished = true;
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return finished;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
