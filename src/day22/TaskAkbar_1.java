package day22;
import java.util.Arrays;
public class TaskAkbar_1 {

    public static void main(String[] args) {

//        create an int array of 6 elements and find out
//        average of the array
//        sum of all elements
//        sum of even numbers in the array
//        sum of odd numbers in the array
//        max number in the array
//        min number in the array
        int[] numbers = new int[] {-2,19,7,23,3,12,-45,8,100};
        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int max = numbers[0];
        int min = numbers[0];
        int secondMax = numbers[0];

        for (int x = 0; x < numbers.length; x++) {
            sum += numbers[x];
            if (numbers[x] % 2 == 0) {
                sumEven += numbers[x];
            } else {
                sumOdd += numbers[x];
            }
        }
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] > max) {
                max = numbers[x];
            } else if (numbers[x] < min) {
                min = numbers[x];
            }
        }
         for (int x = 0; x < numbers.length; x++) {
            if (numbers[x]>secondMax && max>numbers[x]){
                secondMax=numbers[x];
            }
         }
        System.out.println("The max number in the array is "+max);
        System.out.println("The second max number in the array is "+secondMax);
        System.out.println("The min number in the array is "+min);
        System.out.println("The average of the array is "+(sum/numbers.length));
        System.out.println("The sum of all elements is "+sum);
        System.out.println("The sum of even numbers in the array is "+sumEven);
        System.out.println("The sum of odd numbers in the array is "+sumOdd);

    }
}
