package my.homework.Task32;

public class VacuumCLeaner extends Appliances {
    String name;

    public VacuumCLeaner(String name) {
        this.name = name;
    }


    @Override
    public void socketStatus() {
        System.out.println(this.name + " не включен  в розетку");
    }
}