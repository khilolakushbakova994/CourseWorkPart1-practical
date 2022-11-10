public class Employee {

    private final String fullNameOfEmployee;
    private int department;
    private int salary;
    public int id;
    private static int idCounter =0;

//все геттеры, только зп и отдел сеттеры

    public Employee(String fullNameOfEmployee, int department, int salary) {
        this.fullNameOfEmployee = fullNameOfEmployee;
        this.department = department;
        this.salary = salary;
        this.id= idCounter ++;
    }
    public  String getFullNameOfEmployee(){
        return fullNameOfEmployee;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;

    }
    public int getId() {
        return id;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }

    public void setDepartment (int department){
        this.department = department;


    }

// Вопросы :
    // 1) почему ID private
    //2) в каком случае мы ставим final не private ? Чем они отличаются?
    //3) почему на сеттер идет void , а на геттер нет
    // 4) чем отличается в геттере return id от return this id ?


}
