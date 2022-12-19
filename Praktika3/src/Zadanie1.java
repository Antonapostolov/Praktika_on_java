import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        //Инициализация Double с помощью Double.valueOf()
        Double a=Double.valueOf(0.45);

        System.out.println(a);
        //преобразование String к Double
        String s="12.7";
        a=Double.parseDouble(s);
        System.out.println(a);

        //преобразование Double ко всем примитивным типам
        double d1 = a;
        System.out.println(d1);
        int b=a.intValue();
        System.out.println(b);
        short r1=a.shortValue();
        System.out.println(r1);
        float r2=a.floatValue();
        System.out.println(r2);
        byte r3=a.byteValue();
        System.out.println(r3);
        long r4=a.longValue();
        System.out.println(r4);

        double f1=78.9;
        String d =Double.toString(f1);
        System.out.println(d);
    }
}
