/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.team6479.lib.controllers.CBXboxController;
import com.team6479.lib.controllers.CBXboxController.Buttons;

import frc.robot.commands.SpinLeft;
import frc.robot.commands.SpinRight;


/**
 * This class is the glue that binds the controls on the physical operator interface to the commands
 * and command groups that allow control of the robot.
 */
public class OI {
  public CBXboxController xbox = new CBXboxController(0);

  public OI() { 
    xbox.getButton(Buttons.kBumperRight).whileActive(new SpinRight());
    xbox.getButton(Buttons.kBumperLeft).whileActive(new SpinLeft());
  }
}
