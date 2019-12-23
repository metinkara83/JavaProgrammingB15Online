package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);

        long[] nums = {10,40,20};
        // how do I change double my first item in the array

        // NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS (You are working with the copy)

        for (int x = 0; x < nums.length ; x++) {
            nums[x] = 2 * nums[x];

            System.out.println(nums[x]);
        }
    }
}
