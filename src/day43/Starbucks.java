package day43;

import java.util.Scanner;

public class Starbucks {

    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        System.out.println("c1 = " + c1);

        Coffee c2 = new Coffee("Intensito",9);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Blonde",5,1.6);
        System.out.println("c3 = " + c3);

        Coffee c4 = new Coffee("Latte",3,-2.6);
        System.out.println("c4 = " + c4);

        double sumOfAllCoffee = c1.getPrice()+c2.getPrice()+c3.getPrice()+c4.getPrice();

//        c1 = null; // it breaks the leash of the dog, removes the pointer of the object
        System.out.println("sumOfAllCoffee = " + sumOfAllCoffee);


        // any non-primitive type can be assigned to null
//        String str = null;
//        Scanner scan = null;
//        Coffee cx = null;
    }
}
