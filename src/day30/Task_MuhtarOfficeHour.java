package day30;

import java.util.Arrays;

public class Task_MuhtarOfficeHour {

    public static void main(String[] args) {

//        1. write a program that can check if a string is build out of the same letters as another string
//        Ex: input:
//        str1 = "abc";
//        str2 = "cba";
//        output:
//        true
//        2. Write a program that will remove all the duplicates from a string
//        Do it with Arrays only
//        3. given the array of names:
//        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//        write a program that can remove all the names named Ahmed from the array
//        Ex:
//        names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//        System.out.println( Arrays.toString(names) );
//        output:
//	   			[John, Eric, Hassan]

        // TASK-1
        String str1 = "abc";
        String str2 = "cba";
        char[] split1 = str1.toCharArray();
        char[] split2 = str2.toCharArray();
        Arrays.sort(split1);
        Arrays.sort(split2);
        str1 = Arrays.toString(split1);
        str2 = Arrays.toString(split2);
        System.out.println(str1+" "+str2);
        if (Arrays.equals(split1, split2)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        String[] s1 = str1.split("");
        String[] s2 = str2. split("");
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1,s2));
        System.out.println("======================");

//      TASK-2
        String repeat = "aaabbbhhhhgggttlkl;lklfdhskljkjkjjkjkskjgfjdshkla";
        String[] repeatChar = repeat.split("");
        String sum = "";

        for (String s : repeatChar) {
            if (!sum.contains(s)){
                sum += s;
            }
        }
        System.out.println(sum);

//      TASK-3
        String[] names = {"Hasan" , "Ahmet", "John", "Bryan", "Ahmet", "Mike"};
        String updated = "";
        for (String name : names) {
            if (!name.toLowerCase().equals("ahmet")){
                updated += name+" ";
            }
        }
        String[] newNames = updated.split(" ");
        System.out.println(Arrays.toString(newNames));

    }
}
