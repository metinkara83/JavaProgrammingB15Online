package day20;

public class ReversingAString {

    public static void main(String[] args) {

        // given a string variable name with value
        // reverse this name and store reversed value into
        // another string variable reversedName

        String name = "Jon Snow";
        String reversedName = "";
        for (int i = name.length()-1 ; i >=0 ; i--){
            reversedName+=name.charAt(i);
 //           reversedName+=name.substring(i,i+1);
            System.out.print(reversedName+" ");
//            System.out.print(name.charAt(i));
        }
        System.out.print("\n"+reversedName);
    }
}
