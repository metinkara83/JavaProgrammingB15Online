package day18;

import java.util.Scanner;

public class Trial86Party {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String guestName = "";
        String newGuest = "";
        String guestList = "";

        do {
            System.out.println("Please enter your guest name:");
            guestName = scan.next();
            System.out.println("Do you want to enter new guest name:");
            newGuest = scan.next();
            if (newGuest.equalsIgnoreCase("yes")) {
                guestList += guestName+", ";     // guestList = guestList + guestName
            }
            else {
                guestList+=guestName;
            }

        } while (newGuest.equalsIgnoreCase("yes"));
        System.out.println(guestList);
    }
}
