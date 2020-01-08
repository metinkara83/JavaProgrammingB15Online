package day37;

import java.util.ArrayList;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurun");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");

        // Create a method that accept a list of String as argument
        // same thing as a method that has list of String parameter
        // and print out each and every item in the list vertically
        // return nothing

        printTheList(nameLst);

        String resultlongest = getLongest(nameLst);
        System.out.println("resultlongest = " + resultlongest);
    }

    public static String getLongest (ArrayList<String> nameLst){
        String longest = nameLst.get(0);

        for (int x = 0; x < nameLst.size() ; x++) {
            String currentName = nameLst.get(x);
            if (currentName.length()>longest.length()){
                longest = currentName;
            }
        }
        return longest;
    }

    public static void printTheList (ArrayList<String> lst){
        for (String each : lst) {
            System.out.println("each = " + each);
        }
    }
}
