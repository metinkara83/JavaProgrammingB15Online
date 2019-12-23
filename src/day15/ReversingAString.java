package day15;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Metin";

        int characterCount = name.length();
        int lastCharIndex = characterCount - 1;
        char lastChar = name.charAt(lastCharIndex);
        System.out.println("Last char is "+lastChar);
        System.out.println("last char in one shot "+name.charAt(name.length()-1));
    }
}
