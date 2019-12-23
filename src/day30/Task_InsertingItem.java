package day30;

import java.util.Arrays;
import java.util.Scanner;

public class Task_InsertingItem {

    public static void main(String[] args) {

//        Create a program that stimulate “inserting” an item into certain index
//        (Hint : everything after will shift to next location).
//        Create a program that stimulate “removing” an item at certain index.
//        (Hint : everything after will shift to previous location).
//        Create a program that stimulate “removing” all items equal to certain value.(or certain condition)
//        (Hint : everything right after will shift to previous location).

        int[] numbers = {3,8,19,5,14};
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to add?");
        int add = scan.nextInt();
        int[] index = new int[add];
        int[] num = new int[add];
        for (int i = 0 ; i < add ; i++){
            System.out.println("Please enter at which index you would like to insert?");
            index[i] = scan.nextInt();
            System.out.println("Please enter a number that you would like to add?");
            num[i] = scan.nextInt();
        }
        System.out.println("The indexes that I would like to insert: "+Arrays.toString(index));
        System.out.println("The numbers that I would like to add: "+Arrays.toString(num));

        int m = 0;
        int total = numbers.length + add;
        int[] numbersCopy = new int[total];

        for (int j = 0; j < total ; j++) {
            for (int k = 0; k < add ; k++) {
                if (index[k]==j) {
                    numbersCopy[j] = num[k];
                    ++j;
                    ++m;
                }
            }
            numbersCopy[j] = numbers[j-m];
        }
        System.out.println(Arrays.toString(numbersCopy));
    }
}
