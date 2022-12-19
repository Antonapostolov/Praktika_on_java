import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значние Data:");
        Scanner y=new Scanner(System.in);
        Date date = new Date();
        String d=y.nextLine();
        date.setTime( Date.parse(d) );//"Jul 06 12:15:00 2019"
        System.out.println("Date:"+date);
        System.out.println("Введите значения Data:");
        System.out.println("Введите год:");
        date.setYear(y.nextInt()-1900);
        System.out.println("Введите месяц:");
        date.setMonth(y.nextInt());
        System.out.println("Введите число:");
        date.setDate(y.nextInt());
        System.out.println("Введите часы:");
        date.setHours(y.nextInt());
        System.out.println("Введите минуты:");
        date.setMinutes(y.nextInt());
        System.out.println("Date:"+date);
        Calendar cal = new GregorianCalendar(2017, 0 , 25);
        Date date1 = cal.getTime();
        System.out.println(date1);
        System.out.println("Введите значения Calendar:");
        System.out.println("Введите год:");
        cal.set(Calendar.YEAR,y.nextInt());
        System.out.println("Введите месяц:");
        cal.set(Calendar.MONTH,y.nextInt());
        System.out.println("Введите число:");
        cal.set(Calendar.DAY_OF_MONTH,y.nextInt());
        System.out.println("Введите часы:");
        cal.set(Calendar.HOUR,y.nextInt());
        System.out.println("Введите минуты:");
        cal.set(Calendar.MINUTE,y.nextInt());
        date1 = cal.getTime();
        System.out.println(date1);
    }
}