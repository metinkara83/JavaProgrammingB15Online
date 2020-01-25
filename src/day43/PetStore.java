package day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetStore {

    public static void main(String[] args) {

//        Create another class called PetStore with main method
//        Create 8 Pet objects with initial value
//        Store them into a List<Pet>
//        1, print out all info
//        2, print out only name
//        3, print out only cats

        Pet p1 = new Pet();
        System.out.println("p1 = " + p1);
        p1.speak();
        p1.setType("cow");
        p1.speak();
        System.out.println("-----------------------");

        Pet p2 = new Pet("horse","Walter");
        Pet p3 = new Pet("cat","Samantha");
        Pet p4 = new Pet("dog","Oliver");
        Pet p5 = new Pet("dog","Henry");
        Pet p6 = new Pet("cow","Adam");
        Pet p7 = new Pet("ant","Atom");
        Pet p8 = new Pet("bear","Teddy");
        Pet p9 = new Pet("cat","Stephanie");

        List<Pet> myPets = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);
        System.out.println("myPets = " + myPets);

        for (Pet each : myPets){
            System.out.println("each pet name = " + each.getName());
        }

        System.out.println("-------------------");

        for (Pet each : myPets){
            if (each.getType().equalsIgnoreCase("cat")){
                System.out.println("Cat name is : " + each.getName());
            }
        }
    }
}
