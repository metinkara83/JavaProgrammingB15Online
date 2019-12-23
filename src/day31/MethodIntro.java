package day31;

public class MethodIntro {

    public static void main(String[] args) {

        // two ways to call static methods
        // ClassName.methodName (external data if needed)
        // if you are in same class
        // you can directly call them
        // methodName (external data if needed)

        MethodIntro.sayHello(); // if the method is not in the same class
        sayHello();

    } // MAIN METHOD ENDS HERE

    // DO NOT CREATE A METHOD INSIDE MAIN METHOD
    // IT CAN BE ANYWHERE INSIDE THE CLASS OUTSIDE MAIN METHOD

    public static void sayHello() {
        System.out.println("Hello World");
        System.out.println("My name is Metin");
        System.out.println("I love Java");
    }
}
