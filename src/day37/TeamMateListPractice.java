package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMateListPractice {

    public static void main(String[] args) {
        
        List<String> teamMates = new ArrayList<>();
        
        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");

        System.out.println("teamMates = " + teamMates);

        // first item and last item
        System.out.println("First Item = " + teamMates.get(0));
        System.out.println("Last Item = " + teamMates.get(teamMates.size()-1));

        // print one by one
        System.out.println("\nAll Items:");
        for (int x = 0 ; x < teamMates.size() ; x++){
            System.out.println("Item "+(x+1)+" = " + teamMates.get(x));
        }

        // print from the reverse
        System.out.println("\nAll Items in Reverse Order");
        for (int i = teamMates.size()-1 ; i >=0 ; i--) {
            System.out.println("Item "+(i+1)+" = " + teamMates.get(i));
        }

        // print 2 items at a time
        System.out.println("\nPrinting 2 items at a time");
        for (int i = 0; i < teamMates.size()-1 ; i++) {
            System.out.println(teamMates.get(i)+" "+teamMates.get(i+1));
        }

        // Challenge : Pair them up by 3
        System.out.println("\nPrinting 3 items at a time");
        for (int i = 0; i < teamMates.size()-2 ; i++) {
            System.out.println(teamMates.get(i)+"--"+teamMates.get(i+1)+"--"+teamMates.get(i+2));
        }
        
        // concat everyone in one string seperated by -
        System.out.println("\nConcatenation");
        String result = "";
        for (int i = 0; i < teamMates.size() ; i++) {
            result+=teamMates.get(i);
            if (i!=teamMates.size()-1){
                result+="-";
            }
        }
        System.out.println("result = " + result);
        
        // How can we turn a List into a String and store it ?? and manipulate it
        String lstToString = teamMates.toString();
        System.out.println("lstToString = " + lstToString);
        System.out.println("lstToString.replaceMethod = " + lstToString.replace(", ", "-")
        .replace("[","").replace("]",""));


    }
}
