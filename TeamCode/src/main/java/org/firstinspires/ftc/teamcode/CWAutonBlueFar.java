package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Blue Far")
public class CWAutonBlueFar extends CWAuton {

    @Override
    public void runOpMode(){
        // INITIALIZATION --------------------------------------------------------------------------
        super.runOpMode();

        waitForStart();

        // 30 SEC AUTONOMOUS PERIOD ----------------------------------------------------------------

        // 1 Do the jewel thing
        motionlessJewelRoutine(BLUE);

        // 3 Rotate towards glyph boxes
        encoderDrive(turnDis(0.45),-turnDis(0.45), 0.75);

        // 4 Drive into the glyph zone
        encoderDrive(-41, -42, 0.75);
    }
}
