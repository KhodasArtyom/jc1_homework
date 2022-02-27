
package my.homework;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task9 {
    public static void main(String[] args) {

        Calendar c = new GregorianCalendar(2022,1,27);
        Date date = c.getTime();
        System.out.println("Текущая дата: " + date);
        c.set(Calendar.YEAR,2022);
        c.set(Calendar.MONTH,1);
        c.set(Calendar.DAY_OF_MONTH,27);
        c.set(Calendar.HOUR_OF_DAY,14);
        c.set(Calendar.MINUTE, 50);
        c.set(Calendar.SECOND,00);
        c.add(Calendar.DAY_OF_MONTH,+1);
        System.out.println(c.getTime());


        }
    }


