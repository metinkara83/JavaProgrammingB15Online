package day36;

import java.util.Arrays;

public class Task_SwapFirstLastArray {

    public static void main(String[] args) {

        long[] myLongs={6L, 11L, 44L, 32L, 65L};
        System.out.println("Before swapping myLongs = "+ Arrays.toString(myLongs));
        swapFirstLastArray(myLongs);
        System.out.println("After swapping myLongs = "+ Arrays.toString(myLongs));
    }

    public static void swapFirstLastArray (long[] nums){
        long temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
    }
}
