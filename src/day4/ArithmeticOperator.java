package day4;

public class ArithmeticOperator {

    public static void main(String[] args) {

        System.out.println(5+3);
        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5/3);

        System.out.println(5+3.0d);
        System.out.println(5-3.0d);
        System.out.println(5*3.0d);
        System.out.println(5/3.0d);

        //store above numbers in variables and replace above statement with variables instead

        int number1 = 5;
        double number2 = 3d;
        double sum = number1 + number2;
        double subtract = number1-number2;
        double multiply = number1*number2;
        double divide = number1/number2;

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }
}
