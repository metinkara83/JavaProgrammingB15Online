package day14;

public class LastIndexOfJava {

    public static void main(String[] args) {

        String name = "Game of Java"; // length is 12, last char index is 11

        // find out the last location of the letter "a" shows up
        System.out.println(name.lastIndexOf("a"));
        // find out the last location of the character space shows up
        System.out.println(name.lastIndexOf(" "));
        // find out the last location of the letter "Ga" shows up
        System.out.println(name.lastIndexOf("Ga"));
        // find out the last location of the letter "Kawa" shows up
        System.out.println(name.lastIndexOf("Kawa"));

        // if i do not use contains method, what would be my condition to check
        // whether we have Kawa in this string, either using indexOf or lastIndex
        if (name.indexOf("Kawa") > -1) {
            System.out.println("Kawa Found");
        }
        else {
            System.out.println("No Kawa - No Pumpkin");
        }

    }
}
