package my.homework.Task32;

public class Main {
    public static void main(String[] args) {
        Appliances appliances1 = new Microwave("Микроволновка");
        appliances1.socketStatus();

        Appliances appliances2 = new Fridge("Холодильник");
        appliances2.socketStatus();

        Appliances appliances3 = new VacuumCLeaner("Пылесос");
        appliances3.socketStatus();

    }
}
