package selfPracticeTests;

import java.util.Arrays;

public class ReplitJava102 {

    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        System.out.println(isMagic(a)); //true
        int[][] b = {
                {1,1,2},
                {3,2,3},
                {1,4,1}
        };
        System.out.println(isMagic(b)); //false
        int[][] c = {
                {1,1,1},
                {2,2,2}
        };
        System.out.println(isMagic(c)); //false
        int[][] d = {
                {8,1,6},
                {3,5,7},
                {4,9,2}
        };
        System.out.println(isMagic(d)); //true
    }

    public static boolean isMagic(int[][] array)
    {
        int row = array.length;
        int column = array[0].length;

        int leftRight = 0;
        int rightLeft = 0;

        int[] sumRow = new int[row];
        int[] sumColumn = new int[column];

        for (int i = 0 ; i < row ; i++){
            sumRow[i] = 0;
            for (int j = 0 ; j < column ; j++){
                sumRow[i] += array[i][j];
                if (i==j){
                    leftRight += array[i][j];
                }
                if (i+j==(row-1)){
                    rightLeft += array[i][j];
                }
            }
        }

        for (int i = 0 ; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                sumColumn[j] += array[i][j];
            }
        }

        return (row==column && Arrays.equals(sumColumn,sumRow) && sumRow[0]==leftRight && leftRight==rightLeft);
    }
}
