import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xbx {

    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }

    public static boolean hasDigitPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static boolean isDate(String s){
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }



    public static void main(String[] args) {
        //2
        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatStr("asdzfghd4yt5y5"));
        System.out.println();
        //3
        System.out.println(findRubEurUsd("12.3 RUB, fejhge12 EUdsfrg3.789USD"));
        System.out.println();
        //4
        System.out.println(hasDigitPlus("1 / 3 -5"));
        System.out.println(hasDigitPlus("1 + 3 -5"));
        System.out.println(hasDigitPlus("1 / 3+5"));
        System.out.println();
        //5

        System.out.println(isDate("29/02/2000"));
        System.out.println(isDate("30/04/2003"));
        System.out.println(isDate("01/01/2003"));
        System.out.println(isDate("29/02/2001"));
        System.out.println(isDate("30-04-2003"));
        System.out.println(isDate("1/1/1899"));

    }
}