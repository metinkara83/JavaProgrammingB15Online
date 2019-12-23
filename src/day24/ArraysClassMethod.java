package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

        // Arrays class is a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString --->> Arrays.toString(yourArrayHere)
        // this method will give you string representation of any type of array
        // the result will look --->> [item1, item2, ... , lastItem]

        String[] superHeroes = {"Superman" , "Batman" , "Wonder Woman" , "Aquaman" , "Cyborg" , "Flash"};
        System.out.println(Arrays.toString(superHeroes));
        // saving the String result into a variable and print
        String superHeroesAsString = Arrays.toString(superHeroes);
        System.out.println(superHeroesAsString);
        // how do we get first character of superHeroesAsString variable
        System.out.println(superHeroesAsString.charAt(0));

        int[] numbers = {10 , 44 , 55 , 3 , 78};
        System.out.println(Arrays.toString(numbers));

        // create a double array of 3 items ; and put 3 value
        // get a string representation out of this array and save it as priceString
        // print each and every character in this String in this format
        // character at index 1 is : yourCharacterHere
        // character at index 2 is : yourCharacterHere and so on all the way till last
        double[] prices = {10.99d , 21.99d , 17.99d};
        String priceString = Arrays.toString(prices);
        for (int x = 0; x < priceString.length(); x++) {
            System.out.print(priceString.charAt(x)+"");
        }
        System.out.println();
        System.out.println("------------------------");
        for (int x = 0; x < priceString.length(); x++) {
            System.out.println("Character at Index "+x+" is: "+priceString.charAt(x));
        }

        // THE SOLE PURPOSE OF Arrays.toString(yourArray) is TO SEE WHAT IS INSIDE

        // for sorting an array in ascending order
        // sort --->> Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals --->> Arrays.equals(firstArray, secondArray)
    }
}
