package src.DesignPatterns.structuralDesignPatterns.flyWeightPattern;

public class Client {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getCat("Cat");
        cat.sprintAttributes();
        Animal cat1 = AnimalFactory.getCat("Cat");
        cat1.sprintAttributes();

        Animal dog = AnimalFactory.getCat("Dog");
        dog.sprintAttributes();
        Animal cow = AnimalFactory.getCat("Cow");
        cow.sprintAttributes();

        System.out.println(cat);
        System.out.println(cat1);
    }
}
