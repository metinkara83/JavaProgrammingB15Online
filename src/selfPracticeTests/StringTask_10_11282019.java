package selfPracticeTests;
import java.util.Scanner;

public class StringTask_10_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 10:
//        Ask user to enter sentence with 3 words
//        For example I love Java
//        write a program to print second word
        System.out.println("Please enter sentence with 3 words:");
        String sentence =scan.nextLine();
        System.out.println("The second word of your sentence is: "+sentence.substring(sentence.indexOf(" ")+1,sentence.lastIndexOf(" ")));
    }
}
