package my.homework.Task34;

import java.util.Scanner;

public class SalesManager extends Profession {
    float fridgePrice = 1500.00f;
    int x = 15;
    float PercentageOfTheTransaction = 0.25f * x;
    Scanner scanner = new Scanner(System.in);

    public SalesManager(String firstName, String position, double salary) {
        super(firstName, position, salary);
    }

    public void quantityOfGoodsSold() {
        System.out.println("Количество проданных холодильников:" + x);

    }
    @Override
    public double paySalary() {
        System.out.println();;
        return PercentageOfTheTransaction * 100;
    }
}
