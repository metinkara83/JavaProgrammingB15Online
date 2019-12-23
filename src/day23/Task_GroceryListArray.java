package day23;

import java.util.Arrays;

public class Task_GroceryListArray {

    public static void main(String[] args) {

//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}

        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};
//
//        Create a float array of 6 float values to store prices
//        { 1.99,   0.99,    4,65,    3.89,       3.88,      2.88  }

        float[] storePrices = { 1.99f,   0.99f,    4.65f,    3.89f,       3.88f,      2.88f  };
//
//        assume that the order of grocery Items match the prices in same order.
//        Do below tasks :
//        1, loop through each grocery items and print them in one line

        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount-1;
        String lastFruit = groceryItems[lastItemIndex];

        for (int x = 0; x < groceryItems.length ; x++) {
            System.out.print(groceryItems[x]);

            // only print ", " when the fruit is not last item

            if (!groceryItems[x].equals(lastFruit)) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("==========================");

//        1.1 print each items at odd index

        for (int x = 0; x < groceryItems.length ; x++) {
            if(x%2==0){
                continue;
            }
            System.out.print(groceryItems[x]+", ");
        }
        System.out.println("");
        System.out.println("==========================");

//        1.2 print all items in reverse order

        for (int x = groceryItems.length-1 ; x >=0 ; x--) {
            System.out.print(groceryItems[x]+", ");
        }
        System.out.println("");
        System.out.println("==========================");

//        1.3 find out the index location of strawberry

        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].equalsIgnoreCase("strawberry")){
                System.out.println("The index of strawberry is " + i);
            }
        }
        System.out.println("==========================");

//        1.4 find out the count of groceries that contains berry in the name

        int berryCount=0;
        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].contains("berry")){
                ++berryCount;
            }
        }
        System.out.println("The count of berry is " + berryCount);
        System.out.println("==========================");

//        1.5 print out all the character counts of the grocery items

        for (int i = 0; i <groceryItems.length ; i++) {
            System.out.println("The character count of " + groceryItems[i] + " is " + groceryItems[i].length());
        }
        System.out.println("==========================");

//        1.6 print out only those items with even character count

        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].length()%2==1){
                continue;
            }
            System.out.println(groceryItems[i] + " ");
        }
        System.out.println("==========================");

//        1.7 print out only those items end with letter e

        for (int i = 0; i <groceryItems.length ; i++) {
            if(!groceryItems[i].endsWith("e")){
                continue;
            }
            System.out.println("The item/s ends with letter 'e' is/are "+groceryItems[i]);
        }
        System.out.println("==========================");

//        1.8 print out only last 3 characters of all the items

        for (int i = 0; i <groceryItems.length ; i++) {
            System.out.println("Last 3 characters of item "+groceryItems[i]+ " is: "+groceryItems[i].substring(groceryItems[i].length()-3));
        }
        System.out.println("==========================");

//        1.9 create String variable called allItems and store all the items inside array separated by comma.

        String allItems="";
        for (int i = 0; i <groceryItems.length ; i++) {
            allItems+=groceryItems[i];
            if(groceryItems[i]!=groceryItems[groceryItems.length-1]){
                allItems+=" , ";
            }
        }
        System.out.println(allItems);
        System.out.println("==========================");

//        2, loop through each prices  and print them in one line

        for (int i = 0; i <storePrices.length ; i++) {
            System.out.print(storePrices[i]);
            if (storePrices[i]!=storePrices[storePrices.length-1]){
                System.out.print(" , ");
            }
        }
        System.out.println();
        System.out.println("==========================");

//        2.1 print each prices in even index

        for (int i = 0; i <storePrices.length ; i++) {
            if(i%2==0){
                System.out.print(storePrices[i]);
                if (storePrices[i]==storePrices[storePrices.length-1] || storePrices[i]==storePrices[storePrices.length-2]){

                }
                else {
                    System.out.print(" , ");
                }
            }
        }
        System.out.println();
        System.out.println("==========================");

//        2.2 print only prices less that 3 dollars

        for (int i = 0; i <storePrices.length ; i++) {
            if(storePrices[i]<=3){
                System.out.print(storePrices[i]+" , ");
            }
        }
        System.out.println();
        System.out.println("==========================");

//        2.3 print the sum of all the prices and get average

        float sumPrice = 0f;
        for (int i = 0; i <storePrices.length ; i++) {
            sumPrice+=storePrices[i];
        }
        System.out.println("The sum of all the prices are : "+(float)(sumPrice));
        System.out.println("The average price is : "+(float)(sumPrice/storePrices.length-1));
        System.out.println("==========================");

//        2.4 print only the second half of prices (last 3)

        for (int i = 0; i <storePrices.length ; i++) {
            if(i<storePrices.length/2){
                continue;
            }
            System.out.println("The second half of store prices are : "+storePrices[i]+" ");
        }
        System.out.println("==========================");

//        2.5 print the sum of the middle two prices

        float sumOfMiddleTwo = 0f;
        for (int i = 0; i <storePrices.length ; i++) {
            sumOfMiddleTwo = storePrices[(storePrices.length/2)-1] + storePrices[(storePrices.length/2)];
        }
        System.out.println("The sum of the middle two prices is : "+sumOfMiddleTwo);
        System.out.println("==========================");

//        2.6 print only prices more than average price

        for (int i = 0; i <storePrices.length ; i++) {
            if(storePrices[i]>=(sumPrice/storePrices.length-1)){
                System.out.println(storePrices[i]);
            }
        }
        System.out.println("==========================");

//        2.7 find out max price and print out max price and  index of max price

        float max = storePrices[0];
        int index = 0;
        for (int i = 0; i <storePrices.length ; i++) {
            if (max<storePrices[i]){
                max=storePrices[i];
                index = i;
            }
        }
        System.out.println("The max price is "+max+" and index of max price is "+index);
        System.out.println("==========================");

//        2.8 find out the minimum price and index of minimum price

        float min = storePrices[0];
        int indexMin = 0;
        for (int i = 0; i <storePrices.length ; i++) {
            if (min>storePrices[i]){
                min=storePrices[i];
                indexMin = i;
            }
        }
        System.out.println("The min price is "+min+" and index of min price is "+indexMin);
        System.out.println("==========================");

//        2.9 find out second max price and index

        float secondMax = storePrices[0];
        for (float eachPrice : storePrices) {
            if(eachPrice>secondMax && max>eachPrice){
                secondMax=eachPrice;
            }
        }
        System.out.println("The second max price is : "+secondMax);
        System.out.println("==========================");

//        3, assume that the order of grocery Items match the prices in same order do below:

//        3.1 print first item and first price in one print statement -->>  apple price is 1.99

        System.out.println(groceryItems[0]+" price is "+storePrices[0]);
        System.out.println("==========================");

//        3.2 print last item and last price in one print statement-->>  kiwi price is 2.88

        System.out.println(groceryItems[groceryItems.length-1]+" price is "+storePrices[storePrices.length-1]);
        System.out.println("==========================");

//        3.2 print all items and prices in one for loop together

        for (int i = 0; i < groceryItems.length; i++) {
            System.out.println(groceryItems[i]+" price is "+storePrices[i]);
        }
        System.out.println("==========================");

//        3.3 print only those items with price more than 3.11

        for (int i = 0; i < groceryItems.length; i++) {
            if ((storePrices[i]) > 3.11) {
                System.out.println(groceryItems[i] + " price is " + storePrices[i]);
            }
        }
        System.out.println("==========================");

//        3.4 print only those items with price more than average

        float sum = 0;
        for (int i = 0; i < groceryItems.length; i++) {
            sum += storePrices[i];
        }
        for (int i = 0; i < groceryItems.length; i++) {
            if ((storePrices[i]) > (sum/groceryItems.length-1)) {
                System.out.println(groceryItems[i] + " price is " + storePrices[i]);
            }
        }
        System.out.println("==========================");

//        3.5 print only those prices of grocery items that contains letter b

        for (int i = 0; i < groceryItems.length; i++) {
            if(groceryItems[i].startsWith("b")){
                System.out.println(groceryItems[i] + " price is " + storePrices[i]);
            }
        }
        System.out.println("==========================");

//        3.6 print the item name with max price

        String mostExpensive = "";
        float maxPrice = storePrices[0];
        for (int i = 0; i < groceryItems.length ; i++) {
            if (storePrices[i]>maxPrice){
                maxPrice = storePrices[i];
                mostExpensive = groceryItems[i];
            }
        }
        System.out.println("The most expensive item is: "+mostExpensive);
        System.out.println("==========================");

//        3.7 print the item name with min price

        String leastExpensive = "";
        float minPrice = storePrices[0];
        for (int i = 0; i < groceryItems.length ; i++) {
            if (storePrices[i]<minPrice){
                minPrice = storePrices[i];
                leastExpensive = groceryItems[i];
            }
        }
        System.out.println("The least expensive item is: "+leastExpensive);
        System.out.println("==========================");

//        4 , Below tasks will modify array :  (for each loop should not be used, try and see why)

//        4.1 swap the value of first item in array with last item of array , swap apple with kiwi

        String[] groceryItemsCopy = new String[6];
        String temp = "";
        for (int i = 0; i < groceryItems.length ; i++) {
            groceryItemsCopy[i] = groceryItems[i];
        }
        temp = groceryItemsCopy[0];
        groceryItemsCopy[0] = groceryItemsCopy[groceryItems.length-1];
        groceryItemsCopy[groceryItems.length-1] = temp;
        System.out.println(Arrays.toString(groceryItemsCopy));
        System.out.println("==========================");

//        4.2 use for loop to loop through your groceryItems array and modify your items like this :
//        itemValue+itemCharacterCount
//        For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}

        for (int i = 0; i < groceryItems.length ; i++) {
            groceryItems[i] += groceryItems[i].length();
        }
        System.out.println(Arrays.toString(groceryItems));
        System.out.println("==========================");

//        4.3 increase the value of each prices by one  in prices array

        float[] storePricesCopy = new float[6];
        for (int i = 0; i < storePrices.length ; i++) {
            storePricesCopy[i] = storePrices[i];
        }
        for (int i = 0; i < storePrices.length ; i++) {
            storePricesCopy[i]++;
        }
        System.out.println(Arrays.toString(storePricesCopy));
        System.out.println("==========================");

//        4.4 double the value of each prices in your array 1.99-->> 1.99*2

        float[] storePricesCopy2 = new float[6];
        for (int i = 0; i < storePrices.length ; i++) {
            storePricesCopy2[i] = storePrices[i];
        }

        for (int i = 0; i < storePrices.length ; i++) {
            storePricesCopy2[i]*=2;
        }
        System.out.println(Arrays.toString(storePricesCopy2));
        System.out.println("==========================");

//        4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3

        for (int i = 0; i < storePrices.length ; i++) {
            if(storePrices[i]<=2.0){
                storePrices[i]*=3;
            }
        }
        System.out.println(Arrays.toString(storePrices));
        System.out.println("==========================");

//        4.6 now find out highest price after the modification

        float maxModify = storePrices[2];
        String maxPricedItem = "";
        for (int i = 0; i < storePrices.length ; i++) {
            if(storePrices[i]>maxModify){
                maxModify = storePrices[i];
                maxPricedItem = groceryItems[i];
            }
        }
        System.out.println(maxModify);
        System.out.println("==========================");

//        4.7 find out the most expensive item name. (edited)

        System.out.println("The most expensive item name after modification is : "+maxPricedItem);
        System.out.println("==========================");
    }
}
