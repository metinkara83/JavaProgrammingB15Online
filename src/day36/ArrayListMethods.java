package day36;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        
        // Create an ArrayList Object of long and assign it to a variable
        ArrayList<Long> lst = new ArrayList<>();
        
        // C.R.U.D. Create, Read, Update, Delete
        // add item insert an item, read item, update the item, remove the item, check the location
        
        lst.add(12L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println("Counting items using lst.size() = " + lst.size());

        // Getting items inside ArrayList Object
        System.out.println("First item is : lst.get(0) = " + lst.get(0));

        // Task : Get the sum of above ArrayList Items
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        System.out.println("The sum of ArrayList is : "+sum);
        
        lst.add(2,125L);
        System.out.println("lst = " + lst);
        
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(null);
        lst2.add(null);
        System.out.println("lst2 = " + lst2);
        System.out.println(lst2.isEmpty());
    }
}
