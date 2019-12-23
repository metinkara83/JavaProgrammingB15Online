package day8;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        /*
        Voting Eligibility Program
        Create a variable called age as int
        Check whether this age is more than 18, if yes, print: you are ready to vote !!! , if not: wait until you are 18
         */
        int age=19;
        if (age>=18){
            System.out.println("You are ready to vote!!!");
        }
        else {
            System.out.println("Sorry, you cannot vote, wait until you are 18.");
        }

        /*
        Create a program to guess your favorite number
        create a variable called myFavoriteNumber as int
        Ask user to guess your favorite number, if user guessed right then print "BINGO!!", if not print "Try again later."
         */
        Scanner scan = new Scanner(System.in);
        int myFavoriteNumber = 22;
        System.out.println("Enter any number from 1 to 100 to guess my favorite number");
        int guessmyFavoriteNumber=scan.nextInt();
        if (myFavoriteNumber==guessmyFavoriteNumber){
            System.out.println("BINGO!!!");
        }
        else {
            System.out.println("Sorry, please try another number!");
        }
    }
}
