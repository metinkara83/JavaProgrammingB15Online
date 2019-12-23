package day9;
import java.util.Scanner;
public class LanguagePicker_With_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String greeting = "";
        int languageOption=scan.nextInt();
        switch (languageOption) {
            case 1:
                greeting = "Hello, SDET";
                break;
            case 2:
                greeting = "Salam, SDET";
                break;
            case 3:
                greeting = "Hola, SDET";
                break;
            case 4:
                greeting = "Privet, SDET";
                break;
            case 5:
                greeting = "Merhaba, SDET";
                break;
            case 6:
                greeting = "Szia, SDET";
                break;
            case 7:
                greeting = "Bonjour, SDET";
                break;
            default:
                greeting = "Language not found!";
        }
                System.out.println(greeting);
    }
}
