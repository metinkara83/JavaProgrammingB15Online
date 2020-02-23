package day63;

import java.util.HashSet;
import java.util.Set;

public class FindingUnique {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // How many unique character showed up in above sentence

        // ONE WAY TO DO IT
        // first find a data structure that automatically remove duplicate (create a HashSet object with type Character)
        // iterate over each character in above String
        // then add it to the object (HashSet) so it can remove the duplicate for us

        Set<Character> charSet = new HashSet<>();
        for (int i = 0 ; i < str.length() ; i++){
            charSet.add(str.charAt(i));
        }
        System.out.println("How many character overall? = " + str.length());
        System.out.println("How many unique characters? = " + charSet.size());
        System.out.println("charSet = " + charSet);

//        char[] abc = str.toCharArray();
//        List<Character> charsArray = new ArrayList<>(Arrays.asList(abc));
    }
}
