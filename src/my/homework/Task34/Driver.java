package my.homework.Task34;

public class Driver extends Profession{
    float ratePerHour = 9.00f;
    float hourly = ratePerHour * 40;
    float flight = 5.00f * 40;
    float mixPayment = hourly + flight;

    public Driver(String firstName, String position, double salary) {
        super(firstName, position, salary);
    }

    @Override
    public double paySalary() {
        return mixPayment;
    }
}
