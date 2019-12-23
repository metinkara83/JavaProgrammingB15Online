package day7;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name, last name and company name:");
       // System.out.println("What is your first name?");
        String firstName=scan.next();
      //  System.out.println("What is your last name?");
        String lastName=scan.next();
      //  System.out.println("What is the name of your company?");
        String company=scan.next();
        String email=(firstName + "_" +lastName +"@"+company+".com");
        System.out.println("My name is " + firstName + " " + lastName+ " and I work for " + company + " and my email is " +email + ".");
    }
}
