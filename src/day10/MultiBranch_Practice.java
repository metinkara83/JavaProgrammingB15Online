package day10;
import java.util.Scanner;
public class MultiBranch_Practice {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to McDonalds, what can I get for you?");
        int menuItemCode=scan.nextInt();
        /*
        11 Burger
        5 French Fries
        8 Nuggets
        35 Ice Cream
        55 Coke
         */
        String order="";

//        if(menuItemCode==5){
//            System.out.println("You have selected : Menu " + menuItemCode);
//            order="French Fries";
//        }
//        else if(menuItemCode==8){
//            System.out.println("You have selected : Menu " + menuItemCode);
//            order="Nuggets";
//        }
//        else if(menuItemCode==11){
//            System.out.println("You have selected : Menu " + menuItemCode);
//            order="Burger";
//        }
//        else if(menuItemCode==35){
//            System.out.println("You have selected : Menu " + menuItemCode);
//            order="Ice Cream";
//        }
//        else if(menuItemCode==55){
//            System.out.println("You have selected : Menu " + menuItemCode);
//            order="Coke";
//        }
//        else {
//            System.out.println("You have selected unknown item number!");
//            order="Unknown";
//        }
//        System.out.println("You want to have "+order+"\nThanks for your business and have a great day!");

        //what data type of variable I can use for "SWITCH"? byte, short, int, char, String
        switch(menuItemCode) {
            case 5:
                System.out.println("You have selected : Menu " + menuItemCode);
                order="French Fries";
                break;
            case 8:
                System.out.println("You have selected : Menu " + menuItemCode);
                order="Nuggets";
                break;
            case 11:
                System.out.println("You have selected : Menu " + menuItemCode);
                order="Burger";
                break;
            case 35:
                System.out.println("You have selected : Menu " + menuItemCode);
                order="Ice Cream";
                break;
            case 55:
                System.out.println("You have selected : Menu " + menuItemCode);
                order="Coke";
                break;
            default:
                System.out.println("You have selected unknown item number!");
                order="Unknown";
        }
        System.out.println("You want to have "+order+"\nThanks for your business and have a great day!");
    }
}
