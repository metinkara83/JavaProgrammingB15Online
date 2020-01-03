package day34;

import day31.Calculator_V2;

import java.util.Arrays;

public class MathAction {

    // calling the static methods of other classes

    public static void main(String[] args) {

        // call your build3DigitNumbers method here

        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);

        // in order to use Arrays class that coming from java.util package
        // first we need to import them
        // in order to call static method of Arrays class, we need to use className.methodName(...);
        // here Arrays.toString(your Array objects goes here)
        int[] nums = {2,5,87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        // How can I call static method called calculate in Calculator_V2 under day31 package
        // first thing first, it is not under current package day34
        // so we need to import the class -->> import dat31.Calculator_V2
        // in order to call static method of Calculator_V2 class,
        // Calculator_V2.yourStaticMethodName(...)

        Calculator_V2.calculate(10,20,'-');
    }
}
