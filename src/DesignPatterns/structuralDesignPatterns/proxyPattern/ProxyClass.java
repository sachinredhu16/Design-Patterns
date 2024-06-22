package src.DesignPatterns.structuralDesignPatterns.proxyPattern;

public class ProxyClass extends RealSubject{

    @Override
    public void method(){
        System.out.println("This is proxy class and perferm some check ,authentication on request !");

        System.out.println("Once this is authenticated call Real subject method .....");
        super.method();
    }
}
