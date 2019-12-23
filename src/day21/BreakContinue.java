package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);

            if (i==5){ // this is also pointless after the 5th iteration the loop will stop by itself
                break;
            }
            continue; // this is pointless because after each iteration it is going to next iteration anyway
        }
    }
}
