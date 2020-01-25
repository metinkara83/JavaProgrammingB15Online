package day40;

public class HotMarketActions4 {

    public static void main(String[] args) {

        Offers o1 = new Offers();
        o1.company="Apple";
        o1.location="Austin";
        o1.isFullTime=true;
        o1.salary=140000;

        String o1Str = o1.toString();
        System.out.println("o1Str = " + o1Str);

        System.out.println(o1.toString());
        // if you directly print out object, it will call toString() method automatically
        System.out.println(o1); // this is what is automatically happening behind the scene o1.toString()
    }
}
