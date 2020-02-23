package day48;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numsOfHours;
    double annualSalary;

    public HourlyEmployee(String fullName, int id, double hourlyWage, int numsOfHours){
        super(fullName,id);
        this.hourlyWage=hourlyWage;
        this.numsOfHours=numsOfHours;
    }

    @Override
    public void calculateAnnualSalary(){
        annualSalary = hourlyWage * numsOfHours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", annualSalary=" + annualSalary +
                ", fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
