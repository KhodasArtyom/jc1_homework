package my.homework;

public class Task20 {
    public static void main(String[] args) {

        int massive[] = new int[10];
        int maxValue = massive[0];
        int maxIndex = 0;
        System.out.print("Массив целочисленных чисел: ");
        int index = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 10);
            System.out.print(+massive[i] + " ");
            if (maxValue <= massive[i]) {
                maxValue = massive[i];
                maxIndex = i;

            }
        }
        System.out.println();

        System.out.println("Максимальное значение этого массива = " + maxValue);
        System.out.println("Индекс максимального начения =  " + maxIndex);




    }
}
