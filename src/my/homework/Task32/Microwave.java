package my.homework.Task32;

public class Microwave extends Appliances {
    String name;

    public Microwave(String name) {
        this.name = name;
    }

    @Override
    public void socketStatus() {
        System.out.println(this.name + "  включена в розетку");
    }
}



