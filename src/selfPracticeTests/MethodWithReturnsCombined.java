package selfPracticeTests;

public class MethodWithReturnsCombined {

        public static void main(String[] args) {

            // Test code
            // System.out.println(removeDup("AAABBACCCGGGGTTBBGGDD"));  //==>>"ABCGTD"

//        1.  write a return method called RemoveDup that accepts a String and removes duplicate values from the String

            // Test code
            // System.out.println(frequency("AAABBACCCGGGGTTBBGGDD",'b'));  //==>>4

//        2. write a return method called Frequency that accepts String and  char,
//        the method will return the total number of occurrence of the given char in the given string

            // Test code
            frequencyOfChars("AAABBACCCGGGGTTBBGGDD");
            // System.out.print(frequencyOfChars("AAABBACCCGGGGTTBBGGDD"));   //==>>"A4B4C3G6T2D2"

//        3. Combine two methods 1 & 2 to write a method that prints the frequency of each characters from the given String
        }

        public static String removeDup(String str){
            String result = "";
            for(int i = 0 ; i < str.length() ; i++){
                if ( ! result.contains(str.substring(i,i+1))){
                    result += str.substring(i,i+1);
                }
            }
            return result;
        }

        public static int frequency(String str, char a){
            int count = 0;
            for (int i = 0 ; i < str.length() ; i++){
                if (str.charAt(i)==a){
                    ++count;
                }
            }
            return count;
        }

        public static void frequencyOfChars(String str){
            String removed = removeDup(str);
            for (int i = 0 ; i < removed.length() ; i++){
                int x = frequency(str,removed.charAt(i));
                System.out.print(removed.charAt(i)+""+x);
            }
        }

//        public static String frequencyOfChars(String str){
//            String result = "";
//            String removed = removeDup(str);
//            for (int i = 0 ; i < removed.length() ; i++){
//                int x = frequency(str, removed.charAt(i));
//                result += removed.charAt(i)+""+x;
//            }
//            return result;
//        }

}
