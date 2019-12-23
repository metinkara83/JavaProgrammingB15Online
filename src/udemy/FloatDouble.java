package udemy;

public class FloatDouble {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5;
        // float myFloatValue = 5.25; it gives error as there is not any 'f' at the end of the value
        // OR casting can be done as float myFloatValue = (float) 5.25; not to get an error message
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        int myIntValue2 = 5 / 2;
        float myFloatValue2 = 5f / 2f;
        double myDoubleValue2 = 5d / 2d;
        System.out.println("MyIntValue2 = " + myIntValue2);
        System.out.println("MyFloatValue2 = " + myFloatValue2);
        System.out.println("MyDoubleValue2 = " + myDoubleValue2);

        int myIntValue3 = 5 / 3;
        float myFloatValue3 = 5f / 3f;
        double myDoubleValue3 = 5d / 3d;
        System.out.println("MyIntValue3 = " + myIntValue3);
        System.out.println("MyFloatValue3 = " + myFloatValue3);
        System.out.println("MyDoubleValue3 = " + myDoubleValue3);

        double pounds = 2.7d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pound is " + kilograms + " kilograms.");
    }
}
