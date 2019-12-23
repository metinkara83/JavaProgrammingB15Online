package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        // get the sum of numbers from 1-10
        // it is interesting, how much is it?

        // when we loop from 1 to 10
        int sum = 0; // nothing has been added yet so 0

        for (int i=1 ; i<=10 ; i++) {
            sum += i;
        }
        System.out.println(sum);

        // HOMEWORK
        // Create a program to ask user two numbers and add numbers between the range
    }
}
