package day26;

import java.util.Arrays;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        /*
        1. given an int array, write a program to test all the element in this int array are more than 100
         */

        int[] num = {76, 105, 87, 95, 119, 197};
        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

        String finalResult = "";     // if all numbers are more than 100 then make it yes, if not make it no

        // Logic-1: take each item and check if it is more than 100, count in the end if count is more than 0, answer is NO
        int count=0;
        for (int x = 0; x < num.length ; x++) {
            if (num[x]>100){
            ++count;
            }
        }
        if (count==num.length){
            System.out.println("All elements in this array are more than 100: YES!!!");
        }
        else {
            System.out.println("NOOOOOO!!!");
        }

        // Logic-2: check each item and break when number is less than 100 after assigning final result NO
        for (int x = 0; x < num.length ; x++) {
            if (num[x]<100){
                System.out.println("NOOOOOO!!!");
                break;
            }
        }
        // Logic-3: minus 100 from all numbers in array and if any of the numbers are negative, it will be NO
        // Logic-4: find min number if it is more than 100, it will be YES

    }
}
