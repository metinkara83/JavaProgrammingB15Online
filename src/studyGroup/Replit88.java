package WorkGroup;

import java.util.Scanner;

public class Replit88 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = scan.nextLine();
        int countOfCats = 0;
        int countOfDogs = 0;
        int a=0;
        int b=0;
        while(word.indexOf("cat",a)>-1){
            countOfCats++;
           a+=word.indexOf("cat")+1;
        }
        while(word.indexOf("dog",b)>-1){
            countOfDogs++;
            b+=word.indexOf("dog")+1;
        }
        if (countOfCats==countOfDogs){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
