package day17;

public class BackwardEvenNumberFinder {

    public static void main(String[] args) {

        // Print all the even numbers backward from 100-0
        // try to use if statement rather than -2

        int num = 100;
        while (num>=0) {
            if (num%2==0) {
                System.out.print(num+" ");
            }
            else {
            }
            --num;
        }
    }
}
