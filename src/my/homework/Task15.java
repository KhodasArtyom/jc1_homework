package my.homework;

public class Task15 {
    public static void main(String[] args) {
        System.out.print("Простые числа в этом промежутке: ");
        for (int i = 50; i <= 70; i++) {
            boolean x = true;
            boolean secondValue = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    x = false;
                    break;
                }
            }
            if (x) {
                    System.out.print(i + " " ); //Застрял, не получается вывести второе число

            }
        }
    }
}