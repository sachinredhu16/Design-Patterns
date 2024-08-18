package src.DesignPatterns.behavioralDesginPatters.CommandDesignPattern;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc() {
        this.isOn = true;
        System.out.println("Ac is ON");
    }
    public void turnOffAc() {
        this.isOn = false;
        System.out.println("Ac is Off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is : "+temperature);
    }
}
