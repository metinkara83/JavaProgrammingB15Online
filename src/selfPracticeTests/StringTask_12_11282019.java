package selfPracticeTests;
import java.util.Scanner;

public class StringTask_12_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 12:
//        Given a String with at least two characters
//        swamp first character with last character
//        for example
//        Java --> aavJ , Kawap --> pawaK
        System.out.println("Please enter word with minimum 2 characters:");
        String word = scan.next();
        int length = word.length();
        char first = word.charAt(0);
        char last = word.charAt(length-1);
        System.out.println(last+word.substring(1,length-1)+first);
    }
}
