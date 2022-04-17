package my.homework.TimeInterval;

public class Time {
    private int second;
    private int minute;
    private int hour;
    private int totalSec;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int totalSec) {

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }



    public void outputTime() {
        if((hour <= 23) && (hour >=0) &&((minute<=59) && (minute >=0) &&(second<=59) && (second >=0))) {
            System.out.println("Заданное время: "  + hour + ":" + minute + ":" + second);
        } else System.out.println("Error!");
    }

    public int returnSec() {

        System.out.println("Общее количество секунд:");

        return (this.hour * 3600) + (this.minute * 60) + this.second;
    }
    public void printReturnSec() {
        System.out.println(returnSec());

    }
    public void compareTime() {

    }

}
