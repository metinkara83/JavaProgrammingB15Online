package day35;

public class OfficeHour {

    public static void main(String[] args) {

        System.out.println(RemoveDup("AAABBACCCGGGGTTBBGGDD"));

//        1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the String
//        Ex: RemoveDuplicate("aaabbbccc") ==> "abc"

        System.out.println(Frequency("AAAABBBBCCCCHHGGTTLLNNAABBB",'B'));

//        2. write a return method called Frequency that accepts String and  char, the method will return the total number of occurrence of the given char in the given string
//        Ex: Frequency("AAABBB", 'A') ==> 3

        FrequencyOfChars("CCAAABBBCCCC");

//        3. Combined the methods 1 & 2 to write a method that prints the the frequency of each characters from the given String
//        Ex: FrequencyOfChars("CCAAABBBCCCC")  ==>"A3B3C6"
    }

    public static String RemoveDup (String str){
        String newString = "";
        for (int i = 0; i < str.length() ; i++) {
            if (!newString.contains(str.substring(i,i+1))){
                newString += str.substring(i,i+1);
            }
        }
        return newString;
    }

    public static int Frequency (String str, char c){
        int count = 0 ;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==(c)){
                ++count;
            }
        }
        return count;
    }

    public static void FrequencyOfChars (String str){
        String updated = RemoveDup(str);
        for (int i = 0; i < updated.length() ; i++) {
            int count = Frequency(str,updated.charAt(i));
            System.out.print(updated.charAt(i)+""+count);
        }
    }
}
