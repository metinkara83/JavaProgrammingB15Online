package day36;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {

        // When we have a class, it becomes a type
        // String has a class or its own so we can;
            // create object, take action with that object
            // create variable with data type String
            // create method parameters with data type String
            // create method return type with data type String

        // i1 is a variable with data type Integer
        // and it can store integer Object
        // what's deal here with 12?? -->> auto-boxing
        Integer i1 = 12;
        Integer i2 = 20;
        sumAndPrint(i1, i2);

        // we directly passed int
        // knowing that auto-boxing
        sumAndPrint(23,10);

        // it is expecting 2 Integer object
        // and we used new keyword to provide 2 Integer Objects
        sumAndPrint(new Integer(23),new Integer(15));

        // it is expecting 2 Integer object
        // and we used Integer.valueOf to provide 2 Integer Objects
        sumAndPrint(Integer.valueOf(23),Integer.valueOf(10));
    }

    /**
     * This method add 2 Integer numbers first and print
     * @param num1 type Integer, first number to add
     * @param num2 type Integer, second number to add
     */
    public static void sumAndPrint (Integer num1, Integer num2){
        // we cannot add two object
        // what is happening here is the moment the + operator appeared,
        // compiler will turn num1 and num2 into int so it can add them numerically
        // integer to int conversion -->> auto-unboxing
        System.out.println(num1+num2);
    }
}
