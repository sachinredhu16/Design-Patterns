package src.SolidPrinciples.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        // We need to put only genric method in parent class otherwise code will break at a moment of enhancement.

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle());
        vehicleList.add(new Car());
        vehicleList.add(new Cycle());

        for (Vehicle vehicle:vehicleList)
            System.out.println(vehicle.noOfwheels().toString());
    }
}
