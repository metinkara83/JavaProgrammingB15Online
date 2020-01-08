package day37;

import java.util.ArrayList;

public class Task_ArrayListPractice5 {

    public static void main(String[] args) {

//        Create a method called isNumberOnly and it accept a String object and
//        return true if all of its characters are number.
//        Create another method isNumberList , it accepts List<String> object and
//        return true only if all items are number only (use above method)

        String n1 = "Metin";
        String n2 = "Abd7394mtn";
        String n3 = "836205836";
        System.out.println(numberChars(n1));
        System.out.println(numberChars(n2));
        System.out.println(numberChars(n3));

        ArrayList<String> n = new ArrayList<>();
        n.add("Metin");
        n.add("89382940");
        n.add("abd8943mmfs");
        System.out.println(n);
        System.out.println(isNumberList(n));

        ArrayList<String> m = new ArrayList<>();
        m.add("153");
        m.add("89382940");
        m.add("368553");
        m.add("8932850");
        System.out.println(m);
        System.out.println(isNumberList(m));

    }

    public static Boolean numberChars (String str){
        ArrayList<Character> eachCharacter = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            eachCharacter.add(str.charAt(i));
        }
        boolean allNumber = false;
        int count = 0;
        Character each;
        for (int i = 0; i < eachCharacter.size() ; i++) {
            each = eachCharacter.get(i);
            if (Character.isDigit(each)){
                ++count;
            }
        }
        if (count == eachCharacter.size()){
            allNumber = true;
        }
        return allNumber;
    }

    public static Boolean isNumberList (ArrayList<String> lst1){
        ArrayList<Boolean> trueFalse = new ArrayList<>();
        ArrayList<Boolean> lst2 = new ArrayList<>();
        boolean allListNumber = false;
        for (int j = 0; j < lst1.size() ; j++) {
            trueFalse.add(true);
        }
        for (int i = 0; i < lst1.size() ; i++) {
            lst2.add(numberChars(lst1.get(i)));
        }
        if (lst2.equals(trueFalse)){
            allListNumber = true;
        }
        return allListNumber;
    }
}
