package selfPracticeTests;

import java.util.Scanner;

public class Task_1_11272019 {

    public static void main(String[] args) {

//        //NUMBER TASKS WITH LOGICAL OPERATOR
//
//        Task 1 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        If the sum of the numbers are more than 100 print you have won
//        if not print sum of 3 numbers are not more than 100
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=scan.nextInt();
        System.out.println("Enter number 2:");
        int num2=scan.nextInt();
        System.out.println("Enter number 3:");
        int num3=scan.nextInt();
        if ((num1+num2+num3)>100) {
            System.out.println("You have won");
        }
        else {
            System.out.println("The sum of 3 numbers are not more than 100");
        }

    }
}
