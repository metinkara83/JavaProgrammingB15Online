package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {

    public static void main(String[] args) {

        System.out.println(tillNumber(5));
        System.out.println(tillNumber(2));
        System.out.println(tillNumber(20));
        
        List<Integer> myList = tillNumber(25);
        System.out.println("myList = " + myList);

    }

    // Create a method that accept a finalNumber as int
    // return an ArrayList of Integer containing numbers
    // starting from 1 till finalNumber

    public static ArrayList<Integer> tillNumber (int finalNumber){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int numbers = 1; numbers <=finalNumber ; numbers++) {
            nums.add(numbers);
        }
        return nums;
    }
}
