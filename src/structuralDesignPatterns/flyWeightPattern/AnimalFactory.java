package src.structuralDesignPatterns.flyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {

    private static Map<String,Animal> animalMap = new HashMap<>();

    public static Animal getCat(String name){
        String key = name+"-CAT";

        Animal animal = animalMap.get(key);
        if(null != animal)
            return animal;
        Animal temp = new Cat();
        temp.setName(name);
        animalMap.put(key,temp);
        return temp;
    }
    public static Animal getDog(String name){
        String key = name+"-DOG";

        Animal animal = animalMap.get(key);
        if(null != animal)
            return animal;
        Animal temp = new Dog();
        temp.setName(name);
        animalMap.put(key,temp);
        return temp;
    }
    public static Animal getCow(String name){
        String key = name+"-COW";

        Animal animal = animalMap.get(key);
        if(null != animal)
            return animal;
        Animal temp = new Cow();
        temp.setName(name);
        animalMap.put(key,temp);
        return temp;
    }
}
