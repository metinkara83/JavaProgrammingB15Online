package selfPracticeTests;
import java.util.Scanner;

public class StringTask_4_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String methods :
//        length()
//        equals()
//        equalsIgnoreCase()
//        toUpperCase()
//        toLowerCase()
//        contains()
//        startsWith()
//        endsWith()
//        indexOf()
//        lastIndexOf()
//        isEmpty() // isBlank()
//        trim()
//        replace()
//        substring()

//        Task 4:
//        Ask user to enter a word with at least 3 characters
//        print the first character
//        print the last character
//        print the middle character
//        for example : Uighur
//        first character : U
//        last character  : r
//        middle character: g
//                (if the length is even number get the one on the left)
        System.out.println("Please enter a word with at least 3 characters:");
        String word = scan.next();
        if (word.length()%2==0) {
            System.out.println("first character : " +word.charAt(0));
            System.out.println("last character : "+word.charAt(word.length()-1));
            System.out.println("middle character : "+word.charAt((word.length()/2)-1));
        }
        else {
            System.out.println("first character : " +word.charAt(0));
            System.out.println("last character : "+word.charAt(word.length()-1));
            System.out.println("middle character : "+word.charAt((word.length()/2)));
        }

    }
}
