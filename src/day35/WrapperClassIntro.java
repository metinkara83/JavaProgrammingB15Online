package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;
        // primitive data types are pure value that has no attribute or behaviour

        // each primitive type has wrapper class that turn it into object so we can treat it

        // this is the old not recommended way of creating Integer Object
        Integer xObj1 = new Integer(12);  // String str = new String("abc);

        // valueOf method of Integer class
        // return an integer object by wrapping up the value you passed
        // it has 2 overloaded version one that accept int, another accept String
        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        // since xObj2 is pointing to Integer Object
        // we can call all the methods of Integer class using this Object
        byte bValue = xObj2.byteValue();
        System.out.println("byte bValue = " + bValue);
        double dValue = xObj2.doubleValue();
        System.out.println("double dValue = " + dValue);
        double dValue3 = xObj3.doubleValue();
        System.out.println("double dValue3 = " + dValue3);
    }
}
