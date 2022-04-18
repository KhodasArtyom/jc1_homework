package my.homework.Task24;

public class Main {
    // Как получилось и как я понимаю эту задачу.
    public static void main(String[] args) {
        TimeInterval object1 = new TimeInterval(3600);
        TimeInterval object2 = new TimeInterval(1,0,00);
        object1.printAllSeconds();
        object2.printDividedTime();
        object2.compareTime();

    }
}
