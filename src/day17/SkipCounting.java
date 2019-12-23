package day17;

import org.w3c.dom.ls.LSOutput;

public class SkipCounting {

    public static void main(String[] args) {

        // Skip counting by 3 from 0 till 30
        int count = 0;
        while (count < 30) {
            count += 3;
            System.out.print(count + " ");
        }

    }
}