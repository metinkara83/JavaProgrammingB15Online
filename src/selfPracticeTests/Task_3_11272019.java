package selfPracticeTests;
import java.util.Scanner;
public class Task_3_11272019 {

    public static void main(String[] args) {

//        Task 3 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program to
//        find out the largest number and print the result

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3");
        int num3 = scan.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("The largest number among the three is: " + num1);
        }
        else if (num2>num1 && num2>num3) {
            System.out.println("The largest number among the three is: " + num2);
        }
        else if (num3>num1 && num3>num2) {
            System.out.println("The largest number among the three is: " + num3);
        }
        else {
            System.out.println("Minimum 2 numbers are equal");
        }

    }
}
