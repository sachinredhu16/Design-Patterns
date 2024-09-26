package src.DesignPatterns.structuralDesignPatterns.bridgePattern;

import src.DesignPatterns.structuralDesignPatterns.bridgePattern.abstraction.Dog;
import src.DesignPatterns.structuralDesignPatterns.bridgePattern.abstraction.LivingThings;
import src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor.BreatheImplementor;
import src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor.LandBreatheImplementor;
import src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor.WaterBreatheImplementor;

public class Client {
    public static void main(String[] args) {
        BreatheImplementor breatheImplementor = new LandBreatheImplementor();
        LivingThings livingThings = new Dog(breatheImplementor);
        livingThings.breatheProcess();


        LivingThings livingThings1 = new Dog(new WaterBreatheImplementor());
        livingThings1.breatheProcess();
    }
}
