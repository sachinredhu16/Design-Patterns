package src.DesignPatterns.structuralDesignPatterns.AdapterDesignPattern.Client;

import src.DesignPatterns.structuralDesignPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import src.DesignPatterns.structuralDesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import src.DesignPatterns.structuralDesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
