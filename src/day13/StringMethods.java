package day13;

public class StringMethods {

    public static void main(String[] args) {

        // String actions that we already know so far;
        // equals , equalsIgnoreCase
        String s1 = "HEllo";
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String name = "Metin";
        System.out.println("My name is "+name.toUpperCase());
        System.out.println("My name is "+name.toLowerCase());

        //In order to get how many character we have inside the String, we can use .length method of String
        System.out.println(name.length());
        int lengthOfStr = s1.length();
        if(lengthOfStr>4){
            System.out.println("More than 4 character");
        }
        else{
            System.out.println("Not more than 4 character");
        }

    }
}
