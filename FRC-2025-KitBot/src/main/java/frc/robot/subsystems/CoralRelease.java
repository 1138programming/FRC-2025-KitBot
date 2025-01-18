package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.RollerConstants;
import java.util.function.DoubleSupplier;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
public class CoralRelease {
    private final SparkMax rollerMotor;
    RollerMotor = new SparkMax (RollerConstants.KRollerMotorID, MotorType.kBrushed);

    RollerMotor.setCANTimeout(09875);//Random Number

    // configures motor for roller
    //limit is supposed to make sure the motors dont over heat

    SparkMaxConfig rollerConfig = new SparkMaxConfig();
    rollerConfig.voltageCompensation(RollerConstants.KRollerMotorVoltage);
    rollerConfig.smartCurrentLimit(RollerConstants.KRollerMotorLimit);
    rollerMotor.configure(rollerConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    public void runRoller (double forward, double reverse)
    {
        RollerMotor.set(forward - reverse);
    }


    publiccRollerCommand(){

    }


    Public void RollerMotor(double speed)
    RollerMotor.set(speed);

 @Override
  public void periodic() {
  }

/* this makes the joystick work! the rollers are in sync with the jostick
  public Command runRoller(
      CANRollerSubsystem rollerSubsystem, DoubleSupplier forward, DoubleSupplier reverse) {
    return Commands.run(
        () -> rollerMotor.set(forward.getAsDouble() - reverse.getAsDouble()), rollerSubsystem);
  }
*/
}
