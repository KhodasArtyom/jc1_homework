package my.homework;


public class Task4 {
    public static void main(String[] args) {
        int x = methodName(50, 6);
        System.out.println("The result of this method is: " + x);
    }
    public static int methodName(int a, int b){
        int sum = a + b;
        int multi = a * b;
        return sum + multi;
    }


}

