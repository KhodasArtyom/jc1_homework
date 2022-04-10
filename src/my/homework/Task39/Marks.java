package my.homework.Task39;

import java.util.ArrayList;
import java.util.List;

public class Marks {
    int amountOfElem = 10;
    int negative = 5;





    public void fillArray() {
        List<Integer> marksList = new ArrayList<>(amountOfElem);
        for(int i = 0;i < amountOfElem;i ++) {
            int x = (int)(Math.random() * 10 + 1 );
            marksList.add(x);

        }
        System.out.println("Массив из оценок: " + marksList);

        List<Integer> negativeMarks = new ArrayList<>();
        for(int i = 0; i < amountOfElem; i++) {
            int a = marksList.get(i);
            if(a <= negative) {
                negativeMarks.add(a);
            }
        }
        System.out.println("Массив из плохиц оценок: " + negativeMarks);
        marksList.removeAll(negativeMarks);
        System.out.println("Список без плохих оценок: " + marksList);
    }


    public void delBadMarks () {

    }
}
