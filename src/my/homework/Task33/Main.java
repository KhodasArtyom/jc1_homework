package my.homework.Task33;

public class Main {
    public static void main(String[] args) {
        BankCard bankCard1 = new SberbankCard("SBERBANK",5435-3610-4514-0200,1111,1000.00);
        bankCard1.saveMoney(400);
        bankCard1.withdraw(300);

        BankCard bankCard2 = new AlfaBank("AlfBank",1111-3451-7865-9987,1234,15000.00);
        bankCard2.saveMoney(3000);
        bankCard2.withdraw(7640);

        BankCard bankCard3 = new BelarusBank("BELARUSBANK",6574-1245-2366-2356,8756,130.00);
        bankCard3.saveMoney(200);
        bankCard3.withdraw(100);

    }
}
