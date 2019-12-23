package day11;
import java.util.Scanner;
public class WarmUp1_LightOnOff {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter which room's light do you want to turn on?");
        String targetOption=scan.next();

        switch (targetOption){
            case "Bd":
                System.out.println("You have turned on bedroom light");
                break;
            case "Lr":
                System.out.println("You have turned on living room light");
                break;
            case "Ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "Ha":
                System.out.println("You have turned on hallway light");
                break;
            default:
                System.out.println("There is no such a room in your home");
                break;
        }
    }
}
