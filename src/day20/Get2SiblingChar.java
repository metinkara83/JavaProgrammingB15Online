package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line as below example
        // for example : Arya
        /* Ar
           ry
           ya
         */
        String word = "Arya";
        for (int i=0 ; i<=word.length()-2 ; i++) {
            System.out.println(word.substring(i,i+2));
        }

        String name = "Alexander";
        for (int i=0 ; i<=name.length()-3 ; i++) {
            System.out.println(name.substring(i,i+3));
        }
    }
}
