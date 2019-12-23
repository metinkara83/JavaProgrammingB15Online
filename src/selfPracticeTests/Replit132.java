package selfPracticeTests;

import java.util.Scanner;

public class Replit132 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        float sum = 0;
        for (int i = 0 ; i < 7 ; i++){
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i] = input.nextFloat();
        }

        float max = score[0];
        float min = score[0];

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();

        for (int x = 0 ; x < 7 ; x++){
            if (max < score[x]){
                max = score[x];
            }
        }
        for (int y = 0 ; y < 7 ; y++){
            if (min > score[y]){
                min = score[y];
            }
        }
        for (int z = 0 ; z < 7 ; z++){
            sum += score[z];
        }
        double total = (sum-(max+min)) * (difficulty * 0.6);

        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}
