package day9;
import java.util.Scanner;
public class LanguagePicker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String greeting="";
        int languageOption=scan.nextInt() ;
    if (languageOption==1) {
        greeting="Hello, SDET";
    }
    else if (languageOption==2) {
        greeting="Salam, SDET";
    }
    else if (languageOption==3) {
        greeting="Hola, SDET";
    }
    else if (languageOption==4) {
        greeting="Privet, SDET";
    }
    else if (languageOption==5) {
        greeting="Merhaba, SDET";
    }
    else if (languageOption==6) {
        greeting="Szia, SDET";
    }
    else if (languageOption==7) {
        greeting="Bonjour, SDET";
    }
    else {
        greeting="Language not found!";
    }
        System.out.println(greeting);
    }
}
