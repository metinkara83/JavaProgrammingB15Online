package day31;

import day3.PrintVsPrintln;

public class MethodIntroTask {

    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();

        // You can call static method of other class using className.methodName()
        MethodIntro.sayHello();
    }

    public static void helloWorld (){
        System.out.println("Hello World!!!");
    }
}
