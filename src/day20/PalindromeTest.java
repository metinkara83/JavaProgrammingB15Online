package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        // if you reverse a String if it does not change
        // it means the String is palindrome

        // level, kayak, elle, madam, aziza

        String name = "nurses run";
        String reversedName = "";
        name=name.replace(" ","");
        for (int i = name.length()-1 ; i>=0 ; i--) {
              reversedName+=name.charAt(i);
        }
        System.out.println(reversedName);
        if (reversedName.equalsIgnoreCase(name)){
            System.out.println(name+" is palindrome.");
        }
        else {
            System.out.println(name+" is not palindrome.");
        }
    }
}
