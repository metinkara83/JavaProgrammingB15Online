package day62;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.add("Florida");
        states.add("Georgia");
        states.add("South Carolina");
        states.add("Alabama");
        states.add("Texas");
        states.add("Virginia");
        states.add("Georgia");
        states.add("Georgia");
        states.add("Alabama");
        states.add("Texas");
        states.add("Virginia");
        states.add("Florida");

        System.out.println("states before deleting " + states);
        // The lambda expression way of removing
        states.removeIf(each -> each.startsWith("A"));
        System.out.println("states after = " + states);

        // remove all the states with letter A
//        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection
//        while (stIter.hasNext()){
//            String each = stIter.next();
//            if (each.startsWith("A")){
//                System.out.println("removing = "+each);
//                stIter.remove();
//            }
//        }
//        System.out.println("states after deleting "+states);
//
//        System.out.println("stIter.hasNext() = " + stIter.hasNext());
        // IF YOU TRY TO GET THE NEXT ITEM THAT YOU DO NOT HAVE USING ITERATOR
        // YOU WILL GET NoSuchElementException
//        System.out.println("stIter.next() = " + stIter.next());
    }
}
