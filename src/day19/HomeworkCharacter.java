package day19;
import java.util.Scanner;
public class HomeworkCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter starting and ending characters: ");
        String startEnd = scan.nextLine();
        String trimmedStartEnd = startEnd.trim();
        char first = trimmedStartEnd.charAt(0);
        char last = trimmedStartEnd.charAt(trimmedStartEnd.length()-1);
        if (first > last) {
            for (char i = first; i >= last; i--) {
                System.out.print(i+" ");
            }
        }
        else if (last > first) {
            for (char i = first; i <= last; i++) {
                System.out.print(i + " ");
            }
        }
        // HOMEWORK
        // Create an interactive program to ask user starting character and ending character
        // Then print everything in between it could be starting character is after ending character
        // For example user can enter Z A or A K
        // Can we ask user a character??? NOOOOOOO!!!!
        // Ask user for String and pick first character by charAt(0)

    }
}
