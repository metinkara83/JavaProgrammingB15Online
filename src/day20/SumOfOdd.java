package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        // Give me the sum of odd numbers from 10-100
        int sumOfEven=0;
        int sumOfOdd=0;
        for (int i=10; i<=100 ; i++) {
            if (i%2==1) {
                sumOfOdd+=i;
                         }
            else {
                sumOfEven+=i;
            }
        }
        System.out.println("Sum of even are: "+sumOfEven);
        System.out.println("Sum of odd are: "+sumOfOdd);
    }
}
