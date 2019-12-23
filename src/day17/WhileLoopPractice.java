package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // Count 1 to 5 and then 5 to 1
        int counter = 1;
        while (counter <= 5) {
            System.out.print(counter+" ");
            ++counter;
        }
        System.out.println("\ncounter: "+counter);

        // now I want to count from 5 to 1, using same counter
        // if I use (counter >=1) as condition I will have these
        // -->> 6>=1  5>=1  4>=1  3>=1  2>=1  1>=1 true  0>=1 false!!
        while (counter >1 ) {
            --counter;
            System.out.print(counter+" ");
        }
    }
}
