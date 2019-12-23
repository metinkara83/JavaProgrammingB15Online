package selfPracticeTests;
import java.util.Scanner;

public class StringTask_7_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 7:
//        Ask user to enter valid email address
//        for example :
//        JSnow@NightWatch.com or
//        Arya@KingsLanding.edu
//        print 3 part of the email separately
//        for example :
//        Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
//        Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu
        System.out.println("Please enter valid email address: ");
        String email = scan.next();
        System.out.println("Part 1 is: "+email.substring(0, email.indexOf("@")));
        System.out.println("Part 2 is: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
        System.out.println("Part 3 is: "+email.substring(email.indexOf(".")+1));
    }
}
