package day14;

public class PasswordValidator {

    public static void main(String[] args) {

        // PASSWORD VALIDATOR

        String password="AbH74832$";

        // MINIMUM 8 , MAXIMUM 16 CHARACTERS
        boolean min8max16 = password.length() >=8 && password.length() <=16;

        // IT MUST CONTAIN _ OR $
        boolean mustContains_or$ = password.contains("_") || password.contains("$");

        // IT MUST NOT CONTAIN SPACE
        boolean notContainsSpace = !password.contains(" ");

        // IT MUST START WITH Ab
        boolean mustStartWithAb = password.startsWith("Ab");

        // if any of above conditions do not match, say INVALID PASSWORD
        // else say GOOD PASSWORD!
        if (min8max16 && mustContains_or$ && notContainsSpace && mustStartWithAb) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
