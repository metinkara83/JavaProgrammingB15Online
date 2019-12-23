package day5;

import java.util.Scanner;

public class ScannerBoolean {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you recording? (True for Yes, False for No)");
        boolean isRecording = input.nextBoolean();
        System.out.println("We are recording " + isRecording);


    }
}
