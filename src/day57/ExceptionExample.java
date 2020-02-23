package day57;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("Hello B15 In-Class Friends!");
        // int num = 2.5; COMPILE ERROR
        int[] nums = new int[3];
        nums[0] = 55;
        nums[1] = 66;
        nums[2] = 77;
//        nums[3] = 200; // Runtime error here - ArrayIndexOutOfBoundsException is thrown here

//        System.out.println("Bye Bye"); // This line does not run
        
//        int result = 10/0; // ArithmeticException is thrown here
//        System.out.println("result = " + result); //
    }
}
