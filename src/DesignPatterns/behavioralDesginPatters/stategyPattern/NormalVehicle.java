package src.DesignPatterns.behavioralDesginPatters.stategyPattern;

import src.DesignPatterns.behavioralDesginPatters.stategyPattern.startegy.DriveStrategy;
import src.DesignPatterns.behavioralDesginPatters.stategyPattern.startegy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
