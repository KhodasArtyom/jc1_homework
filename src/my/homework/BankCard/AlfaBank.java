package my.homework.BankCard;

 class AlfaBank extends BankCard {
     private String bankName;
     private int id;
     private int password;
     private double money;

     public AlfaBank(String bankName, int id, int password, double money) {
         this.bankName = bankName;
         this.id = id;
         this.password = password;
         this.money = money;

     }

     @Override
     protected void saveMoney(int money) {
         if (money < money) {
             System.out.println("Error.Check your balance");
         }
         this.money += money;
         System.out.println("Your balance is: " + this.money);

     }

     @Override
     protected void withdraw(int money) {
         if (this.money >= money) {
             this.money -= money;
             System.out.println("Balance is " + this.money);

         }
     }
 }