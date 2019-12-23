package day10;

public class WarmUpTask_Answer {

    public static void main(String[] args) {

        String myAnswer = "";
        int myNumber = 20;

        if (myNumber%5==0) {
            myAnswer = "Fizz Number";
        }

        else {
            myAnswer = "not a Fizz Number";
        }
        System.out.println("My number is " +myNumber+", It is "+myAnswer);
    }
}
