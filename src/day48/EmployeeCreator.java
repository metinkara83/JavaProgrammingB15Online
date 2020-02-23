package day48;

public class EmployeeCreator {

    public static void main(String[] args) {

        HourlyEmployee h1 = new HourlyEmployee("Metin K",1016,45,2080);
        HourlyEmployee h2 = new HourlyEmployee("Huseyin C",1354,55,1900);

        FullTimeEmployee f1 = new FullTimeEmployee("Said A",1279,7500);
        FullTimeEmployee f2 = new FullTimeEmployee("Taha K",1593,4500);

        System.out.println(h1);
        h1.calculateAnnualSalary();
        System.out.println(h1);

        System.out.println(h2);
        h2.calculateAnnualSalary();
        System.out.println(h2);

        System.out.println(f1);
        f1.calculateAnnualSalary();
        System.out.println(f1);

        System.out.println(f2);
        f2.calculateAnnualSalary();
        System.out.println(f2);
    }
}
