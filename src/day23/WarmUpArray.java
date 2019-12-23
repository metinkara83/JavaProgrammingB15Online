package day23;

public class WarmUpArray {

    public static void main(String[] args) {

        // create an int array of 7 items
        // assign values
        // 1. print out in reverse order
        // 2. store last item in a variable called lastItem
                    // print it out separately
        // 3. print the item right in the middle
        // Optionally : find sum, find average, find max, find min
        // Double the value of each items in this array

        int[] nums = new int[] {8,53,29,-10,17,33,21};
        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        int lastItem = 0;
        for (int x = nums.length-1 ; x>=0 ; x--) {
              System.out.print(nums[x]+" ");
              sum+=nums[x];
              if (nums[x]>max){
                  max=nums[x];
              }
                if (nums[x]<min){
                min=nums[x];
                }
        }
        System.out.println();
        for (int x = nums.length-1 ; x>=0 ; x--) {
            lastItem = nums[nums.length-1];
        }
        System.out.print(lastItem);
        System.out.println();
        System.out.println(nums[nums.length/2]);
        System.out.println(sum);
        System.out.println(sum/nums.length);
        System.out.println("max is "+max);
        System.out.println("min is "+min);

        for (int x = 0; x < nums.length ; x++) {
            nums[x]=2*nums[x];
            System.out.print(nums[x]+" ");
        }
    }
}
