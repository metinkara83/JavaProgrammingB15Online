package day17;
import java.util.Scanner;
public class WakeUpTask_FullNameCorrector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String fullName = scan.nextLine();

        String firstName = fullName.toUpperCase().substring(0,1)+fullName.toLowerCase().substring(1,fullName.indexOf(" "));

        String lastName = fullName.toUpperCase().substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2)
                +fullName.toLowerCase().substring(fullName.indexOf(" ")+2);
        System.out.println(firstName + " " + lastName);


    }
}
