package day12;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your season please!");
        String season=scan.next();

        if (season.equalsIgnoreCase("Spring")){
            System.out.println("Hiking");
        }
        else if (season.equalsIgnoreCase("Summer")){
            System.out.println("Pool");
        }
        else if (season.equalsIgnoreCase("Fall")){
            System.out.println("Pumpkin");
        }
        else if (season.equalsIgnoreCase("Winter")){
            System.out.println("Skiing");
        }
        else {
            System.out.println("No activity as not such a season");
        }
    }
}
