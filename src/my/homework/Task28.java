package my.homework;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        LastLetters lastLetters = new LastLetters();
        lastLetters.findLastLetters();
    }
}

class LastLetters {
    public void findLastLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        String words [] = str.split("\\s+");
        for(String word: words){
            sb.append(word.toCharArray()[word.length() - 1]);
        }
        System.out.println("Реузльтат: " + sb.toString());
    }


}