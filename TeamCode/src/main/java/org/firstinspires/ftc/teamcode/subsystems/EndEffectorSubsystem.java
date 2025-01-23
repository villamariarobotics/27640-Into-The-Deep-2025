package org.firstinspires.ftc.teamcode.subsystems;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.CRServo;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class EndEffectorSubsystem {
    static CRServo servo_motor;

    public static void initialize (HardwareMap hwMap) {
        servo_motor = hwMap.get(CRServo.class, "servo_motor");
    }
    public void turnMotors(float speed){
        servo_motor.setPower(speed);
    }
    public void EndEffector_control (float speed){
        servo_motor.setPower(speed);
        telemetry.addData("servo_motor", "servo_speed");
    }

    }
