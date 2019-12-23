package day18;

public class ForLoopIntro {

    public static void main(String[] args) {

        // count 1 to 5
        // int x;
        // for loop () has 3 parts seperated by ;
        // first part initialization :
                // it will run only once when you enter the loop
        // second part termination condition :
                // loop will stop if it is false
                // it will be checked every time
        // third part increment or decrement to change condition eventually :
                // it will run after each iteration
        for ( int x=1 ; x<=5 ; ++x ){
            System.out.println(x);
        }
    }
}
