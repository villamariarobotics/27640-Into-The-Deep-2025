package org.firstinspires.ftc.teamcode.subsystems;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveSubsystem {

    static DcMotor left_motor;
    static DcMotor right_motor;
    public static void initialize(HardwareMap hwMap) {
        left_motor = hwMap.get(DcMotor.class, "left_motor");
        right_motor = hwMap.get(DcMotor.class, "right_motor");
        left_motor.setDirection(DcMotorSimple.Direction.REVERSE);
        left_motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        right_motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void turnMotors(float speed){
        right_motor.setPower(speed);
        left_motor.setPower(speed);
    }
    public void driveTank(float left_speed, float right_speed){
        left_motor.setPower(left_speed);
        right_motor.setPower(right_speed);
        telemetry.addData("right_motor power", right_speed);
        telemetry.addData("left_motor power", left_speed);
    }
}