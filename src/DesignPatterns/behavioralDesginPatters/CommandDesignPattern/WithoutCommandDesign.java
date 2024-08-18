package src.DesignPatterns.behavioralDesginPatters.CommandDesignPattern;

public class WithoutCommandDesign {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOnAc();
        airConditioner.setTemperature(20);
        airConditioner.turnOffAc();
    }
/*
    * Problem with above implementation:
Lack of Abstraction:
Today, process of turning on AC is simple, but if there are more steps, client has to aware all of that, which is not good.

Undo/Redo Functionality:
What if I want to implement the undo/redo capability. How it will be handled.

Difficulty in Code Maintenance:
What if in future, we have to support more commands for more devices example Bulb.
*/
}
