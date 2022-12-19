

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task25 {
    public boolean proverka(String s) {
        String ip = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";
        return Pattern.matches(ip, s);
    }

    public String proverka2(String s) {

        String reg = "\\(";
        String obreg = "\\)";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern .matcher(s);
        Pattern pattern2 = Pattern.compile(obreg);
        Matcher matcher2 = pattern2.matcher(s);

        int g = 0;
        int g2 = 0;
        while (matcher.find()){
            g = g + 1;
        }
        while (matcher2.find()){
            g2 = g2 + 1;
        }
        if (g2 == g) {
            return "Одинаково, значит правильный формат";
        }
        else {
            return "Неправильный формат";
        }
    }


    public static void main(String[] args) {
        task25 task = new task25();
        String s1 = "127.0.0.1";
        String s2 = "255.255.255.0";
        String s3 = "1300.6.7.8";
        String s4 = "abc.def.gha.bcd";
        System.out.println(task.proverka(s1));
        System.out.println(task.proverka(s2));
        System.out.println(task.proverka(s3));
        System.out.println(task.proverka(s4));

        String slap = "(3+5)–9×4";
        String slap2 = "((3+5)–9×4";


        System.out.println(task.proverka2(slap) + " " + slap);
        System.out.println(task.proverka2(slap2) + " " + slap2);


    }
}