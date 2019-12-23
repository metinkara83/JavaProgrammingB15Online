package day16;

public class SecondWordGetter {

    public static void main(String[] args) {

        // Given a sentence with 3 words, get the second word
        // Steps:
        // Second word is between first space and last space

        // getting location of space remind me indexOf
        // getting string inside another string by beginning and ending index
        // remind me of substring

        String sentence = "Hang Out Time";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(firstSpaceIndex+1,lastSpaceIndex));
    }
}
