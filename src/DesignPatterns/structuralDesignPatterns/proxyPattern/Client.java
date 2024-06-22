package src.DesignPatterns.structuralDesignPatterns.proxyPattern;

public class Client {
    public static void main(String[] args) {

        Subject subject = new ProxyClass();
        subject.method();
    }
}
