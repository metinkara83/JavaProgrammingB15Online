package day12;
import java.util.Scanner;

public class WakeUp_CodeInWeather {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather outside?");
        String weather = scan.next();
        if (weather.equals("Sunny")){
            System.out.println("Code in Sunny weather");
        }
        else if (weather.equals("Rainy")){
            System.out.println("Code in Rainy weather");
        }
        else if (weather.equals("Cloudy")){
            System.out.println("Code in Cloudy weather");
        }
        else if (weather.equals("Snowy")){
            System.out.println("Code in Snowy weather");
        }
        else {
            System.out.println("Rain or shine just keep coding anyway!!!");
        }
    }
}
