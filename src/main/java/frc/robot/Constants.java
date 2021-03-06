package frc.robot;

public class Constants {
    private Constants() {}

    private static Constants instance = new Constants();

    public static Constants getConstants() {
        return instance;
    }

    public double indexer_speed = 0.8;
    public double feeder_speed = 1.0;
    public double intake_speed = 1.0;

    public double shoot_speed = 1.0;

    public double autointake_threshold = 80;
    public double autointake_speed = 0.4;
    public double autointake_speed_top = 0.2;
    public double autointake_speed_kickback = -0.4;
    public double autointake_delay = 0.2;
    public double colorwheel_past = 2;

    public double shooterP = 0.0011;
    public double shooterI = 0;
    public double shooterD = 4;
    public double shooterF = 0.00017;

    public double visionP = -0.04;
    public double visionLimit = 0.5;

    public double debugShooterSet = -4000;

    public double colorwheel_slow = 0.2;
    public double colorwheel_fast = 0.3;
    public double colorwheel_ticks = 110;

    public double climber_limit = 175;

    public byte panelsToSpin = 26;
}