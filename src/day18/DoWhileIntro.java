package day18;

public class DoWhileIntro {

    public static void main(String[] args) {

        // count from 1 to 5
        // do {
        //      take some action here and repeat it
        // } while (some condition is true);

        int x = 1;
        do {
            System.out.println(x);
            ++x;
        } while (x<=5); // semi colon is mandatory !!!

        // count from 5 to 1
        int y = 5;
        do {
            System.out.println(y);
            --y;
        } while (y>=1);

        // While loop vs Do While Loop
        // while loop check the condition first then enter the statement
        // do while loop will take the action at least once then check the condition
        // do while loop always run at least one iteration
        // while loop might not even run!!!

        int z = 1000;
        do {
            System.out.println("Keep Going");
        } while (z<5);
        System.out.println("The End");

        while (z<5){
            System.out.println("Keep going in while");
        }
    }
}
