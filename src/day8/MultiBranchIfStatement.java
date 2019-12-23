package day8;
import java.util.Scanner;
public class MultiBranchIfStatement {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        //pseudocode
        /*
        given your currentSpeed and speedLimit
        check whether the currentSpeed is more than 90 -->> jail
        more than 80 and less than 90 -->> reckless driving
        more than 70 and less than 80 -->> point taken
        more than 60 and less than 70 -->> warning
        if not speeding keep driving
         */
        System.out.println("Please enter your current speed");
        int currentSpeed = scan.nextInt();

//        if (currentSpeed>90) {
//            System.out.println("Go to jail!");
//        }
//        else if (currentSpeed<=90 && currentSpeed>80){
//            System.out.println("Reckless driving");
//        }
//        else if (currentSpeed<=80 && currentSpeed>70){
//            System.out.println("Point taken");
//        }
//        else if (currentSpeed<=70 && currentSpeed>60){
//            System.out.println("Warning");
//        }
//        else {
//            System.out.println("Keep driving");
//        }

        if (currentSpeed>90) {
            System.out.println("Go to jail!");
        }
        else if (currentSpeed>80){
            System.out.println("Reckless driving");
        }
        else if (currentSpeed>70){
            System.out.println("Point taken");
        }
        else if (currentSpeed>60){
            System.out.println("Warning");
        }
        else {
            System.out.println("Keep driving");
        }
    }
}
