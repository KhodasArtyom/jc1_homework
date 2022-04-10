package my.homework.Task40;

import java.util.*;

public class RandomNumbers {

    int elements = 10;

    public void removeDuplicateNumbers() {
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < elements;i ++) {
            int x = (int) (Math.random()* 10 + 1);
            arrayList.add(x);
        }
        System.out.println("Массив из элементов: " + arrayList);

        arrayList.stream().distinct();
        Set<Integer> set = new LinkedHashSet<>(arrayList);
        System.out.println("Масив без повторяющихся элеметов" + set);

    }

}
