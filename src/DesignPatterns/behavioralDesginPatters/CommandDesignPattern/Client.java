package src.DesignPatterns.behavioralDesginPatters.CommandDesignPattern;

public class Client {

    // Client -> Invoker -> Command -> Receiver.
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();


        MyRemoteControl myRemoteControl = new MyRemoteControl();

        myRemoteControl.setCommand(new TurnOnAcCommand(airConditioner));
        myRemoteControl.pressButton();

        myRemoteControl.setCommand(new TurnOffAcCommand(airConditioner));
        myRemoteControl.pressButton();

        myRemoteControl.undo();

    }
}
