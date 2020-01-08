package day37;

import java.util.ArrayList;

public class Task_ArrayListPractice2 {

    public static void main(String[] args) {

//        Given List of names with various character count,
//        Remove any name with less than 2 characters
//        and if any name has more than 10 character only keep 10 characters
//        and if it has exactly 5 characters , reverse it
//        Of course , Optionally make a method out of it.
        ArrayList<String> n = new ArrayList<>();
        n.add("Metin");
        n.add("Abdurrezzak");
        n.add("Abdulkadir");
        n.add("Al");
        n.add("Merve");
        n.add("Vera");
        n.add("Bahar");
        System.out.println(n);
        modifier(n);
        System.out.println(n);
    }

    public static ArrayList<String> modifier (ArrayList<String> names){
        String each = "";
        for (int i = 0; i < names.size() ; i++) {
            each = names.get(i);
            if (each.length() <= 2){
                names.remove(each);
                i--;
            }
            else if (each.length() > 10){
                names.set(i, each.substring(0,10));
            }
            else if (each.length() == 5){
                String reverse = "";
                for (int j = each.length()-1; j >= 0 ; j--) {
                    reverse += each.charAt(j)+"";
                }
                names.set(i, reverse);
            }
        }
        return names;
    }
}
