package my.homework.Task34;

public class Main {
    public static void main(String[] args) {
        Ingineer profession1 = new Ingineer("Artyom","Ingineer",1512.00);
        System.out.println(profession1.getSalary());
        Driver profession2 = new Driver("Nikolay","Водитель",560);
        System.out.println(profession2.paySalary());
        SalesManager profession3 = new SalesManager("Nikita","Sales Manager",1300);
        System.out.println(profession3.paySalary());




    }
}
