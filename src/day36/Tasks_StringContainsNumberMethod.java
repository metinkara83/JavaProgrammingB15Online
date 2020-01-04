package day36;

public class Tasks_StringContainsNumberMethod {

    public static void main(String[] args) {

        System.out.println(checkIfStringContainsNumber("ABCDKHH"));

    }

    public static Boolean checkIfStringContainsNumber (String str){
        for (int i = 0; i < str.length() ; i++) {
            char eachChar = str.charAt(i);
            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }
        }
        System.out.println("NO NUMBER FOUND!!!");
        return Boolean.valueOf(false);
    }
}
