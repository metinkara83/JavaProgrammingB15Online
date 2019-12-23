package day22;

public class LoopControlStatementWithMain {

    public static void main(String[] args) {

        // Store the following sentence in a variable msg
        String msg = "I struggle with Java I like Java I love Java Everything is Awesome!";
        // loop through each and every letter
        // 1, print every other letter
        for (int x = 0; x < msg.length()-1 ; x++) {
            if (x%2==1){
                continue;
            }
            System.out.print(msg.charAt(x));
        }
        System.out.println();
        // 2, when you reach 'a' break the loop
        for (int y = 0; y < msg.length()-1 ; y++) {
 //           if (msg.charAt(y)=='a' || msg.charAt(y)=='A' ){
            if (msg.substring(y,y+1).equalsIgnoreCase("a")){
                break;
            }
            System.out.print(msg.substring(y,y+1));
        }
    }
}
