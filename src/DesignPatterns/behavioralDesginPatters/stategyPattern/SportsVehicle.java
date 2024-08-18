package src.DesignPatterns.behavioralDesginPatters.stategyPattern;

import src.DesignPatterns.behavioralDesginPatters.stategyPattern.startegy.DriveStrategy;
import src.DesignPatterns.behavioralDesginPatters.stategyPattern.startegy.SportDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportDriveStrategy());
    }
}
