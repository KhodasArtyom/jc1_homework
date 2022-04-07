package my.homework.Task37;

import java.util.Locale;
import java.util.Scanner;

public enum Month {
    JANUARY(31,Season.WINTER),
    FEBRUARY(28,Season.WINTER),
    MARCH(31,Season.SPRING),
    APRIL(30,Season.SPRING),
    MAY(31,Season.SPRING),
    JUNE(30,Season.SUMMER),
    JULY(31,Season.SUMMER),
    AUGUST(30,Season.SUMMER),
    SEPTEMBER(31,Season.AUTUMN),
    OCTOBER(30,Season.AUTUMN),
    NOVEMBER(31,Season.AUTUMN),
    DECEMBER(31,Season.WINTER);

    int getCountFfDays;
    Season season;

    Month(int getCountFfDays, Season season) {
        this.getCountFfDays = getCountFfDays;
        this.season = season;
    }

    int sumOFDaysOfMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр");
        int s = scanner.nextInt();

        switch (s) {
            case 1:
                return   Month.JANUARY.getCountFfDays + Month.FEBRUARY.getCountFfDays + Month.DECEMBER.getCountFfDays ;
            case 2:
                return Month.MARCH.getCountFfDays + Month.APRIL.getCountFfDays + Month.MAY.getCountFfDays ;
            case 3:
                return Month.JUNE.getCountFfDays + Month.JULY.getCountFfDays + Month.AUGUST.getCountFfDays ;
            case 4:
                return Month.SEPTEMBER.getCountFfDays + Month.OCTOBER.getCountFfDays + Month.NOVEMBER.getCountFfDays ;
            default:
                System.out.println("Out of seasons");
                System.exit(0);

        }
        return sumOFDaysOfMonth();

    }
}
