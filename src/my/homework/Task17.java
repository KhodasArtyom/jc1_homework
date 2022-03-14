package my.homework;

import java.text.DecimalFormat;
import java.util.Scanner;
//Использовал класс DecimalFormat для форматирования числа в JAVA;
public class Task17 {
    public static void main(String[] args) {
        System.out.println("Введите любое число: ");
        while (true) {
            Scanner s = new Scanner(System.in);
            long val = s.nextLong();
            DecimalFormat df = new DecimalFormat("##,###,###");
            System.out.println(df.format(val));

        }
    }
}