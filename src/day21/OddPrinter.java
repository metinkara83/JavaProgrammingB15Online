package day21;

public class OddPrinter {

    public static void main(String[] args) {

        // count from 1 to 10 -->> print only odd numbers
        // repeat this 4 times
        for (int z = 1; z <=4 ; z++) {
            for (int a = 1; a <=10 ; a++) {
                if (a%2==0){
                    continue;
                }
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }
}


