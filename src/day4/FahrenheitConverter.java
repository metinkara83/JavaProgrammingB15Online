package day4;

public class FahrenheitConverter {

    public static void main(String[] args) {

        double fahrenheit = 70d;
        double celsius = (5/9d) * (fahrenheit-32);

        System.out.println(fahrenheit + " fahrenheit equals to " + celsius +" celsius degrees.");
    }
}
