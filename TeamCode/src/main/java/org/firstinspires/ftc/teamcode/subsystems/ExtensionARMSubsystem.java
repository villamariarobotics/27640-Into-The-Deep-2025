package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ExtensionARMSubsystem {
    static DcMotor ExtendA_motor;

    public static void initialize(HardwareMap hwMap) {
        ExtendA_motor = hwMap.get(DcMotor.class, "ExtendA_motor");
        //ExtendA_motor.setDirection(DcMotorSimple.Direction.REVERSE);//
        ExtendA_motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void exArm_control (float right_trigger) {
        if (right_trigger  == 0.0) {
            ExtendA_motor.setPower(0);

        } else if(right_trigger  == 1.0) {
            ExtendA_motor.setPower(.5);

        }
    }

    }


