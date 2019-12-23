package day5;

public class VariablesMorePractice {

    public static void main(String[] args) {

        // Task 1 : Age Calculator
        // given birth year, please calculate the age

        int birthYear = 1983;
        int currentYear = 2019;
        int age = currentYear - birthYear;
        System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old.");

        // Task 2 : you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of : You are driving 10 mph more than speed limit

        int speedLimit = 50;
        int overTheLimit = 10;
        int currentSpeed = speedLimit + overTheLimit;
        String output1 = "you are driving 10 mph more than speed limit";
        String output2 = "Your speed is";
        String output3 = "and the limit on this road is";

        System.out.println(output2 + " " + currentSpeed + " " + output3 + " " + speedLimit + ", so " + output1 + ".");


    }
}
