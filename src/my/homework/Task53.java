package my.homework;

import java.util.Arrays;

public class Task53 implements Runnable {


    @Override
    public void run() {

        int max = 0;
        int[] array;
        array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10) + 10);
            if(array[i] > max) {
                max = array[i];
            }

            }
        System.out.println("Массив" + Arrays.toString(array));
        System.out.println("Максимальный элемент этого массива " + max);

            }


        }


class Main2 {
    public static void main(String[] args) throws InterruptedException {

       Thread thread1 = new Thread(new Task53());
       thread1.start();
       thread1.setName("Поток № 1");
        System.out.println(thread1.getName());
        Thread.sleep(3000);

        Thread thread2 = new Thread(new Task53());
        thread2.start();
        thread2.setName("Поток № 2");
        System.out.println(thread2.getName());
        Thread.sleep(3000);

        Thread thread3 = new Thread(new Task53());
        thread3.start();
        thread3.setName("Поток № 3");
        System.out.println(thread3.getName());
        Thread.sleep(3000);

        Thread thread4 = new Thread(new Task53());
        thread4.start();
        thread4.setName("Поток № 4");
        System.out.println(thread4.getName());
        Thread.sleep(3000);

        Thread thread5 = new Thread(new Task53());
        thread5.start();
        thread5.setName("Поток № 5");
        System.out.println(thread5.getName());
        Thread.sleep(3000);

        Thread thread6 = new Thread(new Task53());
        thread6.start();
        thread6.setName("Поток № 6");
        System.out.println(thread6.getName());
        Thread.sleep(3000);

        Thread thread7 = new Thread(new Task53());
        thread7.start();
        thread7.setName("Поток № 7");
        System.out.println(thread7.getName());
        Thread.sleep(3000);

        Thread thread8 = new Thread(new Task53());
        thread8.start();
        thread8.setName("Поток № 8");
        System.out.println(thread8.getName());
        Thread.sleep(3000);

        Thread thread9 = new Thread(new Task53());
        thread9.start();
        thread9.setName("Поток № 9");
        System.out.println(thread9.getName());
        Thread.sleep(3000);

        Thread thread10 = new Thread(new Task53());
        thread10.start();
        thread10.setName("Поток № 10");
        System.out.println(thread10.getName());
        Thread.sleep(3000);



    }

}
