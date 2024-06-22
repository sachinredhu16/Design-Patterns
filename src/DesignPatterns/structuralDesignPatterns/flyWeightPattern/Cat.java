package src.DesignPatterns.structuralDesignPatterns.flyWeightPattern;

public class Cat implements Animal{

    public String name = null;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sprintAttributes() {
        System.out.println("Name of Animal is : "+name);
        System.out.println("Number of nose is : "+CommonAttributes.nose);
        System.out.println("Number of eyes is : "+CommonAttributes.eyes);
        System.out.println("Number of legs is : "+CommonAttributes.legs);
        System.out.println("Number of tail is : "+CommonAttributes.tail);

    }
}
