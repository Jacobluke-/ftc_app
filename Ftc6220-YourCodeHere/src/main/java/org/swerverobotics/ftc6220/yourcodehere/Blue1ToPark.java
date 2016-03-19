package org.swerverobotics.ftc6220.yourcodehere;

import org.swerverobotics.library.interfaces.Autonomous;

/**
 * Created by Mridula on 1/15/2016.
 */
@Autonomous(name = "AUTO Blue1 -> Park", group = "Swerve Examples")

public class Blue1ToPark extends MasterAutonomous
{
    @Override
    protected void main() throws InterruptedException
    {
        //Initialize our hardware
        initialize();

        // Wait until we've been given the ok to go
        waitForStart();

        initializeServoPositions();

        setAutoStartPosition(90);

        pause(2000);
        driveStraight(261, Constants.BACKWARDS, false);
        turnTo(45);
        driveStraight(75, Constants.BACKWARDS, false);
        pause(500);
        HikerDropper.slowToggle();
        pause(4000);
        driveStraight(75, Constants.FORWARDS * 0.4, false);
        HikerDropper.slowToggle();
        driveStraight(75, Constants.BACKWARDS * 0.4, false);
    }
}
