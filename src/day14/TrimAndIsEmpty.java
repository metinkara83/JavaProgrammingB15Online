package day14;

public class TrimAndIsEmpty {

    public static void main(String[] args) {

        String message = "    REPL IS COMING !  ";

        System.out.println("message character count is "+message.length());
        // trim method is ised to take out spaces on two sides, NOT IN BETWEEN!!!
        System.out.println(message.trim());

        message = message.trim();
        System.out.println(message);
        System.out.println("trimmed message character count is "+message.length());

        System.out.println(message.isEmpty());


    }
}
