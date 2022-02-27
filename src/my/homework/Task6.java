package my.homework;

public class Task6 {
    public static void main(String[] args) {
        boolean a = methodName(678);
        System.out.println(a);

    }

    public static  boolean methodName (int x) {
        if(x % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}
