package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double[] prices = new double[5];
        System.out.println(prices[0]);

        // cannot print out array variable directly to see what is inside
        System.out.println(prices);

        prices[0] = 2.46;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        prices[4] = 65.123;
        // what happen if I go over the range
//        prices[5] = 165.3; // RUNTIME ERROR!!!

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // create a char array that hold all the letters from your first name
        // and assign values using each characters of your first name
        // then print out each character

        char[] nameChars = new char[5];
        // What default value do we get for char array
        System.out.println("<"+nameChars[0]+">");

        nameChars[0]='m';
        nameChars[1]='e';
        nameChars[2]='t';
        nameChars[3]='i';
        nameChars[4]='n';
        System.out.print(nameChars[0]+""+nameChars[1]+""+nameChars[2]+""+nameChars[3]+""+nameChars[4]);
        System.out.println();
        // THIS WILL ACTUALLY PRINT THE CONTENT OF CHAR ARRAY NOT MEMORY ADDRESS
        // AND THIS IS ONLY FOR CHAR ARRAY
        System.out.println(nameChars);

        boolean[] yesNo = new boolean[3];

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = true;
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);
    }
}
