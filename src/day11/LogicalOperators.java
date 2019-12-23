package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        int num=55;

        System.out.println((num>100 || num<10) && (num>10 && num<60));
        System.out.println(num>50 && num!=52 || num==57);
        System.out.println(num>50 || num!=52 && num==57);

        int x=55;
        System.out.println(x>50 || x!=52 && x==57);

    }
}
