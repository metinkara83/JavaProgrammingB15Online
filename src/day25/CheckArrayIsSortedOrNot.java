package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] nums = {13,31,8,5,21,2};
        // storing the size of an array into a variable
        int numsItemCount = nums.length;
        // I want to copy the content of nums array into the new array

        // creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];
        numsCopy[0]=nums[0];
        numsCopy[1]=nums[1];
        numsCopy[2]=nums[2];
        numsCopy[3]=nums[3];
        numsCopy[4]=nums[4];
        numsCopy[5]=nums[5];

        for (int x = 0; x < numsItemCount ; x++) {
            numsCopy[x] = nums[x];
        }
        System.out.println("Before sort numsCopy = "+ Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy = "+ Arrays.toString(numsCopy));

        // check whether the array still have same content in same order after sorting
        // what method will check for content
        if(Arrays.equals(nums,numsCopy)){
            System.out.println("This array is already sorted");
        }
        else {
            System.out.println("This array is not already sorted");
        }
    }
}
