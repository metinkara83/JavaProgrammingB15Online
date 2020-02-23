package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("say bye to Java");
        lifoQue.add("say bye to Java"); // ACCEPTS DUPLICATES

        System.out.println("lifoQue = " + lifoQue);

        System.out.println("lifoQue.remove() = " + lifoQue.removeLast());

    }
}
