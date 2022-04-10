package my.homework.Task41;

import java.util.*;


public class HighestScore {

    int elements = 10;



    public void getHighestScore() {
        List<Integer> marksList = new ArrayList<>();

        for(int i = 0; i < elements;i++) {
            int x = (int)(Math.random() * 10 + 1);
            marksList.add(x);
        }
        System.out.println("Массив из оценок: " + marksList);
        int max = marksList.get(0);
        for(Integer integer: marksList) {
            if(integer > max)
                max = integer;
        }
        System.out.println("Максимальное значение в этом массиве оценок: " + max);

        }
    }

