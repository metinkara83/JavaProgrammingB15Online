package day48;

public class FullTimeEmployee extends Employee {

    double monthlySalary;
    double annualSalary;

    public FullTimeEmployee(String fullName, int id, double monthlySalary){
        super(fullName,id);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public void calculateAnnualSalary(){
        annualSalary = monthlySalary * 12;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", annualSalary=" + annualSalary +
                ", fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
