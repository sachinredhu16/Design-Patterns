package src.DesignPatterns.structuralDesignPatterns.decoratorPattern;

public class Client {
    public static void main(String[] args) {
        FarmhousePizza farmhousePizza = new FarmhousePizza();
        ExtraMushroom extraMushroom = new ExtraMushroom(farmhousePizza);
        ExtraCheese extraCheese = new ExtraCheese(extraMushroom);

        System.out.println(extraCheese.cost());
    }
}
