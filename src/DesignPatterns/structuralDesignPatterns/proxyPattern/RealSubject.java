package src.DesignPatterns.structuralDesignPatterns.proxyPattern;

public class RealSubject implements Subject{
    @Override
    public void method() {
        System.out.println("Your are in Real Subject Class.");
    }
}
