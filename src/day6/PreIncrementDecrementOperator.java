package day6;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        //initializing (given value) offerCount value to 2

        int offerCount = 2;
        //increasing the number by one using normal way;
        //offerCount = offerCount + 1;
        //below is increasing the value by one using compound/shorthand operator
        //offerCount +=1;

        //Since increasing or decreasing a value is very special and often used in programming
        //There is even shorter shortcut for this operation and we use ++ or --, THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        //We cannot use it for any other time like increasing or decreasing value by more than one
        ++ offerCount;
        System.out.println(offerCount);

        --offerCount;
        System.out.println(offerCount);
    }
}
