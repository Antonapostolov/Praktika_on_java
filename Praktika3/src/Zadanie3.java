import java.util.Formatter;

public class Zadanie3 {
    public static void main(String[] args) {
        Employee ht[]=new Employee[2];

        ht[0]=new Employee("Апанович",1214.4545);
        ht[1]=new Employee("Георгич",124.4523);


        Report.generateReport(ht);
    }
}
