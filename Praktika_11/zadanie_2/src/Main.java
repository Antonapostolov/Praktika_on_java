import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        Date date1 = new Date();
        String d1=y.nextLine();
        Date date2 =new Date();
        date1.setTime( Date.parse(d1) );//"Jul 06 12:15:00 2019"
        System.out.println("Date1:"+date1);
        System.out.println("(System)Date2:"+date2);
        int result = date1.compareTo(date2);

        if(result == 0)
            System.out.println("Both dates are equal");
        else if (result < 0)
            System.out.println("Date1 is before Date2");
        else
            System.out.println("Date1 is after Date2");
    }
}