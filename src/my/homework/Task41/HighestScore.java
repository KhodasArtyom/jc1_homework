package my.homework.Task41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HighestScore {

    int elements = 10;


    public void getHighestScore() {
        List<Integer> marksList = new ArrayList<>();

        for(int i = 0; i < elements;i++) {
            int x = (int)(Math.random() * 10 + 1);
            marksList.add(x);
        }
        System.out.println("Массив из оценок: " + marksList);
        System.out.println("Максимальное значение в этой коллеции оценок: " + Collections.max(marksList));
    }
}
