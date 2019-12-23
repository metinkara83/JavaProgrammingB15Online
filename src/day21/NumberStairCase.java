package day21;

public class NumberStairCase {

    public static void main(String[] args) {

        for (int y = 1; y <=5 ; y++) {
//            System.out.print(y+" ");
            for (int x = 1; x <= y; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        for (int y = 5; y >=1 ; y--) {
//            System.out.print(y+" ");
            for (int z = 1; z <=y ; z++) {
                System.out.print(z+" ");
            }
            System.out.println();
        }

//        for (int x = 1; x <=1 ; x++) {
//            System.out.print(x+" ");
//        }
//            System.out.println();
//        for (int x = 1; x <=2 ; x++) {
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        for (int x = 1; x <=3 ; x++) {
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        for (int x = 1; x <=4 ; x++) {
//            System.out.print(x+" ");
//        }
//        System.out.println();
//        for (int x = 1; x <=5 ; x++) {
//            System.out.print(x+" ");
//        }
//        System.out.println();

    }
}
