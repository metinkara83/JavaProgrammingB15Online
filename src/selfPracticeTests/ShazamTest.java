package selfPracticeTests;
import java.util.Scanner;
public class ShazamTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String keyword = "";
        do {
            System.out.println("Please enter the keyword:");
            keyword = scan.next();
        } while (!keyword.equalsIgnoreCase("Shazam"));

        System.out.println("You are now Super Hero!");
        /*
        * Write a program to
        * repeatedly ask user for keyword to turn into super hero
        * unless user say SHAZAM! in case insensitive manner
        * program will keep asking
        * and when you user enter Shazam! it will print you are now Super Hero!
        *
        hint : use do while loop
        * */
    }
}
