package frc.robot.subsystems;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;


public class DifferentialDrivetrain extends SubsystemBase {

    public static final double PlaceDistance = 0.1;
    public static final double BackAwayDistance = 0.6;

    private PWMVictorSPX left1;
    private PWMVictorSPX left2;
    private PWMVictorSPX left3;
    private PWMVictorSPX right1;
    private PWMVictorSPX right2;
    private PWMVictorSPX right3;

    private DifferentialDrive drive;
    
    private Encoder leftEncoder;
    private Encoder rightEncoder;
    
    private AnalogGyro gyro;
    private AnalogInput rangeFinder;

    public DifferentialDrivetrain() {
        left1 = new PWMVictorSPX(0); //placeholders until channel config complete
        left2 = new PWMVictorSPX(2);
        addChild("left1", left1);
        right1 = new PWMVictorSPX(1);

    }
}

//may or may not be an actual drivetrain or just a base to write motors
//on subsystem 