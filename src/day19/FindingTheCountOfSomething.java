package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        // print out the numbers that can be divided by 15 without remainder

        // from 1-100 count how many numbers can be divided by 15
        int count = 0;

        for (int i=1 ; i<=100 ; i++) {
            if (i%15==0) {
                System.out.print(i + " ");
                count++;
            } else {
            }
        }
        System.out.println("\nThe count of numbers can be divided by 15 are: "+count);

        int countOfA = 0;
        String name = "Esra Fidan";
        for (int x = 0 ; x <name.length() ; x++){
            System.out.println(name.charAt(x));
            if (name.charAt(x) == 'a') {
                System.out.println("Bingo!!!");
                ++countOfA;
            }
        }
        System.out.println("count of a: "+countOfA);
    }
}
