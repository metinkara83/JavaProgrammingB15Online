package selfPracticeTests;
import java.util.Scanner;
public class Task_6_11272019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = scan.nextInt();
        if ((num1*num2) > (num1+num2+num3)) {
            System.out.println("Excellent Result!");
        }
        else {
            System.out.println("Not the numbers combination I am looking for");
        }
//        Task 6 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//        if multiplication result of num1 and num2 greater than sum of all the numbers
//        print excellent result
//        else
//        not the numbers combination I am looking for

    }
}
