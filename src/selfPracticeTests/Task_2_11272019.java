package selfPracticeTests;
import java.util.Scanner;
public class Task_2_11272019 {

    public static void main(String[] args) {

//        Task 2 :
//        given 3 whole numbers variable  num1, num2 , num3 with value already set .
//        and another int variable called sumOfSpecialNumber with initial value 0
//        Write a program to print
//        If the sum of the numbers are more than 100 !
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3:");
        int num3 = scan.nextInt();
        int sumOfSpecialNumber = 0;
        if ((num1 + num2 + num3 >100)) {
            sumOfSpecialNumber = num1 + num2 + num3;
            System.out.println(sumOfSpecialNumber);
        }
        else {
            System.out.println(sumOfSpecialNumber);
        }


    }
}
