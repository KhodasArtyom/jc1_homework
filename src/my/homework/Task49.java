package my.homework;

import java.io.*;
import java.util.ArrayList;

public class Task49 {
    public static void main(String[] args) throws IOException {
        int[] array = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,95,90,95,100,120};

        FileOutputStream fos = new FileOutputStream("data.bin");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(array.length);

        for(int i = 0; i < array.length; i ++) {
            dos.writeInt((int)array[i]);
        }
        fos.close();


        int[] array2;

        FileInputStream fis = new FileInputStream("data.bin");
        DataInputStream dis = new DataInputStream(fis);

        int count = dis.readInt();

        array2 = new int[count];

        for(int i = 0; i < array2.length;i ++) {
            array2[i] = dis.readInt();
        }
            dis.close();

        System.out.println("Список чисел:");
        double average = 0;
        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
            if(array2.length > 0) {
                double sum =0;
                for(int j = 0; j < array2.length; j++) {
                    sum +=array2[j];
                }
                average = sum / array2.length;
            }

        }
        System.out.println("Среднее арифмитическое: " + average);





    }






    }


