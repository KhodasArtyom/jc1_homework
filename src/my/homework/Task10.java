package my.homework;

public class Task10 {
    public static void main(String[] args) {

        int e = 5, f = 6, a = 4, b = 2, c = 3, d = 1;

        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("1 Помещаются");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("2 Помещаются");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("3 Помещаются");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("4 Помещаются");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("5 Помещаются");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("6 Помещаются");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("7 Помещаются");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("8 Помещаются");
        }
        else
            System.out.println("Не влезут два участок данного размера");
    }
}