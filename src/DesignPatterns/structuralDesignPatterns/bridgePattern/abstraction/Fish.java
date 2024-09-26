package src.DesignPatterns.structuralDesignPatterns.bridgePattern.abstraction;

import src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor.BreatheImplementor;

public class Fish extends LivingThings{

    @Override
    public void breatheProcess() {
        super.breatheImplementor.breathe();
    }

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }
}
