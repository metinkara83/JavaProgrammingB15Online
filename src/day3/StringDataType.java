package day3;

public class StringDataType {

    public static void main(String[] args) {

        String name = "Metin";
        int age = 36;
        double height = 5.5;
        char myLastNameFirstChar = 'K';
        boolean isMarried = true;
        byte childrenCount = 2;

        System.out.println("My name is " + name + " and my last name starts with " + myLastNameFirstChar +".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My height is " + height +".");
        System.out.println("I am married : " + isMarried);
        System.out.println("I have " + childrenCount + " kids.");

        String city = "Cumming";
        String state = "GA";

        System.out.println("I live in city of " + city + ", in the state of " + state +".\n");

        //All in one line
        //System.out.println("My name is " + name + " and my last name starts with " + myLastNameFirstChar +"." + "\n" + "I am " + age + " years old." + "\n" + "My height is " + height +"." + "\n" + "I am married : " + isMarried + "\n" + "I have " + childrenCount + " kids." + "\n" + "I live in city of " + city + ", in the state of " + state +".");

        //OR
        System.out.println("My name is " + name + " and my last name starts with " + myLastNameFirstChar +".\nI am " + age + " years old.\nMy height is " + height +".\nI am married : " + isMarried + "\nI have " + childrenCount + " kids.\nI live in city of " + city + ", in the state of " + state +".");

    }
}
