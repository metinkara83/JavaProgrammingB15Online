package day30;

import java.util.Arrays;
import java.util.Scanner;

public class Task_RemovingItem {

    public static void main(String[] args) {

//        Create a program that stimulate “inserting” an item into certain index
//        (Hint : everything after will shift to next location).
//        Create a program that stimulate “removing” an item at certain index.
//        (Hint : everything after will shift to previous location).
//        Create a program that stimulate “removing” all items equal to certain value.(or certain condition)
//        (Hint : everything right after will shift to previous location).

        // !!!ONEMLI: BAZI KOMBINASYONLAR CALISMIYOR - DAHA FAZLA UGRASMAK ISTEMEDIM!!!

        int[] numbers = {3,8,19,5,14};
        Scanner scan = new Scanner(System.in);
        System.out.println("How many indexes would you like to remove?");
        int remove = scan.nextInt();
        int[] index = new int[remove];
        for (int i = 0 ; i < remove ; i++){
            System.out.println("Please enter which index you would like to remove?");
            index[i] = scan.nextInt();
        }
        System.out.println("The indexes that I would like to remove: "+Arrays.toString(index));

        int total = numbers.length - remove;
        int[] numbersCopy = new int[total];
        int m = 0;
        for (int j = 0; j < total ; j++) {
            for (int k = 0; k < remove ; k++) {
                if (j==index[k]) {
                    ++m;
                }
                numbersCopy[j] = numbers[j+m];
            }

        }
        System.out.println(Arrays.toString(numbersCopy));
    }
}
