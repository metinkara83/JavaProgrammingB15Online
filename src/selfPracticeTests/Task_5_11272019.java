package selfPracticeTests;
import java.util.Scanner;
public class Task_5_11272019 {

    public static void main(String[] args) {

//        Task 5 :
//        given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
//        add 100 to all the numbers less than 20 ;
//        print out the value of each variable to test your code.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = scan.nextInt();
        if (num1 < 20 && num2 < 20 && num3 < 20){
            num1 +=100; num2 +=100; num3 +=100;
        }
        else if (num1 < 20 && num2 < 20 && num3 >20) {
            num1 +=100; num2 +=100;
        }
        else if (num1 < 20 && num3 < 20 && num2 > 20) {
            num1 +=100; num3 +=100;
        }
        else if (num2 < 20 && num3 < 20 && num1 > 20) {
            num2 +=100; num3 +=100;
        }
        else if (num1 < 20 && num2 > 20 && num3 > 20) {
            num1 +=100;
        }
        else if (num2 < 20 && num1 > 20 && num3 > 20) {
            num2 +=100;
        }
        else if (num3 < 20 && num2 > 20 && num1 > 20) {
            num3 +=100;
        }
        else {}
        System.out.println("Number 1 is: "+num1);
        System.out.println("Number 2 is: "+num2);
        System.out.println("Number 3 is: "+num3);
    }
}
