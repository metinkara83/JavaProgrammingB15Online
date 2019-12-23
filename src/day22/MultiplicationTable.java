package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Generate Multiplication Table from 1 to 12

        for (int i = 1 ; i<=12 ; i++) {
            for (int x = 1; x <=12 ; x++) {
                System.out.println(i+" x "+x+ " = "+ x*i);

            }
        }
    }
}
