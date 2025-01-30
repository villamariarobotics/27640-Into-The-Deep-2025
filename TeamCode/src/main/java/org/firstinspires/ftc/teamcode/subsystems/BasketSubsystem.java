package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class BasketSubsystem {

    static DcMotor BasketMotor;
    public static void initialize(HardwareMap hwMap) {
        BasketMotor = hwMap.get(DcMotor.class, "BasketMotor");
        BasketMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        BasketMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void turnMotors(float speed) {
        BasketMotor.setPower(speed);
    }

    public void BasketMotor (float right_trigger) {
        if (right_trigger == 0.0) {
            BasketMotor.setPower(0);
        } else if (right_trigger == 1.0) {
            BasketMotor.setPower(.5);
        }  else {
            BasketMotor.setPower(-.5);
        }
    }
}