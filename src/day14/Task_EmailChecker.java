package day14;

public class Task_EmailChecker {

    public static void main(String[] args) {

        // Email checker
        // create a variable called email
        // check for below conditions
        // if it does not contain character @, say "Invalid Email"
        // if it contains space, say "Invalid Email"
        // if it ends with @gmail.com -->> gmail
        // if it ends with @yahoo.com -->> yahoo email
        // if it ends with @mail.ru -->> russian email

        String email = "metinkara@gtmail.com";
        if (!email.contains("@") || email.contains(" ")) {
            System.out.println("Invalid Email");
        }
        else if (email.endsWith("@gmail.com")) {
            System.out.println("You have Google Email account");
        }
        else if (email.endsWith("@yahoo.com")) {
            System.out.println("You have Yahoo Email account");
        }
        else if (email.endsWith("mail.ru")) {
            System.out.println("You have Russian Email account");
        }
        else {
            System.out.println("You do not have a registered Email account");
        }
    }
}
