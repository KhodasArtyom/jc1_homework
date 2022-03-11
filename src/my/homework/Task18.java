package my.homework;

public class Task18 {
    public static void main(String[] args) {
        int [] massive = new int [10];
        for(int i = 0; i < massive.length;i ++) {
            massive[i] = i + 1;
            System.out.print(massive[i] + " , " );
        }
        System.out.println();
        System.out.println("Последний элемент массива: " + massive[9]);


    }

}
