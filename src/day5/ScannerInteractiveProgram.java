package day5;

import java.util.Scanner;

public class ScannerInteractiveProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("What is the temperature in Fahrenheit?");
//        double fahrenheit = scan.nextDouble();
//        double celsius = (5/9d) * (fahrenheit-32);
//        System.out.println(fahrenheit + " fahrenheit equals to " + celsius + " celsius.");

        System.out.println("How many days do you want to convert to minutes?");
        int days = scan.nextInt();
        int minutes = days * 24 * 60;
        System.out.println("There are " + minutes + " minutes in " + days + " days.");

        System.out.println("What is your hourly wage rate?");
        double wageRate = scan.nextDouble();
        double yearlySalary = wageRate * 2080;
        System.out.println("Your annual salary depending on your hourly wage rate of $" + wageRate + " is $" + yearlySalary +".");

        System.out.println("What is the price of tomato?");
        double priceTomato = scan.nextDouble();
        System.out.println("How many pounds of tomato you want to buy?");
        double weightTomato = scan.nextDouble();
        System.out.println("What is the price of potato?");
        double pricePotato = scan.nextDouble();
        System.out.println("How many pounds of potato you want to buy?");
        double weightPotato = scan.nextDouble();
        System.out.println("What is the price of banana?");
        double priceBanana = scan.nextDouble();
        System.out.println("How many pounds of banana you want to buy?");
        double weightBanana = scan.nextDouble();

        double total = (priceTomato * weightTomato) + (pricePotato * weightPotato) + (priceBanana * weightBanana);
        System.out.println("Your grand total for this shopping is $" + total + ".");

    }

}
