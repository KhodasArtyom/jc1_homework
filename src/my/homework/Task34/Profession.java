package my.homework.Task34;

public abstract class Profession {
    protected String Name;

    protected String position;
    protected double salary;

    public Profession(String firstName, String position, double salary) {
        this.Name = firstName;
        this.position = position;
        this.salary = salary;
    }



    public String getName() {
        return Name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double paySalary() {
        return 0;
    }




    }




