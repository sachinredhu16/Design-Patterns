package src.DesignPatterns.behavioralDesginPatters.stategyPattern.startegy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving in normal strategy");
    }
}
