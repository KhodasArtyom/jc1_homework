package my.homework;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task46 {
    public static void main(String[] args) {
        File dir = new File("/E:/java/");


        if (dir.isDirectory()) {

            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println(file.getName() + "\t директория");
                } else {
                    System.out.println(file.getName() + "\t файл");
                }

            }

        }
    }
}




