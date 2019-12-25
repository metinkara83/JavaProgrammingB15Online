package day33;

public class ReturnKeywordPractice {

    public static void main(String[] args) {

        int[] birthYear = {1999,122,2019,1987,1978,1964,3999,2004};
        for (int i = 0; i < birthYear.length ; i++) {
            System.out.println(calculateAndReturnAge(birthYear[i]));
        }

    }

    public static int calculateAndReturnAge (int birthYear) {
        int age = 0;
        if (birthYear>1900 && birthYear<2020){
            age = 2019 - birthYear;
        }
        return age;
    }
}
