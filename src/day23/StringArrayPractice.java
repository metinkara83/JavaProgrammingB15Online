package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        // we created array in short way just by opening up { }
        // we put them in different line since white space does not matter
        String[] shows = {"Orville", "Gifted", "Game of Thrones", "Flash", "Arrow", "Super Girl"};
        int showsCount = shows.length;
        System.out.println("Shows Count = "+showsCount);

        for (int x = 0; x < showsCount ; x++) {
            String currentShow = shows[x];
            System.out.println(currentShow+" has character count "+currentShow.length());
        }
    }
}
