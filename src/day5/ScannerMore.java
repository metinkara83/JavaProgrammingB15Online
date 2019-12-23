package day5;

import java.util.Scanner;

public class ScannerMore {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Your name is " + name);

        System.out.println("What is your birth year?");
        int birthYear = scan.nextInt();
        int currentYear = 2019;
        System.out.println("You are " + (currentYear - birthYear) + " years old.");

        System.out.println("What is your height?");
        double height = scan.nextDouble();
        System.out.println("You are " + height + ".");
    }
}
