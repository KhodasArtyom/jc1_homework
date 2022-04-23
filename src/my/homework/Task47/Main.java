package my.homework.Task47;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println ("Колиество слов в тексте:");
        FileReader fr = new FileReader ("text3");
        BufferedReader br = new BufferedReader (fr);
        String line = br.readLine ();
        int count = 0;
        while (line != null) {
            String []parts = line.split(" ");
            for( String w : parts)
            {
                count++;
            }
            line = br.readLine();
        }
        System.out.println(count);
        System.out.println();


        BufferedReader bufferedReader = new BufferedReader(new FileReader("text3"));
        String res = bufferedReader.readLine();
        while(res!=null) {
            System.out.println(res);
            res = bufferedReader.readLine();
        }

        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("text3"));
        String res2 = bufferedReader2.readLine();
        int before = res2.length();
        int after = res2.replaceAll("[, .]", "").length();
        System.out.println("Количество знаков препинания: " + (before - after));




        }

    }


