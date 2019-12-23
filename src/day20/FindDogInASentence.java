package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        // given sentence, find out the location of the dog
        // our approach is going through sentence, 3 character at a time, we print out the index

        String msg = "I like dog, dogs are cute, dogs are friendly";
        int lastCharIndex = msg.length()-1;
        int countOfDogs = 0;
        for (int x = 0 ; x<=lastCharIndex-2 ; x++) {
            String current3chars = msg.substring(x, x+3);
            if (current3chars.equalsIgnoreCase("dog")){
                              ++countOfDogs;
            }
        }
        System.out.println(countOfDogs);
    }
}
