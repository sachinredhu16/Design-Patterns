package src.DesignPatterns.behavioralDesginPatters.CommandDesignPattern;

import java.util.Stack;

//Invoker
public class MyRemoteControl {

    Stack<ICommand> commandHistory;
    ICommand iCommand;

    public MyRemoteControl() {
        commandHistory = new Stack<>();
    }

    public void setCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void pressButton() {
        this.iCommand.execute();
        commandHistory.add(this.iCommand);
    }
    public void undo(){
        while (!commandHistory.isEmpty()){
            commandHistory.pop().undo();
        }
    }
}
