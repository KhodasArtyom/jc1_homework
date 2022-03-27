package my.homework;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        FindCharsInString findCharsInString = new FindCharsInString();
        findCharsInString.findCharInsString();
    }
}

 class FindCharsInString {

     public void findCharInsString() {

         String str = "Тестова строка, для подсчета, знаков препинания,,.";
         int start = str.length();
         int finish = (str.replaceAll("[,.]","").length());
         System.out.println("Количество знаков препинания в тексте:" + (start - finish));


             }
     }



