package day22;
public class UniqueCharactersInString {
    public static void main(String[] args) {
        // Find Unique characters in a String :
        // aaaabbbbbcccaabbcd --->> abcd
        // One Logic :
        // create a String variable called uniques to store the unique characters , assign empty value
        // go through each and every character and check whether the current character is already in uniques variable (uniques.contains(currentChar) )
        // if not concatenate it to unique variable
        // get out of the loop when you are done with last character
        String sentence = "aaaaabbbbccccdddddaaakkkhhhffyyyaaabbbtttrrrwwwdsddggdhhgb";
        String uniques = "";
        String current = "";
        for (int x = 0; x <= sentence.length()-1 ; x++) {
            current = sentence.substring(x,x+1);
            if(!uniques.contains(current)){
                uniques +=current;
            }
        }
        System.out.println(uniques);
    }
}
