package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Alesya";

        // how would you store each and every character to a char array from above name
        // without using method we are about to learn

        char[] namesChars = new char[name.length()];
        
        // namesChars[0] = name.charAt(0);
        // namesChars[1] = name.charAt(1);
        
        // using for loop to fill up the array one by one
        for (int x = 0; x < namesChars.length ; x++) {
            // take each character of name and fill the char array values
            namesChars[x] = name.charAt(x);            
        }
        System.out.println("namesChars = " + Arrays.toString(namesChars));;

        char[] namesChars2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars2));;

        // pick up your own name and turn it into char array and use for each loop to loop over them
        // optionally count how many 'a' you have in your name

        String myName = "Metin Kara";
        int count = 0;
        char[] myNameChars = myName.toCharArray();
        for (char eachChar : myNameChars) {
            System.out.print(eachChar);
            if(eachChar == 'a'){
                ++count;
            }
        }
        System.out.println();
        System.out.println("myName contains "+count+" 'a' characters");

        // What if you want to sort all characters of your name in alphabetical order ???

        Arrays.sort(myNameChars);
        System.out.println("After sorting myNameChars = " + Arrays.toString(myNameChars));
    }
}
