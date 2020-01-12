package selfPracticeTests;

public class Replit210 {

    public static void main(String[] args) {

        String result = reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true

        String result2 = reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true

        String result3 = reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false
    }

    public static String reverseLetters(String word){
        String result = "";
        String letter = "";
        String reverse = "";
        for (int a = 0 ; a < word.length() ; a++){
            if (Character.isLetter(word.charAt(a))){
                letter += word.charAt(a)+"";
            }
        }

        for (int b = letter.length()-1 ; b >= 0 ; b--){
            reverse += letter.charAt(b)+"";
        }

        for (int i = 0, x = 0 ; i < word.length(); i++){
            if (!Character.isLetter(word.charAt(i))){
                result += word.charAt(i);
            }
            else {
                result += reverse.charAt(x);
                x++;
            }
        }
        return result;
    }
}
