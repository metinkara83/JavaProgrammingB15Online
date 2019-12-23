package day12;
import java.util.Scanner;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Which month are we in, please write the month as an integer?");
        int month=scan.nextInt();
        if (month<=5 && month >=3){
            System.out.println("It is Spring");
        }
        else if (month<=8 && month >=6){
            System.out.println("It is Summer");
        }
        else if (month<=11 && month >=9){
            System.out.println("It is Fall");
        }
        else if (month<=2 || month ==12){
            System.out.println("It is Winter");
        }
        else {
            System.out.println("Invalid Month!!!");
        }
    }
}
