package day48;

import java.util.ArrayList;

public class Lion extends Mammals{

    // public abstract void makeNoise();
    // public abstract void drinkMilk();

    @Override
    public void drinkMilk() {
        System.out.println("Lion is drinking milk");
    }
    @Override
    public void makeNoise() {
        System.out.println("Lion says ROARRR!!!");
    }
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        // any class you created, it can be a data type for a variable
        // also known as reference variable

        Animal a1 = new Lion();
        a1.makeNoise();

        // generalize reference variable; think of list & arraylist as below
        // List<Integer> lst = new ArrayList<>();
    }
}
