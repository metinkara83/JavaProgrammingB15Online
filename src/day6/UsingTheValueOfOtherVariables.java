package day6;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My Favorite Number is: " + myFavoriteNumber);
        System.out.println("Your Favorite Number is: " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My Favorite Number is: " + myFavoriteNumber);
        System.out.println("Your Favorite Number is: " + yourFavoriteNumber);

        //Create a variable called yourOrder, type String and assign a value
        //Create another variable called myOrder and assign the value to same value as yourOrder by copying and just print them out
        System.out.println("What is your order? I want the same!");
        String yourOrder = scan.next();
        String myOrder = yourOrder;
        System.out.println("Your Order is : " + yourOrder);
        System.out.println("My Order is : " + myOrder);
    }
}
