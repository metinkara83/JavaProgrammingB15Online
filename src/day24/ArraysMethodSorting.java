package day24;

import java.util.Arrays; // DO NOT CALL YOUR OWN CLASS Arrays

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99 , 44 , 66 , 23 , 19, 55};
        System.out.println(Arrays.toString(scores));
        // for sorting an array in ascending order -- low to high
        // sort --->> Arrays.sort(yourArrayHere)
        Arrays.sort(scores);
        // SO WHAT HAPPENED TO MY ORIGINAL ORDER ??? GONE !!!
        // CAN I GET IT BACK??? NO !!!!!!!!!!!
        // THE ORIGINAL INDEX OF ITEMS HAS CHANGED !!!
        System.out.println(Arrays.toString((scores)));
        // first item value
        System.out.println("first item value is "+scores[0]);

        char[] nameChars = {'G','A','D','Z','C','A',' ','d','@','9'};
        System.out.println("nameChars = "+Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = "+Arrays.toString(nameChars));
        // the low to high order for character is decided by it's ascii table value
        // special characters comes first -->> numbers -->> uppercase -->> lowercase

        String[] superHeroes = {"Superwoman" , "Superman" , "Ar" , "Batman" ,"Barman" , "Wonder Woman" , "Aquaman" , "Cyborg" , "Flash"};
        System.out.println(Arrays.toString(superHeroes));
        // ONLY FIRST CHARACTER MATTER WHEN SORTING A STRING ARRAY
        Arrays.sort(superHeroes);
        System.out.println(Arrays.toString(superHeroes));

        // SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println(Arrays.toString(fiveSwitchOnOffs));
        // Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY !!!

        // Arrays.sort(arrObject) does not return a value that we can store

    }
}
