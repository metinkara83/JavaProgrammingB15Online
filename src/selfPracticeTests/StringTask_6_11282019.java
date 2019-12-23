package selfPracticeTests;
import java.util.Scanner;

public class StringTask_6_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 6:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program generate email account as below:
//        it starts with first character of first name
//        and whole last name then @NightWatch.com
//        for example :
//        Jon Snow -->> JSnow@NightWatch.com
        System.out.println("Please enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Your email address is generated as: "+fullName.toUpperCase().substring(0,1)+fullName.toUpperCase().substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2)+ fullName.toLowerCase().substring(fullName.indexOf(" ")+2)+"@NightWatch.com");

    }
}
