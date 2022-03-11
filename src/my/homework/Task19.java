package my.homework;

public class Task19 {
    public static void main(String[] args) {
        int[]m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Элементы, стоящие на четных позициях: " );
        for (int i = 0; i < m.length; i ++) {
            if(i % 2 == 0 ) {
                System.out.print(m[i] + " ");
            }
        }
    }
}
