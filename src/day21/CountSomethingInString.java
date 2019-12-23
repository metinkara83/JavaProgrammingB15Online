package day21;

public class CountSomethingInString {

    public static void main(String[] args) {

        String myName = "Amelia Hajitev Mammadov Amelia Mehmet";
        int charCount = myName.length();
        System.out.println("charCount = "+charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);
        int counter = 0;

        // Find out the count of all the word lia in cases insensitive manner
        // I will go through each and every letter of the String by 3 characters
        // while I am going through each and every 3 characters
        // I will check whether current string I am looking at equals to <lia> in case insensitive
        // if yes I will add 1 to my counter
        // if not -->> just move on
        // perform this action until I reach last character

        for (int x=0 ; x<=lastCharIndex-2 ; x++) {
            if (myName.substring(x, x + 3).equalsIgnoreCase("lia")) {
                ++counter;
            }
        }
        System.out.println("The count of 'lia' is: " + counter);
    }
}