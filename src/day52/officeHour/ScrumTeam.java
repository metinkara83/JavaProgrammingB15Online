package day52.officeHour;

public abstract class ScrumTeam {

    public String employeeName;
    public String jobTitle;
    public double salary;

    public abstract void demo();
    public abstract void dailyStandUp();

    public void getEmployeeInfo(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
    }


}
