package selfPracticeTests;
import java.util.Scanner;

public class StringTask_13_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 13:
//        Given a String with 3 characters
//        swamp first character with last character
//        and check whether new String is same as old one
//        if so print Palindrome
        System.out.println("Please enter a word with minimum of 3 characters:");
        String word =scan.next();
        word = word.toLowerCase();
        int length = word.length();
        char first = word.charAt(0);
        char last = word.charAt(length-1);
        String newWord =last+word.substring(1,length-1)+first;
        System.out.println(newWord);
        if (newWord.equals(word)){
            System.out.println("Palindrome");
        }

    }
}
