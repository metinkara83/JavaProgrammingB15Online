package day27;

import java.util.Arrays;

public class MultiDimensionalArrays3DPractice {

    public static void main(String[] args) {

        int[][][] arr3D = { { {1,2,3} , {4,5,6} }  ,  {  {7,8,9} , {10,11,12}  } };

        for (int i = 0; i < arr3D.length ; i++) {  // each index number of 2D array
            for (int j = 0; j < arr3D[i].length ; j++) {  // each index number of 1D array
                for (int k = 0; k < arr3D[i][j].length ; k++) {  // each index number of the values
                    System.out.print(arr3D[i][j][k]+" ");
                }
            }
        }

        // Assignment: convert the nested loops above to the nested for each loop
        int max = arr3D[0][0][0];
        for (int[][] each2DArray: arr3D) {
            for (int[] each1DArray : each2DArray) {
                for (int eachElement : each1DArray) {
                    if(max<eachElement){
                        max=eachElement;
                    }
                    System.out.print(eachElement+" ");
                }
            }
        }
        System.out.println("=======");
        System.out.println("The max is: "+max);
    }
}
