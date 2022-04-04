package my.homework.Task34;

public class Ingineer extends Profession {
    int hour = 9;
    double salary = hour * 168;


    public Ingineer(String firstName, String position, double salary) {
        super(firstName, position, salary);
    }

    @Override
    public double paySalary() {
        return salary;

    }

}

