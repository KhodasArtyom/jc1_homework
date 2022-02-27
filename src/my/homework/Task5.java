package my.homework;

public class Task5 {
    public static void main(String[] args) {
        long s = 86400 ;
        long sec = s % 60;
        long m = (s - sec) /60;
        long min = m % 60;
        long h = (m - min) / 60;
        long d = s / (3600 * 24);
        long week = d / 7;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд" + " , " + d + " суток " + week + " недель" );
    }
}
