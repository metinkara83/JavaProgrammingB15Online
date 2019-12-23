package day25;

public class Task_Muhtar {

    public static void main(String[] args) {

//        Tasks:
//        1.  Write a program that can print out the unique values from an int Array
//        Ex:
//        if arr -> {1,1,2,3,3}
//        output: 2
        int[] numbers = {1 , 1 , 2 , 2 , 3 , 4 , 4 , 5 , 5, 6};

        for (int x = 0; x < numbers.length; x++) {
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[x] == numbers[i]) {
                    ++count;
                }
            }
            if (count == 1) {
                System.out.println(numbers[x]);
            }
        }
//        2. Write a program that can print out the unique values from  String Array
//        Ex:
//        if arr -> {"a" , "a ", "b", "c", "c"}
//        output: b
            String[] array = {"A" , "A" , "B" , "C" , "C"};
            for (int z = 0; z < array.length ; z++) {
                int count2 = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals(array[z])) {
                        ++count2;
                    }
                }
                if (count2 == 1) {
                    System.out.println(array[z]);
                }
            }

//        3. Write a program that can find the second max number from an int array
//        Ex:
//        if arr -> { 1,2,3,4,5}
//        output: 4
//        DO NOT use sort method
        int[] grades = {7 , 8 , 9 , 6 , 7 , 8 , 5 , 4};
            int max = grades[0];

        for (int eachGrade : grades) {
            if (eachGrade > max){
                max = eachGrade;
            }
        }
        System.out.println("The max grade is: "+max);

        int secondMax = grades[0];
        for (int eachGrade : grades) {
            if(eachGrade==max){
                continue;
            }

            if(eachGrade>secondMax){
                secondMax = eachGrade;
            }
        }
        System.out.println("The secondmax grade is: "+secondMax);

//        4. Swap two variable' values without using a temporary variable
//        Ex:
//        if a =10, b= 20;
//        output: print( a ) ==> 20
//        print( b ) ==> 10
        int a = 10, b = 20;
        // with using temporary variable
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("After assignment: "+"a = "+a+" b = "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping: "+"a = "+a+" b = "+b);

        // Assignment: write a program that can divide two numbers without / or % operator

        int num1 = 24;
        int num2 = 4;
        int quotient = 0;
        int remainder = 0;
        for (int i = num1; i >= num2 ; i-=num2) {
            quotient++;
        }
        remainder = num1 - (quotient * num2);
        System.out.println("The quotient of num1 divided by num2 is "+quotient);
        System.out.println("The remainder is "+remainder);
    }
}
