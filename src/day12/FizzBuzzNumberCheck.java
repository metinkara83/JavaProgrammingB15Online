package day12;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        int number=30;

        if (number%5==0 && number%3==0) {
            System.out.println("FizzBuzz Number");
        }
        else if (number%5==0){
            System.out.println("Fizz Number");
        }
        else if (number%3==0){
            System.out.println("Buzz Number");
        }
        else {
            System.out.println("Not Fizz Not Buzz Number");
        }
    }
}
