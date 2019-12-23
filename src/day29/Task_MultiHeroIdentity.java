package day29;
import java.util.Arrays;
public class Task_MultiHeroIdentity {

    public static void main(String[] args) {

        String[] heroes= {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachhero : heroes) {
            String stars = "";
            for (int i = 0; i < eachhero.split("-")[1].length() ; i++) {
                stars += "*";
            }
            System.out.println(eachhero);
            System.out.println(eachhero.replace(eachhero.split("-")[1],stars));
        }
    }
}
