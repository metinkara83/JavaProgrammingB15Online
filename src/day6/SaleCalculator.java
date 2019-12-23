package day6;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the regular price of the item?");
        double regularPrice = scan.nextDouble();
        System.out.println("What is the discount percentage?");
        double discountPercentage = scan.nextDouble();
        double salePrice = regularPrice * (1-discountPercentage);
        System.out.println("Regular price is $" + regularPrice + ", discount percentage is " + discountPercentage + " and you got deal for $" + salePrice + ".");



    }
}
