package day18;
import java.util.Scanner;
public class ReplitParty {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name="";
        String conf="";
        String list="";
        do {
            System.out.println("Please enter guest name:");
            name= scan.next();
            list+=name+", ";
            System.out.println("Do you want to enter new guest name:");
            conf = scan.next();

        } while (conf.equalsIgnoreCase("yes")) ;

        System.out.println("Guest's list: "+list);
    }
}
