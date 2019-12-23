package day16;

public class WhileLoopIntro {

    public static void main(String[] args) {

        // print hello world 5 times
        // also keep the count of how many times you said hello
        int count = 0;
        while (count < 5) {
            System.out.println("Hello World");
            System.out.println(count++);
        }
        // count = count + 1
        // count += 1

    }
}
