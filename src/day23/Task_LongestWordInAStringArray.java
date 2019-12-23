package day23;

public class Task_LongestWordInAStringArray {

    public static void main(String[] args) {

//        With the max example in mind, now Find the longest word in a string array
//        Write down your plain English logic.

        String[] shows = {"Orville", "Gifted", "Game of Thrones", "Flash", "Arrow", "Super Girl"};
        String longWord = shows[0];
        int longest = shows[0].length();
        for (int x = 0; x < shows.length ; x++) {
            if (longest < shows[x].length()) {
                longest = shows[x].length();
                longWord = shows[x];
            }
        }
        System.out.println("The longest word in a string array is: "+longWord);
    }
}
