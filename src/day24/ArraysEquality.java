package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores1 = {2 , 5 , 6 , 7 , 3 , 34 , 6};

        int[] scores2 = {22 , 45 , 6 , 37 , 3 , 6 , 9};

        int[] scores3 = {2 , 5 , 6 , 7 , 3 , 34 , 6};

        int[] scores4 = {2 , 34 , 3 , 7 , 6 , 5 , 6}; // it has same numbers as 1 but different order

        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);

        // for checking the equality of 2 array object content
        // equals --->> Arrays.equals(firstArray, secondArray)
        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println(isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println(isS1S3Equals);

        boolean isS1S4Equals = Arrays.equals(scores1,scores4);
        System.out.println(isS1S4Equals);

        System.out.println("Sorting score 1 and score 4 then compare equality ");
        Arrays.sort(scores1);
        Arrays.sort(scores4);
        boolean afterSortIsS1S4Equals = Arrays.equals(scores1,scores4);
        System.out.println(afterSortIsS1S4Equals);
    }
}
