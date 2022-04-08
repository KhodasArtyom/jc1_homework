package my.homework.Task38;

import java.util.Scanner;

public class Garage extends Vehicle {

    public String safeInGarage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Транспортное средство, которое хранится в моем гараже");
        String name2 = scanner.nextLine();

        if (name2.equals("BMW")) {
            System.out.println("В гараже стоит машина ");
        } else if (name2.equals("DUCATI")) {
            System.out.println("В гараже стоит мотоцикл");
        } else {
            System.out.println("Такого транспорта не найдено");
        }

        return name2;
    }
}
