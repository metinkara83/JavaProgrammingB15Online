package selfPracticeTests;

public class CalculatorWithMethods {

    public static void main(String[] args) {

        int x = addition(5,20);     // ==>>25
        int y = division(250,50);   // ==>>5
        multiplication(x,y);   //==>>25*5=125

    }

    public static int addition(int a, int b){
        return (a+b);
    }
    public static int subtraction(int a,int b){
        return (a-b);
    }
    public static void multiplication(int a, int b){
        System.out.println(a*b);
    }
    public static int division(int a, int b){
        return a/b;
    }
}
