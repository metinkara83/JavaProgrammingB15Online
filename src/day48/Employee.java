package day48;

public abstract class Employee {

    String fullName;
    int id;

    public Employee(){
        this("",0);
    }

    public Employee (String fullName, int id){
        this.fullName=fullName;
        this.id=id;
    }

    public abstract void calculateAnnualSalary();

    public abstract String toString();
}
