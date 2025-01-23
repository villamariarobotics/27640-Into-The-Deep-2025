package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class BasketSubsystem {
    static DcMotor basket_motor;

    public void initialize(HardwareMap hwMap) {
        basket_motor = hwMap.get(DcMotor.class, "basket_motor");
        //ExtendA_motor.setDirection(DcMotorSimple.Direction.REVERSE);//
        basket_motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void Basket_control(float left_trigger) {
        if (left_trigger == 0.0) {
            basket_motor.setPower(0);

        } else if (left_trigger == 1.0) {
            basket_motor.setPower(.5);

        }
        if (left_trigger == 0.0) {
            basket_motor.setPower(-.5);
        }
    }
}
