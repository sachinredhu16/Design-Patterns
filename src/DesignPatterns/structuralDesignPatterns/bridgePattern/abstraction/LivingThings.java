package src.DesignPatterns.structuralDesignPatterns.bridgePattern.abstraction;

import src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor.BreatheImplementor;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }
    abstract public void breatheProcess();

}
