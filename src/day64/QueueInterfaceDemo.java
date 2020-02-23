package day64;

import java.util.*;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        // this is FIFO queue
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend the class");
        taskQueue.add("say bye to Java");
        taskQueue.add("say bye to Java"); // ACCEPTS DUPLICATES

        System.out.println("taskQueue = " + taskQueue);

        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());

    }
}
