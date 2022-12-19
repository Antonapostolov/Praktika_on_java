import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

import static java.time.format.FormatStyle.*;

public class Student implements Comparable {

    private int Kurs;
    private int GPA;
    private String name;
    private String Surname;
    private String Specialnost;
    private String Group;
    private ZonedDateTime date;

    public Student(int Kurs, int GPA) {
        this.Kurs = Kurs;
        this.GPA = GPA;
    }
    public Student(int Kurs, int GPA,String name,String Surname,String Specialnost,String Group,ZonedDateTime date){
        this.Kurs = Kurs;
        this.GPA = GPA;
        this.name=name;
        this.Surname=name;
        this.Specialnost=Specialnost;
        this.Group=Group;
        this.date=date;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(MEDIUM);
        String text=date.format(formatter);
        return "Student{" +
                "Kurs=" + Kurs +
                ", GPA=" + GPA +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Specialnost='" + Specialnost + '\'' +
                ", Group='" + Group + '\'' +", date='" + text+ '\'' +
                '}';
    }

    public int getKurs() {
        return Kurs;
    }

    public void setKurs(int kurs) {
        this.Kurs = kurs;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student))
            throw new IllegalArgumentException("Объект не является студентом!");
        // < 0 -> o, 0 -> ==, >0 -> this;
        return this.Kurs - ((Student) o).Kurs;
    }
}