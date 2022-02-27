package my.homework;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(weekDay(2));


    }

    public static int weekDay(int x) {
        if(x == 1) {
            System.out.println("Понедельник. Нужно заказать холодильник для бабушки");
        } else if(x == 2){
            System.out.println("Вторник. Обязательно сходить на занятия по программированию");
        } else if (x == 3) {
            System.out.println("Среда. Сходить в тренажерный зал");
        } else if (x == 4) {
            System.out.println("Четверг. Сделать домашнее задание и сходить в тренажерный зал");
        } else if ( x==5) {
            System.out.println("Пятница. Сходить в бра с друзьями");
        } else if (x ==6) {
            System.out.println("Суббота. Заняться уборкой в моем доме");
        } else if ( x ==7) {
            System.out.println("Воскресенье. Требуется отдохнуть перед рабочей неделей");

        }
        return x;


    }
}