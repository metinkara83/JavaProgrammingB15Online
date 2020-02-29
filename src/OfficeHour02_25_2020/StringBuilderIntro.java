package OfficeHour02_25_2020;
/**
 * String vs StringBuilder vs StringBuffer
 *
 * String is a class in Java which is immutable
 * Heap - String Pool
 * String str1 = "abc";
 * String str2 = "abc";
 *
 * StringBuilder --> mutable
 * StringBuffer --> same with StringBuilder but synchronized
 */
public class StringBuilderIntro {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("word");
        StringBuilder sb2 = sb1;
        // sb1 -- word
        // sb2 -- sb1
        System.out.println(sb1);
        System.out.println(sb2);
        sb1 = new StringBuilder("java");
        // sb2?
        // sb1 -- java
        // sb2 -- word
        System.out.println(sb1);
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder("selenium");
        // sb3 -- selenium
        sb3 = sb3.reverse();
        // sb3 -- muineles

        sb3.append(" will start");
        System.out.println(sb3);






    }

}
