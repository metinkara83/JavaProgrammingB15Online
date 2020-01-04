package selfPracticeTests;

public class ReplitJava85 {

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(minVowels(arr));
        //should print "hi"

//            Complete the minVowels method so that given the array words,
//            it will return the word with the least number of vowels -
//            if there are two or more words with the same number of vowels, it should return the shortest word.
//
//            You may find it helpful to write a helper method called countVowels that uses an accumulator algorithm to count the vowels.
//
//            Included is a separate helper function that will tell you if something is a vowel or not.

    }

    public static String minVowels(String[] words) {
        String min = words[0];
        for (int i = 0; i < words.length; i++) {
            if (countVowels(words[0]) == countVowels(words[i]) && words[0].length() > words[i].length()) {
                min = words[i];
            }
            else if (countVowels(words[0]) > countVowels(words[i])){
                min = words[i];
            }
        }
            return min;
    }

        public static int countVowels (String s){
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (isVowel(s.charAt(i))) {
                    ++count;
                }
            }
            return count;
        }

        public static boolean isVowel ( char ch){
            return ch == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u';
        }
}
