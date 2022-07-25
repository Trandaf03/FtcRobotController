package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "teste")
public class servo extends LinearOpMode {

    private Servo ceva;
    @Override
    public void runOpMode() throws InterruptedException {


        ceva = hardwareMap.get(Servo.class, "servo");
        waitForStart();
        while(opModeIsActive() && !isStopRequested()){


            if(this.gamepad1.a)
                ceva.setPosition(0);

            if(this.gamepad1.b)
                ceva.setPosition(1);

        }
    }
}
