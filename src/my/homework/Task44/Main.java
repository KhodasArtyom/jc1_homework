package my.homework.Task44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
        //Программа,в которой пользователь должен вводить только "0"
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = scanner.nextInt();

            if(x!=0) {
                throw new ScannerException("You should enter only ZERO");
            }
        }
    }
}
