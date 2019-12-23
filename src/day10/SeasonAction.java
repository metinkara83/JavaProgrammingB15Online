package day10;

import java.util.Scanner;

public class SeasonAction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey what is the season?");
        String season = scan.next();
        switch (season) {
            case "Spring":
                System.out.println("Hike ! Easter, Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ, Holiday");
                break;
            case "Fall":
                System.out.println("Black Friday, Hiking, Harvest, Halloween");
                break;
            case "Winter":
                System.out.println("Skiing, Christmas, New Year, Snowboarding");
                break;
            default:
                System.out.println("Stay at home");
                break;

        }
    }
}
