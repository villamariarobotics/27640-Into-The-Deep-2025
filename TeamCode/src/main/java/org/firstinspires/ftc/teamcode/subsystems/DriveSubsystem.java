package org.firstinspires.ftc.teamcode.subsystems;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveSubsystem {

    private DcMotor left_motor;
    private DcMotor right_motor;

    public void init(@NonNull HardwareMap hardwareMap) {
        left_motor = hardwareMap.get(DcMotor.class, "left_motor");
        right_motor = hardwareMap.get(DcMotor.class, "right_motor");

        left_motor.setDirection(DcMotor.Direction.REVERSE);
        right_motor.setDirection(DcMotor.Direction.FORWARD);

        left_motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right_motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void drive(double left_power, double right_power) {
        left_motor.setPower(left_power);
        right_motor.setPower(right_power);
    }

    public void stop() {
        left_motor.setPower(0);
        right_motor.setPower(0);
    }
}
