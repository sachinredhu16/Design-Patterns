package src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor;

public class LandBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        // breathe through Nose
        // inhale oxygen from Air
        // exhale carbon dioxide
        System.out.println("breathe through Nose | inhale oxygen from Air | exhale carbon dioxide");
    }
}
