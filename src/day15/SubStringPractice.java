package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        // getting the part of the String out of another String

        String movie = "Lord Of The Ring";

        // I want to get the String <of> from this movie
        // Substring will return part of another String starting from beginning index until right before ending index
        String wordOf = movie.substring(5,7);
        System.out.println(wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println(wordThe);

        // Get from the second word till last word
        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length();
        System.out.println("second word till last :" +movie.substring(startingPoint,endingPoint));

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);

        // If you want to start from somewhere and just get the rest of the String
        // above method will work, however there is even better method
        // if you provide only one parameter to substring method, it will just start from that location and get till the end
        String secondToLast = movie.substring(5);
        System.out.println(secondToLast);

        // Turn -->> Lord Of The Ring -- to -->> Ring Of The Lord
        System.out.println(movie.substring(12,16)+movie.substring(4,12)+movie.substring(0,4));
        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);

        System.out.println(wordRing+wordOfThe+wordLord);
        // Turn -->> Lord Of The Ring -- to -->> Ring Of The Java Lord
        System.out.println(wordRing+wordOfThe+"Java "+wordLord);







    }
}
