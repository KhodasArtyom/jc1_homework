package my.homework.Task24;

public class TimeInterval {
    private int hour;
    private int minute;
    private int second;

    public TimeInterval(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeInterval(int allseconds) {
        second = allseconds;
    }

    public int returnAllSeconds() {
        return (hour * 3600) + (minute * 60) + second;

    }

    public void printAllSeconds() {
        System.out.println("Общее количество секунд в Object № 1 = " + second);
    }

    public void printDividedTime() {
        System.out.println(String.format("Object2 = %s hours, %s minutes, %s seconds", hour, minute,second));
    }

    public int compareTime() {
        if(this.second >= this.returnAllSeconds()){
            System.out.println("Object1 >= Object2");
        } else {
            System.out.println("Object1 < Object2");
        }
        return this.second - this.returnAllSeconds();

    }


}
