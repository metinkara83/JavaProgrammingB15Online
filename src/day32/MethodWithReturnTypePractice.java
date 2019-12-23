package day32;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        System.out.println(divide(10,3));
        System.out.println(divide(10,0));

    }

    // create a method called divide
    // it has 2 double parameters and return the result as double

    public static double divide (double num1, double num2){
        // to avoid to get the result we did not want
        if (num2==0){  // we check the condition if num2 is 0
            return 0;  // if it is we just return 0
        }
        else {  //if not
            return num1/num2;  // we just return actual result
        }
//        return num1/num2;
    }

    // create a method called seniorCitizen
}
