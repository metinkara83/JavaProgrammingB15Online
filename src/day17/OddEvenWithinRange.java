package day17;

public class OddEvenWithinRange {

    public static void main(String[] args) {

        // Write a program to print out an even number from 0 to 50
//        Method 1:
        int Counter = 0;
        while (Counter <= 50) {
            if (Counter % 2 == 0) {
                System.out.println(Counter+" is even number");
            }
            else {
                System.out.println(Counter+" is odd number");
            }
            ++Counter;
        }
//        Method 2:
        int numberCounter = 0;
        if (numberCounter%2==0) {
            System.out.println("Even numbers are: ");
            while (numberCounter <= 50) {
                System.out.print(numberCounter+" ");
                numberCounter +=2;
            }
        }
        numberCounter = 1;
        if (numberCounter%2!=0) {
            System.out.println("\nOdd numbers are: ");
            while (numberCounter <= 50) {
                System.out.print(numberCounter+" ");
                numberCounter +=2;
            }
        }
        System.out.println();
        // Method 3:
        int num = 0;
        while (num<=50) {
            if (num%2==0) {
                System.out.print(num+" ");
            }
            ++num;
        }
        System.out.println();
        num = 0;
        while (num<=50) {
               if (num%2!=0) {
               System.out.print(num +" ");
            }
            ++num;
        }
     }
}
