package day62;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {

        // Creating a HashSet with items already inside
        // REMEMBER : In HashSet THERE IS NO DEFINED ORDER !!!!!!!!!
        // YOUR OUTPUT CAN BE IN ANY ORDER JAVA DESIRE

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);

        Set<Integer> myNums = new HashSet<>(numList);

        System.out.println("myNums = " + myNums);

        // Create a Set of String called states
        // add bunch of states with some duplicates
        // iterate over them using each and every way you know

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

        // any type of collection has size method to count the item
        System.out.println("How many states are there in the list? "+states.size());

        System.out.println("states = " + states);

        for (String each : states) {
            System.out.println("each = " + each);
        }
        
        // FOR LOOP DOES NOT WORK BECAUSE THERE IS NO INDEX !!!!
        // AS THERE IS NO INDEX, SORTING IS NOT POSSIBLE !!!
        // We can use iterator for any type of collection at all time
        // ITERATION METHODS : Usind Iterator, Using For Each Loop, Using Lambda
        
        // creating iterator
        Iterator<String> stIter = states.iterator();
        while (stIter.hasNext()){
            System.out.println("stIter.next() = " + stIter.next());
        }

        states.forEach(each -> System.out.println("each state = "+each));

    }
}
