package day21;

public class OrderOfBreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <=10 ; x++) {
            System.out.println(x);
            continue;
            // break;
            // this will not work, unreachable code!!!
            // System.out.println("HELLO");
        }
        System.out.println("THE END");
    }
}
