package day4;

public class StringPractice {

    public static void main(String[] args) {

        String firstName = "Metin";
        String lastName = "Kara";
        // String fullName = firstName + " " + lastName;
        String fullName = firstName + "\t" + lastName;

        //System.out.println("My first name is " + firstName);
        //System.out.println("My last name is " + lastName);
        //System.out.println("My full name is " + fullName);

        String productName = "Amazon Fire";
        String model = "HD";
        int version = 8;
        float price = 79.99f;

        System.out.println("I saw " + productName +" " + model +version + " hands-free with Alexa for " + price +".");


    }
}
