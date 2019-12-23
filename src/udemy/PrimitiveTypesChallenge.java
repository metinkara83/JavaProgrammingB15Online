package udemy;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte myByteValue = 100;

        short myShortValue = 20000;

        int myIntValue = 1000;

        long myLongValue = 50000L + (10L*(myIntValue + myByteValue + myShortValue));

        System.out.println(myLongValue);

        short shortTotal = (short) (1000 + 10 * (myIntValue + myByteValue + myShortValue));
    }
}
