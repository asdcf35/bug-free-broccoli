package org.firstinspires.ftc.teamcode.decode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

//single motor that loads balls
public class Loader {

    private final Servo loaderServo;
    private DcMotor loaderMotor;

    public Loader(HardwareMap hardwareMap){
        loaderServo = hardwareMap.get(Servo.class, "servoTransfer");
    }

    public void setLoaderPosition (double power) {
        loaderServo.setPosition(power);
    }

//    public void turnToShootPosition() {
//        loaderServo.setPosition(0);
//    }
//    public void turnToOffPosition(){
//        loaderServo.setPosition(0.84);
//    }

    public void stop(){loaderMotor.setPower(0);}
}
