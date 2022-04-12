package my.homework.Task42;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMapCollection {

    public void countWords(){

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String words[] = text.split(" ");
        HashMap<String,Integer> keyvalue = new HashMap<>();
        for(int i = 0;i<words.length;i++) {
            if(keyvalue.containsKey(words[i])) {
                int counter = keyvalue.get(words[i]);
                keyvalue.put(words[i],counter+ 1);
            } else {
                keyvalue.put(words[i], 1);
            }

        }
        System.out.println(keyvalue);
    }


}
