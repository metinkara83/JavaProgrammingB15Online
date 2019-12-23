package day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        int[] scores = new int[4];
        // assigning value to each index
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
        // accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        // how do we get the size of any array object
        // array object has a property called length
        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;
        System.out.println(itemCount);
        for (int x = 0; x <= itemCount-1 ; x++) {
            System.out.println(scores[x]);
        }
        for (int y = itemCount-1; y >=0 ; y--) {
            System.out.println(scores[y]);
        }
    }
}
