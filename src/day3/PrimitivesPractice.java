package day3;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount +".");

        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount +".");

        int catCount = 20;
        System.out.println("The cat count is " + catCount +".");

        long mileToMoon = 5000000L;
        System.out.println("The distance to moon is " + mileToMoon +" miles.");

        long mileToSun = 250000000L;
        System.out.println("The distance to sun is " +mileToSun +" miles.");

        // -----floating point-----

        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is " + priceOfBanana +".");

        float priceOfPotato = 2.49F;
        System.out.println("The price of potato is " + priceOfPotato +".");

        //you must add f at the end of the number to indicate that this is float data type.
        //f and F after the value is same, uppercase lowercase do not matter, but it is mandatory.

        // -----larger floating point numbers-----

        double priceOfIpad1 = 355.99d ;
        System.out.println("The price of Ipad1 is " + priceOfIpad1 +".");

        double priceOfIpadPro = 1024.99D ;
        System.out.println("The price of Ipad Pro is " + priceOfIpadPro + ".");

        double priceOfMac   = 2299.99;
        System.out.println("The price of Mac is " + priceOfMac + ".");

        //for good programming habits, add the extensions always.
        // If you have a whole number by itself, compiler automatically assume it is an int.
        // If you have a fractional number by itself, compiler automatically assume it is a double.
    }
}
