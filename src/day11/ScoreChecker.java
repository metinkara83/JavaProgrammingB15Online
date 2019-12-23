package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        int score=219;

        if (score <0 || score>100){
            System.out.println("Invalid Score!!!");
        }
        else if (score==100){
            System.out.println("Perfect Score");
        }
        else if (score>70 && score<100){
            System.out.println("You have passed!");
        }
        else if (score >40 && score <=70) {
            System.out.println("Little bit more study will let you pass");
        }
        else if (score >30 && score <=40) {
            System.out.println("Attend additional classes");
        }
        else if (score <20 ) {
            System.out.println("Come to my office");
        }
        else {
            System.out.println("You have failed!!!");
        }
    }
}
