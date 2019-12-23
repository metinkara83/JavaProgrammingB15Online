package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";
        System.out.println(name.contains("st"));

        // I wanna check whether this name contains "st" no matter the case
        // so I want to store the uppercase version of this name then check for "ST"

        String upperCaseName = name.toUpperCase();
        System.out.println("upperCaseName contains ST or not? : "+upperCaseName.contains("ST"));

        // This is called method chaining, combining multiple method call
        // make my name all lowercase(String) then check whether it contains lowercase st

        System.out.println(name.toLowerCase().contains("st"));
    }
}
