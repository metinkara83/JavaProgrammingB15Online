package day7;

import jdk.swing.interop.SwingInterOpUtils;

public class IntroToIfStatement {

    public static void main(String[] args) {

        int score = 59;
        // if (PUT YOUR CONDITION HERE){
        //
        // do this if the condition is true
        // } else {
        // do this if the condition is not true
        // }
        System.out.println(score > 60);

        if(score > 60) {
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED"); }
        System.out.println("THE END");
    }
}
