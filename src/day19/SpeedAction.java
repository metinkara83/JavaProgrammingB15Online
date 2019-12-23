package day19;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the starting speed:");
        int start = scan.nextInt();
        System.out.println("Please enter the ending speed:");
        int end = scan.nextInt();

//        for (; start<=end ; start++) {
//            System.out.print(start+" ");
//        }
        for (int speed=start ; speed<=end ; speed++) {
            System.out.print(speed+" ");
        }
    }
}
