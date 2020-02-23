package day59;

import java.util.Scanner;

public class ExceptionPractice {

    // scan.nextInt() -->> expects number
    // if we pass String -->> exception at run time
    // String str = "a";
    // str.charAt(100) -->> exception at run time
    // String str2 = null;
    // str.charAt(0) -->> exception at run time
    // int[] arr = {1,2,4};
    // print(arr[100]) -->> exception at run time
    // print(9/0); -->> exception at run time
    // Shape a1 = new Circle();
    // Rectangle r1 = (Rectangle) a1;
    // above code compile but throw ClassCastException at run time because Circle is not a Rectangle

    // What about Compiler Error???   NOOOO
    // This is Syntax error that does not let your code compile

    // The process of dealing with the unexpected event is called "Exception Handling"
    // Just like everything else: Exceptions are OBJECT !!!
    // Exceptions in Java is categorized using Exception Hierarchy
            // try to recover from it
            // or report it
            // diagnose it / debug
    // How do you handle exceptions
            // try catch block
            // try {
                    // code that might throw an exception
            // } catch(Exception e) {
                    // if the exception happen the flow of program will come here
                    // take action
            // or declare it

    // All different types of exceptions have its own class to be the blueprint for the exceptions object happen at run time
    // Throwable is the super class type of all the exceptions classes

    public static void main(String[] args) {

        // This simple program will get certain character from Furkan's name
        // according to the index user provided
        System.out.println("The Start");
        String name = "Furkan";
//        System.out.println(name.charAt(10));

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name?");
        int targetIndex = scan.nextInt();
        try {
            System.out.println(name.charAt(targetIndex));
//        }catch (Exception e) { // this is a general catch block that can catch any exception IS-A dub type of Exception class
            // below will narrow down the catch block to only catch StringIndexOutOfBoundsException and take action accordingly
        } catch (StringIndexOutOfBoundsException e){
            // getMessage is a method coming from Exception class and provide some more details about exception object
            System.out.println( "Message from getMessage method : "+ e.getMessage() );
            System.out.println( "Something unusual happened!!!" );
        }
        System.out.println("The End");

        // Exceptions are OBJECT, so it has its own class and
        // we can create object ourselves just like we did from any other classes
//        StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();
//        System.out.println(e1.toString());
    }
}
