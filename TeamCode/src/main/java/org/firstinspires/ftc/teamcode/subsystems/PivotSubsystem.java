package org.firstinspires.ftc.teamcode.subsystems;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class PivotSubsystem {
    static DcMotor pivot_motor;

    public static void initialize(HardwareMap hwMap) {
            pivot_motor = hwMap.get(DcMotor.class, "pivot_motor");
            //pivot_motor.setDirection(DcMotorSimple.Direction.REVERSE);//
            pivot_motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void turnMotor(float speed){
        pivot_motor.setPower(speed);
    }
    public void pivotSpeed(float left_speed){
        pivot_motor.setPower(left_speed);
        telemetry.addData("pivot_motor", "pivot_speed");
    }
}
