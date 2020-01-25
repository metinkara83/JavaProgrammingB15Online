package day45;

public class Fruit {

    // Always add no arg constructor in super class to avoid unnecessary error
    // of sub class calling super class's no arg constructor
    public Fruit(){
        System.out.println("No Arg Fruit Constructor");
    }

    public Fruit(String str){
        System.out.println("One Arg Fruit Constructor");
    }
}
