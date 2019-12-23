package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String myName = "Hasan Mammadov mammadov";
        int charCount = myName.length();
        System.out.println("charCount = "+charCount);
        int lastCharIndex = charCount-1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        // Find out index of all the letter 'a' in cases insensitive manner
        // I will go through each and every letter of the String --->>> for loop
        // while I am going through each and every character
        // I will check whether current character I am looking at equals to 'a' or 'A'
        // if yes I will print the index of
        // if not -->> just move on
        // perform this action until I reach last character

        for (int x=0 ; x<=lastCharIndex ; x++) {
            if (myName.substring(x, x + 1).equalsIgnoreCase("a")) {
                System.out.println("The index of an 'a' is: " + myName.indexOf("a", x));
            }
        }
        for (int y = 0; y <= lastCharIndex - 1; y++) {
            if (myName.substring(y, y + 2).equalsIgnoreCase("an")) {
                System.out.println("The index of an 'an' is: " + myName.indexOf("an", y)); // you can use ONLY the variable
                }
            }
        for (int z = 0; z <= lastCharIndex - 2; z++) {
            if (myName.substring(z, z + 3).equalsIgnoreCase("mam")) {
                System.out.println("The index of a 'mam' is: " + z);
            }
        }
    }
}