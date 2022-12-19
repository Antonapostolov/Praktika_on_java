public class Student implements Comparable {

    private int Kurs;
    private int GPA;
    private String name;
    private String Surname;
    private String Specialnost;
    private String Group;

    public Student(int Kurs, int GPA) {
        this.Kurs = Kurs;
        this.GPA = GPA;
    }
    public Student(int Kurs, int GPA,String name,String Surname,String Specialnost,String Group){
        this.Kurs = Kurs;
        this.GPA = GPA;
        this.name=name;
        this.Surname=name;
        this.Specialnost=Specialnost;
        this.Group=Group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Kurs=" + Kurs +
                ", GPA=" + GPA +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Specialnost='" + Specialnost + '\'' +
                ", Group='" + Group + '\'' +
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