package src.DesignPatterns.structuralDesignPatterns.decoratorPattern;

public class Client {
    public static void main(String[] args) {
        FarmhousePizza farmhousePizza = new FarmhousePizza();
        ExtraMushroom extraMushroom = new ExtraMushroom(farmhousePizza);
        ExtraCheese extraCheese = new ExtraCheese(extraMushroom);

        System.out.println(farmhousePizza.cost());
        System.out.println(extraMushroom.cost());
        System.out.println(extraCheese.cost());
        System.out.println(farmhousePizza.cost());
    }
}
