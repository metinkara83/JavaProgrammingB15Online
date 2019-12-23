package selfPracticeTests;
import java.util.Scanner;
public class Task_4_11272019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = scan.nextInt();
        if (num1>100 && num2>100 && num3>100) {
            System.out.println("True, all the individual numbers are more than 100");
        }
        else {
            System.out.println("Not all numbers are more than 100");
        }

//        Task 4 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//        it should print true if all the individual numbers are more than 100
//        if not print not all numbers are more than 100

    }
}
