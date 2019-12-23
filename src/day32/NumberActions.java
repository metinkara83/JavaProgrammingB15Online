package day32;

public class NumberActions {

    public static void main(String[] args) {

        stringRepeater("Hello", 3);
        skipCountBy3From0to50();
        print1toX(13);
    }

    public static void stringRepeater (String strToRepeat, int count){
        for (int i = 1; i <=count ; i++) {
            System.out.println(strToRepeat+" "+i);
        }
    }

    public static void skipCountBy3From0to50 (){
        for (int i = 0; i <= 50 ; i+=3) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void print1toX (int x){
        for (int i = 1; i <= x ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
