package day43;

public class PetStaticPractice {

    public static void main(String[] args) {

        Pet.showGeneralPetInfo();

        // Does not Work!!!
//        Pet.getName();

        Pet p1 = new Pet("cat","yumyum");
        System.out.println("p1 name = "+p1.getName());
        p1.speak();
    }
}
