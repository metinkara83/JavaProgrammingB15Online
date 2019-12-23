package day15;

public class NameChecker {

    public static void main(String[] args) {

        // Task 1:
        // NameChecker
        // Declare a variable to store your name
        // Check whether your name length is less than 4
        // if so print "Short Name", if it is within 5-10 print "Medium Name", if it is more than 11 print "Longer Name"

        String name = "Metin";
        int nameChecker = name.length();
        if (nameChecker<=4){
            System.out.println("Short Name");
        }
        else if (nameChecker>=5 && nameChecker<=10) {
            System.out.println("Medium Name");
        }
        else {
            System.out.println("Longer Name");
        }

        // Check whether your name has either character "a" or "e"
        // if so -->> name contains a or e
        // if not -->> I do not have both a or e in my name

        if (name.contains("a") || name.contains("e")){
            System.out.println("Your name contains 'a' or 'e'.");
        }
        else {
            System.out.println("Your name does not contain either 'a' or 'e'");
        }

        // Print your name in the reverse order

        System.out.println(name.charAt(4)+" "+name.charAt(3)+" "+name.charAt(2)+" "+name.charAt(1)+" "+name.charAt(0));

    }
}
