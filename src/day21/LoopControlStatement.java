package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        // break
        // if line contains break reaches, the loop will stop !!!

//        for (int i = 0; i <=10 ; i++) {
//            System.out.println(i);
//            break;
//        }

        // while iterating over 1 to 10
        // break out of the loop when it is 5

//        for (int i = 0; i <=10 ; i++) {
//            System.out.print(i+" ");
//            if (i==5){
//                break;
//            }
//        }

        int sum = 0;
        for (int x = 1; x <=10 ; x++) {
            // We need to add the sum after we make sure it did not go over 40

            System.out.println("current sum is "+sum);
            System.out.println("If I add " + x +" dollar, it would be "+(sum+x));
            if (sum + x > 30){
                break;
            }
            sum = sum + x;
        }
        System.out.println("sum = " + sum);


        // continue
        // if line contains continue reaches, the loop will skip to next iteration

        // We can use break and continue for any type of loop
    }
}
