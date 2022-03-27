package my.homework;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        countWords.countWords();
    }
}
class CountWords {

    public void countWords() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = sc.nextLine();
        int count = 0;
        if(str.length() !=0) {
            count++;
        }
        for( int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Вы ввели " + count + "слова");
    }
}
