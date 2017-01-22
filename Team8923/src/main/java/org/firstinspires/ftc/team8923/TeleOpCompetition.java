package org.firstinspires.ftc.team8923;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * This class contains code for running the robot with all driver controls
 */
@TeleOp(name = "TeleOp Competition")
public class TeleOpCompetition extends MasterTeleOp
{
    @Override
    public void runOpMode() throws InterruptedException
    {
        initHardware();

        waitForStart();

        while(opModeIsActive())
        {
            // Run all of the mechanisms
            driveMecanumTeleOp();
            controlBeaconPusher();
            runLift();
            runCollector();
            controlCatapult();

            sendTelemetry();
            idle();
        }
    }
}
