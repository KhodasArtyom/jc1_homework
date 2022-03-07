package my.homework;

import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers());

    }
    public static long sumOfNumbers() {
        long number = 7_893_823_445l;
        long sum =0;
        do {
            sum = sum + (number % 10);
        } while ((number /=10) !=0);
        return sum;
    }
}