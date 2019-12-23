package day6;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your name?");
        // nextLine method of Scanner is used to capture whole line
        String name = blabla.nextLine();
        System.out.println("You have entered " + name);

        System.out.println("What is your age?");
        int age = blabla.nextInt();
        //String age = blabla.nextLine();
        //notice we are not storing this into variable
        //we just want below line to capture ENTER keyboard input
        // So that it does not accidentally get captured by the nextline we use to capture address
        blabla.nextLine();
        System.out.println("Your age is " + age);

        System.out.println("What is your street address?");
        String address = blabla.nextLine();
        System.out.println("Your street address is " + address);

    }
}
