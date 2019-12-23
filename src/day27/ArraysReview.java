package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {

    public static void main(String[] args) {

        // Task-1 : Write a program that asks user to enter a number 5 times, and store those numbers into array
        // print the largest number

//        Scanner scan = new Scanner(System.in);
//        int[] num = new int[5];
//        System.out.println("Please enter 5 numbers:");
//        for (int i = 0; i < 5 ; i++) {
//            num[i] = scan.nextInt();
//        }
//        System.out.println(Arrays.toString(num));

        int[] numbers= new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter an int number: ");
            int input = scan.nextInt();
            numbers[i]=input;
        }
        System.out.println(Arrays.toString(numbers));

        int largestNumber = numbers[0];
        int minNumber = numbers[0];
        for (int i = 0; i < 5 ; i++) {
            if (largestNumber < numbers[i]){
                largestNumber = numbers[i];
            }
        }
        for (int x = 0; x < 5 ; x++) {
            if (minNumber > numbers[x]){
                minNumber = numbers[x];
            }
        }

        System.out.println("Largest number is "+largestNumber);
        System.out.println("Minimum number is "+minNumber);

        // Arrays.sort(variableName): sorts the array in ascending order
//        Arrays.sort(numbers);
//        int largestNumber = numbers[numbers.length-1];
//        int minNumber = numbers[0];
//        System.out.println("Largest number is "+largestNumber);
//        System.out.println("Minimum number is "+minNumber);
    }
}
