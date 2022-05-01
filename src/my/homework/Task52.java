package my.homework;

import java.util.ArrayList;

public class Task52 implements Runnable{

    @Override
    public void run() {

        ArrayList<Integer> arrayList = new ArrayList<>();
       for(int i = 0; i < Math.random() * 40; i ++ ) {
           arrayList.add(i);
       }


        System.out.println(average(arrayList));
    }

    static double average(ArrayList<Integer> arrayList) {
        double sum = 0;

        for(int i = 0; i < arrayList.size();i ++) {
            sum+=arrayList.get(i);
        }
        return sum/arrayList.size();
    }


}

class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Task52());
        thread1.start();
        Thread.sleep(2000);

        Thread thread2 = new Thread(new Task52());
        thread2.start();
        Thread.sleep(1000);

        Thread thread3 = new Thread(new Task52());
        thread3.start();
        Thread.sleep(2000);

        Thread thread4 = new Thread(new Task52());
        thread4.start();
        Thread.sleep(2000);

        Thread thread5 = new Thread(new Task52());
        thread5.start();
        Thread.sleep(2000);

        Thread thread6 = new Thread(new Task52());
        thread6.start();
        Thread.sleep(2000);

        Thread thread7 = new Thread(new Task52());
        thread7.start();
        Thread.sleep(2000);

        Thread thread8 = new Thread(new Task52());
        thread8.start();
        Thread.sleep(2000);

        Thread thread9 = new Thread(new Task52());
        thread9.start();
        Thread.sleep(2000);

        Thread thread10 = new Thread(new Task52());
        thread10.start();
        Thread.sleep(2000);
    }


}
