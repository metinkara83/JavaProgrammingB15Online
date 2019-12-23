package day11;

public class StringEqualityPractice_Condition {

    public static void main(String[] args) {
        String myStr = "Java";
        String yourStr = new String("Java");

        // Create a program to check whether myString value is Java
        // if true ---->> Correct Word , if false ---->> Say Java
        if (myStr.equals("java")) {
            System.out.println("Correct Word");
        }
        else {
            System.out.println("Say Java");
        }

        // Create a program to check whether myStr value equal to yourStr value
        // if true ---->> Correct Word , if false ---->> Say Java
        if (myStr.equals(yourStr)) {
            System.out.println("Correct Word");
        }
        else {
            System.out.println("Say Java");
        }
    }
}
