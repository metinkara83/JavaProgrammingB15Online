package selfPracticeTests;
import java.util.Scanner;

public class StringTask_11_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 11:
//        Ask user to enter sentence with more than 1 word
//        For example I love Java
//        write a program to
//        print first word and last word
        System.out.println("Please enter a sentence with more than 1 word");
        String sentence =scan.nextLine();
        String firstWord = sentence.substring(0,sentence.indexOf(" ")+1);
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        System.out.println("The first word is: "+firstWord);
        System.out.println("The last word is: "+lastWord);
    }
}
