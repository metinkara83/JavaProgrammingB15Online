package selfPracticeTests;
import java.util.Scanner;

public class StringTask_16_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 16:
//        Enter user to ask two words
//        and store it into word1 word2 String variables
//        if word1 contains word2 ,
//                print the location of word2 in word1
//        for example ABCDE , BC  -->> BC is at index 1 in word1
//        then replace word2 part of word1 with ZZZ
//        for example ABCDE , BC  -->> AZZZDE
//
//        if word2 exists in word1 , replace word1 with ZZZ
//        for example BC , ABCDE    -->> AZZZDE
        System.out.println("Please enter your first word:");
        String word1 = scan.next();
        System.out.println("Please enter your second word:");
        String word2 = scan.next();
        if (word1.contains(word2)) {
            System.out.println(word1.indexOf(word2));
            word1 = word1.replace(word2, "ZZZ");
            System.out.println("The new word 1 is: "+word1);
        }
        else {
            System.out.println("The new word 1 is: "+word1);
        }
    }
}
