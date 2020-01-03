package day34;

public class OverloadingPractice {

    public static void main(String[] args) {

//        Create a class called OverloadingPractice
//        create 4 static void overloaded version of add method
//        1, add
//        has 1 int parameter and add 100 to that number
//        and print out the result
//        2, add
//        has 2 int parameters and add them to get sum
//        and print out the result
//        3, add
//        has 3 int parameters and add them to get sum
//        and print out the result
//        4, add
//        has 2 long parameters and add them to get sum
//        and print out the result

        add(25);
        add(15,20);
        add(40,50,60);
        add(1000L,2000L);
    }

    public static void add (int num){
        num = num+100;
        System.out.println(num);
    }
    public static void add (int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }
    public static void add (int num1, int num2, int num3){
        int sum = num1+num2+num3;
        System.out.println(sum);
    }
    public static void add (long num1, long num2){
        long sum = (long)num1+(long)num2;
        System.out.println(sum);
    }

}
