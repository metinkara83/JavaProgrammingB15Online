package day52.officeHour;

public class Developers extends ScrumTeam {

    public Developers(String employeeName, double salary) {
        this.jobTitle="Software Developer";
        this.employeeName=employeeName;
        this.salary=salary;
    }

    @Override
    public void demo() {
        System.out.println("Developer "+this.employeeName+" is doing demo.");
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Developer "+this.employeeName+" is attending the daily stand up.");
    }

    public void fixingBugs(){
        System.out.println("Developer "+this.employeeName+" is fixing the bugs.");
    }
}
