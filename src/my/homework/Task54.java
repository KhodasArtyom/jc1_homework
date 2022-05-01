package my.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task54 implements Runnable {

    @Override
    public void run() {
        File file = new File("e://java/homework/src/my/homework/thread1.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }
            int[] array;
            array = new int[10];

            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 10) + 10);
                FileWriter writer = new FileWriter(file);
                writer.write(String.valueOf(array));
                writer.write(" ");

                }
            System.out.println("Массив" + Arrays.toString(array));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
class Main3{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task54());
        thread1.start();

        Thread thread2 = new Thread(new Task54());
        thread2.start();

        Thread thread3 = new Thread(new Task54());
        thread3.start();

        Thread thread4 = new Thread(new Task54());
        thread4.start();

        Thread thread5 = new Thread(new Task54());
        thread5.start();
    }
}