package my.homework.Task38;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("BMW"));
        vehicles.add(new Motorcycle("Ducati"));

        Garage myGarage = new Garage();
        System.out.println(myGarage.safeInGarage());
    }
}