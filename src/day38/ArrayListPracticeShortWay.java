package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPracticeShortWay {

    public static void main(String[] args) {

        // Create List of 6 double in short way
        // we will just read them and will not add or remove item

        List<Double> prices = Arrays.asList(9.99,5.99,3.76,8.99,0.99,13.59);
        System.out.println("prices = " + prices);
        int count = 0;
        for (Double each : prices) {
            if (each>5){
                ++count;
            }
        }
        System.out.println("count = "+count);

        // i want to add 2 more prices (does not have to be the same list)
        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99);  //remove method will remove the first occurrence of the value
        System.out.println("newPrices = " + newPrices);

        // Create an ArrayList Object in one short with many items so we can add or remove

        ArrayList<Double> oneShotPrice = new ArrayList<> (Arrays.asList(9.99,5.55,3.76,8.99));
        oneShotPrice.add(1.99);
        System.out.println("oneShotPrice = " + oneShotPrice);
    }
}
