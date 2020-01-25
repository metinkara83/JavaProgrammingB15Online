package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contain product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );

        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count = " + productLst.size());

//        String itemDetails = "iPhone 6s,449,18.71";
//        String[] itemSplitArr = itemDetails.split(",");
//
//        String name = itemSplitArr[0];
//        System.out.println("name = " + name);
//
//        double price = Double.parseDouble(itemSplitArr[1]);
//        System.out.println("price = " + price);
//
//        double monthly = Double.parseDouble(itemSplitArr[2]);
//        System.out.println("monthly = " + monthly);
        
//        System.out.println("item name = " + itemDetails.split(",")[0]);
//        System.out.println("item price = " + itemDetails.split(",")[1]);
//        System.out.println("item monthly = " + itemDetails.split(",")[2]);

//         * Task 1 : print only items name
        // for each loop version
        for (String eachProduct : productLst) {
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }
        // for loop version
//        for (int i = 0; i < productLst.size() ; i++) {
//            String namePart = productLst.get(i).split(",")[0];
//            System.out.println("eachProduct name = " + namePart);
//        }
//         * Task 2 : print all the prices more than 500
        for (String eachProduct : productLst) {
            Double eachPrice = Double.parseDouble(eachProduct.split(",")[1]);
            if (eachPrice > 500){
                System.out.println("Each price more than 500 are : "+eachPrice);
            }
        }
//         * Task 3 : print average price
        int sum = 0;
        for (String eachProduct : productLst) {
            Double eachPrice = Double.parseDouble(eachProduct.split(",")[1]);
            sum += eachPrice;
        }
        double averagePrice = sum / productLst.size();
        System.out.println("averagePrice = " + averagePrice);
//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst) {
            Double monthlyPayment = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthlyPayment<20){
                System.out.println("Items having less than $20 monthly payment : "+eachProduct.split(",")[0]);
            }
        }
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for (String eachProduct : productLst) {
            Double monthlyPayment = Double.parseDouble(eachProduct.split(",")[2]);
            if (eachProduct.split(",")[0].contains("iPhone")){
                System.out.println("monthlyPayment for all iPhone models = " + eachProduct.split(",")[0] + " "+monthlyPayment);
            }
        }
//         * Task 6 : Print all information about most expensive item.
        double max = Double.MIN_VALUE;
        for (String eachProduct : productLst) {
            Double eachPrice = Double.parseDouble(eachProduct.split(",")[1]);
            if (eachPrice > max){
                max = eachPrice;
            }
        }
        for (String eachProduct : productLst) {
            if (Double.parseDouble(eachProduct.split(",")[1])==max){
                System.out.println("The most expensive item information is : "+eachProduct);
            }
        }

//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst.contains("Dyson")); // false
        System.out.println(productLst.indexOf("Dyson")); // -1
        //    System.out.println(productLst.startWith("Dyson")); // COMPILER ERROR

        // First we need to find out the element that contain word Dyson in the list
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {
            // checking the element start with dyson
            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i; // if so set the dysonIndex to that location
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        // This is original dyson details using the index
        String dysonDetails = productLst.get(dysonIndex);
        // in order to get 80% off the price and put it back to list
        // we need the price and monthly in double format so we can do calculation
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        // Putting it back to the dysons details after doing the calculation
        // 80% off means you are paying for 20% of original price
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

        System.out.println("dysonDetails = " + dysonDetails);
        // then use the set method to set the value back to the list
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);

//         * Task 8 : Count the items prices more than average price.
        int count = 0 ;
        for (String eachProduct : productLst) {
            if (Double.parseDouble(eachProduct.split(",")[1])>averagePrice){
                ++count;
            }
        }
        System.out.println("The number of items having more than average price : "+count);
//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
        for (int i = 0 ; i < productLst.size() ; i++) {
            if (Double.parseDouble(productLst.get(i).split(",")[1])>averagePrice){
                productLst.remove(productLst.get(i));
                i--;
            }
        }
        System.out.println(productLst);

//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for (int i = 0 ; i < productLst.size() ; i++){
            itemNames.add(productLst.get(i).split(",")[0]);
        }
        System.out.println(itemNames);

        for (int i = 0 ; i < productLst.size() ; i++){
            prices.add(Double.parseDouble(productLst.get(i).split(",")[1]));
        }
        System.out.println(prices);

        for (int i = 0 ; i < productLst.size() ; i++){
            monthlyPayments.add(Double.parseDouble(productLst.get(i).split(",")[2]));
        }
        System.out.println(monthlyPayments);
    }

}
