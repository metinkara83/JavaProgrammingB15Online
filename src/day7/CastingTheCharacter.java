package day7;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);
        int letterInNumber = 'B';
        System.out.println(letterInNumber);
        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        char myFirstChar = (char)100;
        System.out.println(myFirstChar);

        //find out your number of each character in your first name
        int myFirst = 'm';
        int mySecond = 'e';
        int myThird = 't';
        int myFourth = 'i';
        int myFifth = 'n';
        System.out.println(myFirst + ", " + mySecond + ", " + myThird + ", " + myFourth + ", " + myFifth);

        char letterA = 'a';
        System.out.println(letterA+1);
        System.out.println(" " +letterA+1);


    }
}
