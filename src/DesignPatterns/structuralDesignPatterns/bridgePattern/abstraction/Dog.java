package src.DesignPatterns.structuralDesignPatterns.bridgePattern.abstraction;

import src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor.BreatheImplementor;

public class Dog extends LivingThings{

    @Override
    public void breatheProcess() {
        super.breatheImplementor.breathe();
    }

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }
}
