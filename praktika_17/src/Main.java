public class Main {
    public static void main(String[] args) {

        EmployeeContoller contoller=new EmployeeContoller();
        contoller.execute();
    }
}
class Worker{
    private int zarplata;

    public void setZarplata(int zarplata) {
        this.zarplata = 2*zarplata;
    }

    public int getZarplata() {
        return zarplata;
    }
}
class Employee{
    static Worker getworker(){
        return new Worker();
    }
}
class EmployeeView{
    void show_zarplata(Worker g){
        System.out.println("Зарплата:"+g.getZarplata());
    }
}
class EmployeeContoller{

    void execute(){
        EmployeeView g=new EmployeeView();
        Worker worker=Employee.getworker();
        worker.setZarplata(2000);
        g.show_zarplata(worker);
    }
}