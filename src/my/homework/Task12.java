package my.homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        outPut();
        calculateFactorial();
            }
    public static void outPut() {
        System.out.print("Найти факториал числа до 10: ");
    }


    public static int calculateFactorial () {
    Scanner scanner = new Scanner(System.in);

        while (true) {
            int value = scanner.nextInt();
            long i = 1;
            long factorial = 1;
            while (i <= value) {
                factorial *= i;
                i++;
            }
            if (value > 10) {
                System.out.println("Вы ввели число больше 11");
                System.exit(0);
            } else {
                System.out.println("Факториал числа " + value + " = " + factorial);
            }
        }
    }

    }





