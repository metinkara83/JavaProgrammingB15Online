package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        /**
         * Create an ArrayList of Integer and fill it up with 1-100
         */
        
        ArrayList<Integer> oneToHundred = new ArrayList<>();
        for (int i = 1; i <= 100  ; i++) {
            oneToHundred.add(i);
        }
        System.out.println("Each number is = " + oneToHundred);

        // change all the odd number value to 0
        for (int i = 0; i < oneToHundred.size() ; i++) {
            if (oneToHundred.get(i)%2==1){
                oneToHundred.set(i,0);
            }
        }
        System.out.println("Each odd number is converted to \"0\" = " + oneToHundred);

        // How to find index value of 20
        System.out.println("The index number of value 20 = " + oneToHundred.indexOf(20));

        // Insert 100 to first index
        oneToHundred.add(0,100);
        System.out.println("oneToHundred with first item 100 = " + oneToHundred);

        // How to find index value of 20
        System.out.println("The index number of value 20 = " + oneToHundred.indexOf(20));

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        // insert 100 right after value of 34, we do not know where 34 is...
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("Inserting 100 after the value of 34 = " + lst2);

        // add five 100 in front of 44
        for (int i = 1; i <=5  ; i++) {
            lst2.add(lst2.indexOf(44),100);
        }
        System.out.println("Adding Five 100 in front of 44 = " + lst2);
    }
}
