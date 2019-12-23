package selfPracticeTests;

import java.util.*;

public class Replit122 {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            //TODO: write your code below
            int reference = nums[0];
            for (int y = 0 ; y<nums.length ; y++){
                reference = nums[y];
                for(int x = 0 ; x<nums.length ; x++){
                    if (reference==nums[x] && x!=y){
                        break;
                    }
                }
            }
            System.out.println(reference);
    }
}
