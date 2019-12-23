package selfPracticeTests;
import java.util.Scanner;

public class StringTask_14_11282019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Task 14:
//        Ask user to enter sentence with any number of words
//        For example I love Java Java Java Java
//        write a program to print last word
//        remove last word from the sentence
//        check weather remaining part still contains last word
//        for example :
//        1, I love Java Java Java Java  -->> Java
//        2, I love Java Java Java
//        3, I love Java Java Java still contains last word
        System.out.println("Please enter a sentence with any number of words:");
        String sent = scan.nextLine();
        String lastWord = sent.substring(sent.lastIndexOf(" ")+1);
        System.out.println("The last word is: "+lastWord);
        String updatedSent = sent.substring(0,sent.lastIndexOf(" "));
        System.out.println("The updated sentence is: "+updatedSent);
        if (updatedSent.contains(lastWord)) {
            System.out.println(updatedSent+" still contains "+lastWord);
        }
    }
}
