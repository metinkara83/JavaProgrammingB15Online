package day35;

public class CharacterPractice {

    public static void main(String[] args) {

        // Character class has lots of static methods to perform actions on char values
        // isDigit , isLetter , isLetterOrDigit , isUpperCase , isLowerCase
        // toUpperCase , toLowerCase
        System.out.println("Is Digit Method Practice");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";
        // Get the numbers out of the string and store it into integer variable
        String nums ="";
        for (int i = 0; i < str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                nums += str.charAt(i);
                System.out.println("str.charAt("+i+") = "+str.charAt(i));
            }
        }
        System.out.println("String is : "+nums);
        Integer numbers = Integer.parseInt(nums);
        System.out.println("numbers = " + numbers);
    }
}
