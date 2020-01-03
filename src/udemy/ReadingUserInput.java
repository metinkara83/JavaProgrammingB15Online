package udemy;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (counter < 10){
            System.out.println("Enter number #"+(counter+1)+":");
            if (scan.hasNextInt()){
                int num = scan.nextInt();
                ++counter;
                sum += num;
            }
            else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println(sum);
    }
}
