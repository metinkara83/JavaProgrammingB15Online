package day37;

import java.util.ArrayList;

public class Task_ArrayListPractice6 {

    public static void main(String[] args) {

//        Write a static void method to accept a List<Integer> and reverse it
//        (Do not create new List, use swamp logic)
        ArrayList<Integer> n = new ArrayList<>();
        n.add(17543);
        n.add(309873344);
        n.add(1234);
        n.add(739);
        n.add(85);
        n.add(837295);
//        n.add(5244);
        System.out.println("Original array list is : "+n);
        reverseInteger(n);

    }

    public static void reverseInteger (ArrayList<Integer> num){
        int temp = 0;
        for (int i = 0; i < num.size()/2 ; i++) {
            temp = num.get(num.size()-1-i);
            num.set(num.size()-1-i,num.get(i));
            num.set(i,temp);
        }
        System.out.println("Reversed array list is : "+num);
    }
}
