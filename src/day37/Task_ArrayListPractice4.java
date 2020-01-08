package day37;

import java.util.ArrayList;

public class Task_ArrayListPractice4 {

    public static void main(String[] args) {

//        Create a method that accept String object and return List<Character> that contains each character.

        String n1 = "Metin";
        String n2 = "Abdurrezzak";
        String n3 = "Abdulkadir";

        System.out.println(characterReturner(n1));
        System.out.println(characterReturner(n2));
        System.out.println(characterReturner(n3));
    }

    public static ArrayList<Character> characterReturner (String names){
        ArrayList<Character> eachCharacter = new ArrayList<>();
        for (int i = 0; i < names.length() ; i++) {
            eachCharacter.add(names.charAt(i));
        }
        return eachCharacter;
    }
}
