package day63;

import java.util.*;

public class GroceryItems {

    public static void main(String[] args) {

        Map<String, Double> groceryLst = new HashMap<>();

        groceryLst.put("Tomato",2.99);
        groceryLst.put("Banana",0.59);
        groceryLst.put("Cucumber",1.50);
        groceryLst.put("Apple",3.49);
        groceryLst.put("Eggplant",0.99);
        groceryLst.put("Banana",0.79);
        groceryLst.put("Onion",0.79);
        groceryLst.put("Carrot",1.99);
        groceryLst.putIfAbsent("Apple",3.29);

        System.out.println(groceryLst);
        System.out.println("The price of third item which is Eggplant is : "+groceryLst.get("Eggplant"));

        groceryLst.replace("Apple",groceryLst.get("Apple")*2);
        System.out.println("groceryLst.get(\"Apple\") = " + groceryLst.get("Apple"));
        groceryLst.replace("Banana",groceryLst.get("Banana")*2);
        System.out.println("groceryLst.get(\"Banana\") = " + groceryLst.get("Banana"));

//        groceryLst.remove("Tomato");
//        System.out.println(groceryLst);

        if(groceryLst.containsKey("Tomato")){
            groceryLst.remove("Tomato");
            System.out.println("No more tomato");
        }
        System.out.println(groceryLst);



    }

}
