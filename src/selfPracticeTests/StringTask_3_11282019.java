package selfPracticeTests;
import java.util.Scanner;

public class StringTask_3_11282019 {

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

//        Task 3:
//        Ask user to enter full name
//        assuming full name is 2 word
//        Write a program to print users initials
//        for example :
//        Jon Snow -->> Initial is JS
        System.out.println("Please enter your full name:");
        String fullName = scan.nextLine();
        String firstNameInitial = fullName.substring(0,1);
        String lastNameInitial = fullName.substring(fullName.indexOf(" ")+1, fullName.indexOf(" ")+2);
        System.out.println("Initial is "+firstNameInitial+lastNameInitial);
    }
}
