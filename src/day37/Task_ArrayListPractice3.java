package day37;

import java.util.ArrayList;

public class Task_ArrayListPractice3 {

    public static void main(String[] args) {

//        Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
//                * print pass if its more than 60 fail if not
//                * count how many score are more than 90
//                * get the average score
//                * update the values with score-grade pair
//                      for example
//                      79C , 54F, 100A, 65D, 44F , 89B , 95A
//        Optionally create 4 methods according to above criteria
        ArrayList<String> scores = new ArrayList<>();
        scores.add("79");
        scores.add("54");
        scores.add("100");
        scores.add("65");
        scores.add("44");
        scores.add("61");
        scores.add("89");
        scores.add("13");
        scores.add("98");
        scores.add("91");
        System.out.println("The scores are : "+scores);
        System.out.println("=============================================================");
        System.out.println("The pass or fail results are : "+passFail(scores));
        System.out.println("=============================================================");
        System.out.println("The number of scores that are more than 90 are : "+moreThan90(scores));
        System.out.println("=============================================================");
        System.out.println("The average of scores is : "+averageCalculator(scores));
        System.out.println("=============================================================");
        System.out.println("The scores paired with grades are : "+scoreGradePair(scores));
    }

    public static ArrayList<String> passFail (ArrayList<String> grade){
        ArrayList<String> passFail = new ArrayList<>();
        int score = 0;
        String each = "";
        for (int i = 0; i < grade.size() ; i++) {
            each = grade.get(i);
            score = Integer.parseInt(each);
            if (score > 60){
                passFail.add("Passed");
            }
            else {
                passFail.add("Failed");;
            }
        }
        return passFail;
    }

    public static int moreThan90 (ArrayList<String> point){
        int count = 0;
        String each = "";
        for (int i = 0; i < point.size() ; i++) {
            each = point.get(i);
            int score = Integer.parseInt(each);
            if (score > 90){
                ++count;
            }
        }
        return count;
    }

    public static int averageCalculator (ArrayList<String> result){
        String each = "";
        int sum = 0;
        for (int i = 0; i < result.size() ; i++) {
            each = result.get(i);
            int score = Integer.parseInt(each);
            sum += score;
        }
        int average = sum / result.size();
        return average;
    }

    public static ArrayList<String> scoreGradePair (ArrayList<String> grade){
        String each = "";
        String gradePair = "";
        for (int i = 0; i < grade.size(); i++) {
            each = grade.get(i);
            int score = Integer.parseInt(each);
            if (score < 60){
                gradePair = "F";
            }
            else if (score >=60 && score < 70){
                gradePair = "D";
            }
            else if (score >=70 && score < 80){
                gradePair = "C";
            }
            else if (score >=80 && score < 90){
                gradePair = "B";
            }
            else {
                gradePair = "A";
            }
            grade.set(i, each+gradePair);
        }
        return grade;
    }
}
