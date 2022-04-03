package my.homework.Task32;

public class Fridge extends Appliances {
    String name;

    public Fridge(String name) {
        this.name = name;
    }

   @Override
   public void socketStatus () {
       System.out.println(this.name + "  включен в розетку");
   }
}
