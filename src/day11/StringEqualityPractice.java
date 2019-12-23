package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        // checking for String equality should be always done using equals method of the String

        // oneString.equals(anotherString) -->> true or false
        // equals method coming from String class
        // each and every String object you created will have this functionality

        // just comparing 2 String literal directly using equals method
        // This is something that you will rarely do
        // System.out.println("Java".equals("java"));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));
        // IntelliJ display original as helper, it is not part of your code
        // please ignore and keep typing. Do not type "original", just type your text

        String yourStr = new String("Java");

        System.out.println("is my string same as your string?");
        System.out.println(myStr.equals(yourStr));


    }
}
