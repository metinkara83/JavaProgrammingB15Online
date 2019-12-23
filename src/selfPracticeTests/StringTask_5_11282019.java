package selfPracticeTests;
import java.util.Scanner;

public class StringTask_5_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String methods :
//        length()
//        equals()
//        equalsIgnoreCase()
//        toUpperCase()
//        toLowerCase()
//        contains()
//        startsWith()
//        endsWith()
//        indexOf()
//        lastIndexOf()
//        isEmpty() // isBlank()
//        trim()
//        replace()
//        substring()

//        Task 5:
//        given a name with prefix, stored in a String variable called name
//        for example
//        Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
//                -- in case insensitive condition ----
//        print as below
//        if the name Started with (Dr )-->> Doctor
//        if the name Started with (Mr )-->> Male
//        if the name Started with (Miss )-->> Single female
//        if the name Started with (Mrs )-->> Married female
        System.out.println("Please enter your name with your prefix: ");
        String name=scan.nextLine();
            if (name.toLowerCase().startsWith("dr")) {
                System.out.println("Doctor");
            }
            else if (name.toLowerCase().startsWith("mrs")) {
                System.out.println("Married Female");
            }
            else if (name.toLowerCase().startsWith("mr")) {
                System.out.println("Male");
            }
            else if (name.toLowerCase().startsWith("miss")) {
                System.out.println("Single Female");
            }

    }
}
