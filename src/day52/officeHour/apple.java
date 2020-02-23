package day52.officeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class apple {

    public static void main(String[] args) {

        Testers Hasan = new Testers("Hasan","Manual Tester", 85000);
        Hasan.jobTitle = "Manual Tester";

//        System.out.println(Hasan.jobTitle);
//        System.out.println(Hasan.employeeName);
//        System.out.println(Hasan.salary);

//        Hasan.getEmployeeInfo();

        Testers Alisa = new Testers("Alisa","SDET",120000);
        Testers Rauf = new Testers("Rauf","QA",100000);

        List<Testers> testersTeam = new ArrayList<>();
        testersTeam.addAll(Arrays.asList(Hasan,Alisa,Rauf));

        for (Testers eachTester : testersTeam) {
            eachTester.getEmployeeInfo();
        }
        System.out.println("=====================");
        Developers Vlad = new Developers("Vlad",130000);
//        Vlad.getEmployeeInfo();
        Developers Emel = new Developers("Emel", 123000);
        Developers Muge = new Developers("Muge", 118000);

        List<Developers> developersTeam = new ArrayList<>();
        developersTeam.addAll(Arrays.asList(Vlad,Emel,Muge));

        for (Developers eachDeveloper : developersTeam) {
            eachDeveloper.getEmployeeInfo();
            eachDeveloper.fixingBugs();
        }

        List<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(testersTeam);
        scrum.addAll(developersTeam);

    }
}
