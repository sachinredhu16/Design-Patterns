package src.DesignPatterns.structuralDesignPatterns.CompositeDesignPattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String name){
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    // problem is typecasting we type of file changes we need to change the logic here
    public void ls(){
        System.out.println("Directory Name: " + directoryName);
        for(Object obj: objectList) {

            if(obj instanceof File) {
                ((File) obj).ls();
            }
            else if(obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }
}
