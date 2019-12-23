package day7;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        int apple = 8;
        apple++; // incrementing by one -->9

        System.out.println(apple);  // 9 // printing the increased value
        //System.out.println(++apple); // 10// increasing the value and printing the value
        System.out.println(apple++); // apple++, when ++ comes after the variable it is called post increment
        // it will increase the value BUT it will reflect the increased the value next time the variable shows up!!!
        System.out.println(apple);

        int score = 50;
        System.out.println(++score); //51
        System.out.println(score++); //51 now but ready to be 52
        System.out.println(++score); //53
        System.out.println(score); //53
        System.out.println(--score); //52
        System.out.println(score--); //still 52 but ready to be 51
        System.out.println(score); //51
     }
}
