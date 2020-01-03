package udemy;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true){
            System.out.println("Enter number:");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt){
                int num = scan.nextInt();
                if (first){
                    first = false;
                    min = num;
                    max = num;
                }
                if (num<min) min = num;
                if (num>max) max = num;
            }
            else break;
            scan.nextLine();
        }
        System.out.println("min number is "+min);
        System.out.println("max number is "+max);
    }
}
