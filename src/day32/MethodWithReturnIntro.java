package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {
    
        String name = giveMeMyName();
        System.out.println("name = " + name);

        int myResult = valueDoubler(14);
        System.out.println("myResult = " + myResult);
    }

    // create a static method that doubles the value of a number
    // it accepts one int parameter and return doubled value of that number
    // whole purpose of writing a method that return a value
    // so we can save the result after calling the method and use it somewhere else

    public static int valueDoubler (int num){
        System.out.println("I am going to double the value of "+num);
        int result= 2 * num;
        return result;
    }


    // I want to create a static method called giveMeMyName
    // it returns your name as a result and it has no parameters
    
    public static String giveMeMyName (){
        // assume getting my name is multi step complex operation
        return "Metin";
    }
}
