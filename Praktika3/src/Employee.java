import java.util.Scanner;

public class Employee {


    private String full_name;
    private double solary;

    Employee(String full_name,double solary){
        this.full_name=full_name;
        this.solary=solary;
    }
    double get_solary(){
        return solary;
    }
}
