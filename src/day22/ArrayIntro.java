package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        // syntax for creating variable to store single item and assigning value
        // dataType variableName = value here
        int num1 = 10;

        // syntax for creating variable to store multiple items and assigning values
        // dataType [] variableName = new dataType [count of item];
        int[] scores = new int[4];
        // assigning value to each index
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
        // accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        // updating the value at certain index
        scores[1]=99;
        System.out.println(scores[1]);
        // Once array is created with certain size, we CANNOT CHANGE THE SIZE !!!

        // When you create new Array Object, it will get default value in each element
        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println("----------");
        // create a byte array with size 4
        // and store it into a variable called data
        byte[] data = new byte[4];
        // assign value for each index location
        // access them to print them out
        data[0]=13;
        data[1]=24;
        data[2]=35;
        data[3]=46;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        // update the last index value
        // then print it out
        data[3]=59;
        System.out.println(data[3]);
    }
}
