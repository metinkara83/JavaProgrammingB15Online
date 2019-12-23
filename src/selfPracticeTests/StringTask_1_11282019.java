package selfPracticeTests;
import java.util.Scanner;
public class StringTask_1_11282019 {

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
//
//        String tasks :
//
//        Task 1:
//        Given a String with any possible length including 0
//        print first 2 characters only if the String has more than 1 character
//        if the String is empty print Empty String
//        else print the first char twice in same Link
//        for example :
//        "abcde" --> ab
//        ""		--> empty String
//        "J"		--> JJ
        String anything = "g";
        if (anything.length()>1) {
            System.out.println(anything.substring(0,2));
        }
        else if (anything.isEmpty()) {
            System.out.println("Empty String");
        }
        else {
            System.out.println(anything+anything);
        }
    }
}
