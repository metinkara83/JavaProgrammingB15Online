package selfPracticeTests;
import java.util.Scanner;

public class StringTask_9_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 9:
//        Ask user to enter a valid URL in below format
//        www.blackfriday.com
//        Write a program to print first Index of .(dot)
//                and last index of .(dot)
//                and eventually print the domain
//        for example :
//        www.nightwatch.com  --->> blackfriday
        System.out.println("Please enter a valid URL: ");
        String url =scan.next();
        System.out.println(url.indexOf("."));
        System.out.println(url.lastIndexOf("."));
        System.out.println("The domain is: "+url.substring(url.indexOf(".")+1,url.lastIndexOf(".")));

    }
}
