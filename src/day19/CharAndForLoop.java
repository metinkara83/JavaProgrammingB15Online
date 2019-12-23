package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has it's corresponding ASCII value from the table
        int x = 'A';
        char myChar = 100;
        System.out.println(x);
        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        System.out.println('A' > 'B');
        System.out.println('Z' > 'B');
        for (char iChar = 'A' ; iChar <='Z' ; iChar++){
            System.out.print(iChar+ " ");
        }
        System.out.println();
        for (char kChar = 'Z' ; kChar >= 'A' ; kChar--){
            System.out.print(kChar+" ");
        }


    }
}
