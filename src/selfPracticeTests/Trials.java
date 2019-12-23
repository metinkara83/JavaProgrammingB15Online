package selfPracticeTests;

import java.util.Scanner;

public class Trials {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        double max = inp.nextDouble();
        int count= 0;
        for (int i = 2 ; i<Math.sqrt(max)+1 ; i++){
            if (max%i==0) {
                ++count;
                System.out.println("not prime");
                break;
            }
        }
        if (count ==0 && max!=1){
            System.out.println(max);
            System.out.println("prime");
        }
    }
}
