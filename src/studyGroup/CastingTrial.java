package studyGroup;


import java.util.Scanner;

public class CastingTrial {

    public static void main(String[] args) {
        int itemPrice;
        int quarters,dimes,nickels;


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter price in cents:");
        itemPrice=scan.nextInt();

        quarters=(100-itemPrice)/25;
        dimes=((100-itemPrice)%25)/10;
        nickels=(((100-itemPrice)%25)%10)/5;

        if(itemPrice<25 || itemPrice>100){
            System.out.println("Invalid price!");
        }else if (itemPrice%5!=0){
            System.out.println("Invalid Price!");
        }
        else{
            System.out.println("Your change is "+ quarters+" quarters, "+ dimes +" dimes, and "+nickels+" nickels.");
        }


    }
}
