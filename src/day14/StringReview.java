package day14;

public class StringReview {

    public static void main(String[] args) {

        String str = "I like Pumpkin";

        // System.out.println(str.equals("pumpkin"));

        // contains:
        // it checks whether a string exists in another string and return true or false result

        System.out.println("Does it contain Pumpkin?");
        System.out.println(str.contains("Pumpkin"));
                                    // true
        boolean gotPumpkin = str.contains("Pumpkin");
        // shortcut to print variable value in nice format; use soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith     endsWith
        // check whether a string start with another string
        // check whether a string ends with another string
        // and return true or false result
        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);

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
