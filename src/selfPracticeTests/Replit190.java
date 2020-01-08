package selfPracticeTests;

import java.util.Arrays;

public class Replit190 {

    public static int[] mergR(int[] a,int[] b) {
        int length = a.length+b.length;
        int[] result = new int[length];
        for (int i = 0 ; i < a.length ; i++){
            result[i]=a[i];
        }
        for (int k = 0 ; k < b.length ; k++){
            result[k+a.length] = b[k];
        }
        return result;
    }//end mergR

    public static void main(String[] args)
    {
        int[] a = {1,2};
        int[] b = {46,8};
        System.out.println(Arrays.toString(mergR(a,b)));
    }
}
