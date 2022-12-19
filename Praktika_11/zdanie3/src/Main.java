import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime date= ZonedDateTime.now();
        Student g=new Student(3, 41,"Pavel","Strukalo","Informathics","ИВБО-04-21",date);
        System.out.println(g.toString());
//        SimpleDateFormat dateFormatter = new
//                SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
//
//        System.out.println(dateFormatter.format(date));
    }
}