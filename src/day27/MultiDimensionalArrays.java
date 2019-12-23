package day27;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        // Single dimensional array contains values int[] arr = {1,2,3};
        // Multi dimensional array: an array that can contain array(s)
        // N dimensional array contains (N-1) dimensional arrays
        // ex: 2 dimensional array contains 1 dimensional array

        int[] arr1D = {1,2,3};
        // [index num of elements]
            // arr1D[1] ==>> 2

        // 2D array: is an array that contains single dimensional arrays
        //                  0 1 2      0 1 2
        int[] [] arr2D = { {1,2,3,} , {4,5,6}};
        // index:              0         1
        // [index num of 1D arrays][index num of elements]
        // arr2D[0] ==>> {1,2,3}
        System.out.println("The length of arr2D is "+arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));  // toString to return int array
        System.out.println(Arrays.toString(arr2D[1]));

        // arr2D[0][2] ==>> 3
        System.out.println(arr2D[0][2]);  // returns int value
        // arr2D[1][1] ==>> 5
        System.out.println(arr2D[1][1]);

        System.out.println(Arrays.toString(arr2D)); // Arrays.toString is only applicable to single dimensional arrays

        System.out.println(Arrays.toString(arr2D[1]));

        // Arrays.deepToString(multi-D Arrays);
        System.out.println(Arrays.deepToString(arr2D));
    }
}
