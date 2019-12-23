package day13;

public class WarmUp_AmazonShippingCalculator2 {

    public static void main(String[] args) {

        // create a boolean, store the result of youWantToShop
        // if yes, do you want to go to Store or do you wanna shop online

        // if user do not wanns shop at all, print good job stay home coding!!!

        boolean youWantToShop=true;
        String preference="Store";

        // the same as below: if (youWantToShop==true)

        if (youWantToShop) {
            if (preference.equals("Store")) {
                System.out.println("Going to Store for shopping");
            } else {
                System.out.println("Going to Online for shopping");
            }
        }
        else{
                System.out.println("Good job, stay home coding");
            }

    }
}
