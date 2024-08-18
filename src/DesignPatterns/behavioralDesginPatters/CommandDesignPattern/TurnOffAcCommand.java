package src.DesignPatterns.behavioralDesginPatters.CommandDesignPattern;

public class TurnOffAcCommand implements ICommand{
    AirConditioner ac ;

    public TurnOffAcCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.turnOffAc();
    }

    @Override
    public void undo() {
        this.ac.turnOnAc();
    }
}
