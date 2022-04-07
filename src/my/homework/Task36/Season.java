package my.homework.Task36;

import java.util.Scanner;

public enum Season {
        SPRING(1),
        SUMMER(2),
        AUTUMN(3),
        WINTER(4);

        String descrition;
        int countOfDays;
        int id;

        Season(int id) {
                this.id = id;
        }

        Scanner scanner = new Scanner(System.in);

        public int getSeason() {
                System.out.println("Введите от 1 - до 4 -х,чтобы вывыести определенное время года");
                Scanner scanner = new Scanner(System.in);
                int numSeason = scanner.nextInt();

                switch (numSeason) {
                        case 1:
                                System.out.println("SPRING");
                                break;
                        case 2:
                                System.out.println("SUMMER");
                                break;
                        case 3:
                                System.out.println("AUTUMN");
                                break;
                        case 4:
                                System.out.println("WINTER");
                                break;
                        default:
                                System.out.println("Uncorrect number!!!Try again");
                                System.exit(0);
                }

                return getSeason();

        }

        }


