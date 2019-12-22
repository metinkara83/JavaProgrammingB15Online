package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        arrayPrinter(new int[]{3,7,18,5,21});
        int[] scores = {2,5,8,23,4,5,6};
        arrayPrinter(scores);
        printMaxOfIntArray(new int[]{3,7,18,5,21});
        checkScoresAllMoreThan60(new int[]{61,63,65,90,86,95,72});
    }

    // array printer
    // create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has items : --->>> all the items here

    public static void arrayPrinter(int[] num){
        System.out.println(Arrays.toString(num));
    }

    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array

    public static void printMaxOfIntArray (int[] num){
        int max = num[0];
        for (int i = 0; i < num.length ; i++) {
            if (max < num[i]){
                max = num[i];
            }
        }
        System.out.println(max);
    }

    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether each and every numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed

    public static void checkScoresAllMoreThan60 (int[] num){
        int count = 0;
        for (int i = 0; i < num.length ; i++) {
            if (num[i]>60){
                ++count;
            }
        }
        if (count==num.length){
            System.out.println("Everyone passed");
        }
        else {
            System.out.println("Someone has failed");
        }
    }
}
