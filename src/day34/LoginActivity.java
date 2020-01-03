package day34;

public class LoginActivity {

    public static void main(String[] args) {

        // Create 2 login methods
        // 1. login1 : static void method
        // it has 2 String username and password as method parameters
        // (it accepts 2 String object as argument when being called)
        // it checks whether username and password "user" and "abc123"
        // if yes , print login successful
        // if not , print login failed (Optionally find exactly why failed)

        // 2. login2 : static method boolean return type
        // it has 2 String username and password as method parameters
        // (it accepts 2 String object as argument when being called)
        // it checks whether username and password "user" and "abc123"
        // if yes , return true
        // if not , return false

        login1("user", "abc123");
        login1("metin", "abc123");
        login1("user","abcd12");
        login1("abc1","user");

        boolean result1 = login2("user", "abc123");
        boolean result2 = login2("metin", "abc123");
        boolean result3 = login2("user","abcd12");
        System.out.println("login2true = " + result1);
        System.out.println("login2testfalseusername = " + result2);
        System.out.println("login2testfalsepassword = " + result3);

        if (login2("user","abc123")){
            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View the order");
        }
        else {
            System.out.println("No shopping unless you signed in");
        }

    }

    public static void login1 (String username, String password){
        String correctUsername = "user";
        String correctPassword = "abc123";
        if (username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Login successful");
        }
        else {
            if (username.equals(correctUsername) && !password.equals(correctPassword)){
                System.out.println("Login failed! You entered wrong password");
            }
            else if (!username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login failed! You entered wrong username");
            }
            else {
                System.out.println("Login failed");
            }

        }
    }

    public static boolean login2 (String username, String password){
        String correctUsername = "user";
        String correctPassword = "abc123";
        return (username.equals(correctUsername) && password.equals(correctPassword));
    }
}
