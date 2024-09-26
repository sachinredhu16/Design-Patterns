package src.DesignPatterns.structuralDesignPatterns.bridgePattern.implementor;

public class WaterBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        // breathe through Gills
        // absorb oxygen from water
        // release carbon dioxide
        System.out.println("breathe through Gills | absorb oxygen from water | release carbon dioxide");
    }
}
