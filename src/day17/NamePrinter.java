package day17;

public class NamePrinter {

    public static void main(String[] args) {

        // If you have complaint in the life: call 1-800-Alexander
        String name = "Alexander";

        // get each and every character and print them out vertically
        int x = 0;
        while (x<name.length()) {
            System.out.println(name.charAt(x));
            ++x;
        }

        String yourName = "Metin Kara";
        int y = yourName.length()-1;
        while (y>=0) {
            System.out.print(yourName.charAt(y)+" ");
            --y;
        }
        System.out.println();
        String evenCharName = "Metin Kara";
        int z = 0;
        while (z<evenCharName.length()) {
            if (z % 2 == 0) {
                System.out.print(evenCharName.charAt(z) + " ");
            }
            ++z;
        }
    }
}
