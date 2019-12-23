package day21;

public class SkipAll5s {

    public static void main(String[] args) {

        for (int x = 1; x <=100 ; x++) {
            if ( x % 5 == 0 ){
                System.out.println("Skipping "+x);
                continue;
            }
            System.out.print(x+" ");
        }

        for (int y = 1; y <=100 ; y++) {
            if ( y % 5 != 0 ){
                System.out.print(y+" ");
            } else {
                System.out.print(" Skipping "+y+"\n");
            }
         }
    }
}
