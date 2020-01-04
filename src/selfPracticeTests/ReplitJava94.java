package selfPracticeTests;

public class ReplitJava94 {

    public static void main(String[] args) {

//        Complete the countNegativeOdd method.
//        The method should take in 2-D integer array and return the number of elements that are negative AND odd

        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        System.out.println(countNegativeOdd(a)); //should print 3
    }

    public static int countNegativeOdd(int[][] array) {
        int negativeAndOddCount = 0;
        for (int[] each1DArray : array) {
            for (int each : each1DArray) {
                if (each < 0 && each %2!=0) {
                    ++negativeAndOddCount;
                }
            }
        }
        return negativeAndOddCount;
    }
}
