package day52.officeHour;

public class Testers extends ScrumTeam {

    public Testers(String employeeName, String jobTitle, double salary) {
        this.employeeName=employeeName;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    @Override
    public void demo() {
        System.out.println("Tester "+this.employeeName+" is doing demo.");
    }

    @Override
    public void dailyStandUp() {
        System.out.println("Tester "+this.employeeName+" is attending the daily stand up.");
    }

    public void foundBug(){
        System.out.println("Tester "+this.employeeName+" found a bug.");
    }
}
