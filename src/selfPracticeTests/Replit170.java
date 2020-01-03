package selfPracticeTests;

import java.util.*;

public class Replit170 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {3,6,0,4,3,2,7,0};

        //TODO. Write you code below this line.
        int[] extinction = {0,0,0,0,0,0,0,0};
        int[] compare = new int[inhabitants.length];

        for (int x = 0 ; ; x++){
            for (int i = 0 ; i < inhabitants.length ; i++){
                compare[i] = inhabitants[i];
            }
            System.out.println("Day "+x+" "+Arrays.toString(compare));
            for (int y = 0 ; y < inhabitants.length ; y++){
                if (y==0){
                    if (compare[y+1]==0)
                    inhabitants[y]/=2;
                }
                else if (y>0 && y<inhabitants.length-1){
                    if (compare[y-1]==0 || compare[y+1]==0)
                        inhabitants[y]/=2;
                }
                else if (y==inhabitants.length-1){
                    if (compare[y-1]==0)
                        inhabitants[y]/=2;
                }
            }

            if (Arrays.equals(compare,extinction)){
                break;
            }
        }
        System.out.println("---- EXTINCT ----");
    }

}
