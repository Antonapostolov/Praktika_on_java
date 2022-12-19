import java.util.Formatter;

public class Report {
    static void generateReport(Employee rt[]){

        Formatter formatter = new Formatter();
        for(int i=0;i< rt.length;++i){

            System.out.println(String.format("Зарплата сотрудника "+i+":"+"%30.2f",rt[i].get_solary()));


        }
    }
}
