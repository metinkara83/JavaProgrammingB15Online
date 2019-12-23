package day11;

import java.util.Scanner;

public class WarmUp1_IfStatement {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter which room's light do you want to turn on?");
        String targetOption=scan.next();
        if (targetOption.equals("Bd")){
            System.out.println("You have turned on bedroom light");
        }
        else if (targetOption.equals("Lr")){
            System.out.println("You have turned on living room light");
        }
        else if (targetOption.equals("Ki")){
            System.out.println("You have turned on kitchen light");
        }
        else if (targetOption.equals("Ha")){
            System.out.println("You have turned on hallway light");
        }
        else {
            System.out.println("There is no such a room in your home");
        }
    }
}
