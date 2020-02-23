package day62;
import java.util.*;

// primary difference between HashSet and LinkedHashSet is LinkedHashSet keep insertion order
// HashSet is always way faster since it has less responsibility
public class LinkedHashSetImplementation {

    public static void main(String[] args) {

        // If you want to keep insertion order( first come first serve )
        // and it also remove duplicates
        Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);

        System.out.println("myNums = " + myNums);
    }
}
