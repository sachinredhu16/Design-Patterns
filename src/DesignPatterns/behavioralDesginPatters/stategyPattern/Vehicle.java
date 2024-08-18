package src.DesignPatterns.behavioralDesginPatters.stategyPattern;

import src.DesignPatterns.behavioralDesginPatters.stategyPattern.startegy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy= null;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
