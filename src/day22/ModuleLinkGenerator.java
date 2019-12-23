package day22;

public class ModuleLinkGenerator {

    public static void main(String[] args) {

        // Here is the direct links to lead you to correct days
        // https://learn.cybertekschool.com/courses/278/modules#3317
        // this will lead you to day 21
        // https://learn.cybertekschool.com/courses/278/modules#3318
        // this will lead you to day 22
        // https://learn.cybertekschool.com/courses/278/modules#3319
        // this will lead you to day 23
        // https://learn.cybertekschool.com/courses/278/modules#3320
        // this will lead you to day 24
        // and so on
        // So write a program to generate the links to
        // lead you to the right module of the day from day 21 all the way till day 56

        for (int x = 21; x <=56 ; x++) {
            System.out.println("https://learn.cybertekschool.com/courses/278/modules#33"+(x-4));
            System.out.println("this will lead you to day "+x);

        }
    }
}
