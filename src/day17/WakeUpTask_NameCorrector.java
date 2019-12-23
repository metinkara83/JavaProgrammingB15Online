package day17;
import java.util.Scanner;
public class WakeUpTask_NameCorrector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.next();
        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();
        String name2 = upperCaseName.charAt(0)+""+lowerCaseName.substring(1,lowerCaseName.length());
        System.out.println(name2);

        // Create a String variable to store your name in any case combination
        // for example jon jOn jON, any of them:
        // Create a variable called name2
        // Make your first letter uppercase then rest lowercase
        // jon -->> Jon     arya -->> Arya
        // optionally ask your name from Scanner
    }
}
