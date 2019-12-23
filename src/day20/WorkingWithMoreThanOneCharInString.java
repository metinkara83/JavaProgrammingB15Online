package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line
        // for example : Gokyuzum
        /* Go
           ky
           uz
           um
         */

        String word = "Gokyuzum";
        for (int i=0 ; i<=word.length()-1 ; i+=2) {
            System.out.println(word.substring(i,i+2));
        }

    }
}
