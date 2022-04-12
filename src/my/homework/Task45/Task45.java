package my.homework.Task45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не найдено");
        }
    }




        public static void readFile() throws FileNotFoundException{
            File file = new File("asdf");
            Scanner scanner = new Scanner(file);

        }


    }

