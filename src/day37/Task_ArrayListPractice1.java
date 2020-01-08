package day37;

import java.util.ArrayList;

public class Task_ArrayListPractice1 {

    public static void main(String[] args) {

//        Given a ArrayList of 6 Integer 1,3,7,2,12,7
//        insert 100 in between each numbers
//        For example :
//        1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
//
//        Optionally make it a method
//        write a static void method that accept a ArrayList of integer object and insert 100 in between items.
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(3);
        n.add(7);
        n.add(2);
        n.add(12);
        n.add(7);
        insert (n);

    }

    public static void insert (ArrayList<Integer> nums){
        for (int i = 1; i < nums.size() ; i+=2) {
            nums.add(i,100);
        }
        System.out.println(nums);
    }
}
