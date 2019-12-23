package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        /* Amazon has 2 type of user, one is Prime member and another is regular member
        Prime members get free shipping in all purchase no matter the amount
        regular members get free shipping only if their purchase is more than $25 otherwise they get $5 shipping fee
         */

        String memberType = "Regular Member";
        double amount = 15.99d;
        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("Prime Member")){
            System.out.println("You are eligible for 1 Day free shipping");
            amount = amount;
            System.out.println("Your cart total is "+amount+"$ with free shipping");
        }
        else if (amount>25){
            System.out.println("You are not Prime Member, however you are qualified for free shipping");
            System.out.println("Your cart total is "+amount+"$ with free shipping");
        }
        else {
            System.out.println("Sorry, you are not eligible for free shipping");
            shippingFee = 5;
            amount += shippingFee;
            System.out.println("Your cart total is "+amount+"$ with "+shippingFee+"$ shipping fee");
        }
    }
}
