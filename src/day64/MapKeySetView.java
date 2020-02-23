package day64;

import java.util.*;

public class MapKeySetView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // Map view:
            // keySet view, values view, entrySet view
        // How do I store all the keys into collection??
            // What do you think the data type will be to store such collection?
            // --- Set because keys are unique

        // we can use keySet() method of Map to get Set of keys
        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);
        allNames.remove("Tomato");
        System.out.println("allNames no tomato = " + allNames);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // WHAT IF WE DO NOT WANT SUCH RELATIONSHIP AND WE JUST WANT TO USE THE KEYS SOMEWHERE ELSE ?
        // GET A COPY OF THE SET into different Object
        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
