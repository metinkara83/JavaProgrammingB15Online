package day21;

public class Task2_NameBreaker {

    public static void main(String[] args) {

        // Store your name into a variable name
        // loop through each and every letters and print
        // if you see letter 'r' -->> get out of the loop

        String name="Metin Kara";
        for (int x = 0; x <= name.length()-1 ; x++) {
            System.out.print(name.charAt(x));
            if (name.charAt(x+1)=='r'){
                break;
            }
        }
        System.out.println();
        for (int x = 0; x <= name.length()-1 ; x++) {

            if (name.charAt(x)=='r'){
                break;
            }
            System.out.print(name.charAt(x));
        }
        System.out.println();
        for (int i = 0 ; i<=name.length()-1 ; i++){

            if (name.substring(i,i+1).equalsIgnoreCase("r")){
                break;
            }
            System.out.print(name.substring(i,i+1));
        }

    }
}
