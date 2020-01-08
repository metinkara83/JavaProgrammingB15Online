package day37;

import java.util.ArrayList;

public class PriceListPractice {

    public static void main(String[] args) {

        ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);

        // change the third price to $10
        priceList.set(2,10D);
        System.out.println("Third item new price = " + priceList.get(2));

        // Add 4$ to first price : your first price value should be original price + 4
        priceList.set(0,priceList.get(0)+4);
        System.out.println("First item price increased by $4 = " + priceList.get(0));

        // change last price to sum of first and second price
        priceList.set(priceList.size()-1,priceList.get(0)+priceList.get(1));
        System.out.println("Last item price is the sum of first and second item = " + priceList.get(priceList.size()-1));

        // give 40% off to second price
        priceList.set(1,priceList.get(1)*0.6);
        System.out.println("Second item price is discounted by 40% = " + priceList.get(1));

        // Double the value of each and every price in the list
        for (int i = 0; i < priceList.size() ; i++) {
            priceList.set(i, priceList.get(i)*2);
        }
        System.out.println("Doubled values are = " + priceList);

        // cut the price into half if the price is more than $20
        for (int i = 0; i < priceList.size() ; i++) {
            if (priceList.get(i)>20){
                priceList.set(i,priceList.get(i)/2);
            }
        }
        System.out.println("Half price for the items having price more than $20 = " + priceList);

        // swap the first value with the last value
        Double temp = priceList.get(0);
        priceList.set(0,priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);
        System.out.println("Swap the first value with the last value = " + priceList);

    }
}
