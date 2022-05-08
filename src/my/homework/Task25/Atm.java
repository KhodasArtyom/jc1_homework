package my.homework.Task25;

import java.util.Scanner;

public class Atm {
    private static  int coinsX20;
    private static int coinsX50;
    private static int coinsX100;

    public static int getCoinsX20() {
        return coinsX20;
    }

    public static int getCoinsX50() {
        return coinsX50;
    }

    public static int getCoinsX100() {
        return coinsX100;
    }

    public static void addMoney(int addCoinsX20, int addCoinsX50, int addCoinsX100) {

        addCoinsX20 += coinsX20;
        addCoinsX50 += coinsX50;
        addCoinsX100 += coinsX100;
        int sum =addCoinsX20 + addCoinsX50 + addCoinsX100;
        System.out.println("Баланс счета: " + sum);

    }

    public static void withDrawMoney () {
        System.out.println("Какую сумму вы хотите снять?");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

            if (s % 10 != 0) {
                System.out.println("Вы ввели неверную сумму, попробуйте снова");
            } else {
                boolean result;
                if (coinsX20 * 20 + coinsX50 * 50 + coinsX100 * 100 >=s){
                    result = true;
                    System.out.println("Операция успешна.Спасибо, что использовали наш банкомат");
                } else {
                    result = false;
                    System.out.println("Ошибка. Недостаточно денег");
                }
            }
        }
    }




