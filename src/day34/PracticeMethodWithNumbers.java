package day34;

public class PracticeMethodWithNumbers {

    public static void main(String[] args) {

//        1, write a method called build3DigitNumber
//        it has 3 int parameters digit1 digit2 digit3
//        and it will return the 3 digit numbers you have build
//        if any of digit1 digit2 digit3 is not within the range of 0-9 the change it to 0 ,
//        for example :
//        build3DigitNumber(4,2,4) --->> 424
//        build3DigitNumber(0,2,1) --->> 21
//        build3DigitNumber(65,6,9) --->> 69
        System.out.println(build3DigitNumber(4,2,4));
        System.out.println(build3DigitNumber(0,2,1));
        System.out.println(build3DigitNumber(65,6,9));

        // public       -- access modifier
        // static       -- does not have an object to call
        // void         -- return type, does not return anything
        // String name  -- method parameter
        // printname ("Kamran");
        // public static void printName (String name)
        // Kamran is the actual data that you passed
        // is also called argument

    }

    public static int build3DigitNumber (int digit1, int digit2, int digit3){
        if (digit1<0 || digit1>10){
            digit1=0;
        }
        if (digit2<0 || digit2>10){
            digit2=0;
        }
        if (digit3<0 || digit3>10){
            digit3=0;
        }
        int number = digit1*100 + digit2*10 + digit3;
        return number;
    }
}
