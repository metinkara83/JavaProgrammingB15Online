package day6;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println(5/2);
//        System.out.println(5.0/2);
//        System.out.println(5/2d);
//        System.out.println(5%2);
//        System.out.println(99%10);

        // declare a variable called minutes data type int
        // print the result in x hour y minutes format
        System.out.println("How many minutes?");
        int minutes = scan.nextInt();
        int hour = minutes / 60;
        System.out.println(minutes + " minutes equals to " + hour + " hour(s) and " + minutes%60 + " minutes.");
    }
}
