package day35;

public class CharacterPractice2 {

    public static void main(String[] args) {

        String str = "A34B123C4X";
        // get the sum of the numbers found in the String
        char[] allChars = str.toCharArray();
        int sum = 0;
        for (char eachChar : allChars) {
            // checking whether each char is a number or not
            if (Character.isDigit(eachChar)){
                // if it is print out to see
                System.out.println("eachChar = " + eachChar);
                // then turn it into int using parseInt method
                // parseInt only accepts String
                // so we need to pass String by adding "" to eachChar
                int eachNum = Integer.parseInt(eachChar+"");
                // now we can numerically add the number to sum
                sum += eachNum;
            }
        }
        System.out.println("Sum = "+sum);

    }
}
