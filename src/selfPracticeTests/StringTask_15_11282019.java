package selfPracticeTests;
import java.util.Scanner;

public class StringTask_15_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 15:
//        Given a String str with 3 characters:
//        for example : DEV
//        Store each character into 3 char variables
//        Store ASCII number of each character into int variables
//        hint : store char into int to get ASCII number
//        Then print it out by concatenating as below :
//        "DEV IS NOW --> D68E69V86"
        System.out.println("Please enter a str with 3 characters:");
        String str = scan.next();
        char first = str.charAt(0);
        char second = str.charAt(1);
        char third = str.charAt(2);
        int num1 = first;
        int num2 =second;
        int num3 = third;
        System.out.println(""+first+num1+second+num2+third+num3);
    }
}
