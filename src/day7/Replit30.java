package day7;
import java.util.Scanner;
public class Replit30 {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            String item1, item2, item3, report;
            double price1, price2, price3, totalPrice;
            int count1, count2, count3;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Item1, count and its price:");
            item1 = scan.next();
            count1 = scan.nextInt();
            price1= scan.nextDouble();
            System.out.println("Item1 is " +item1+ ", count is " +count1+", price is "+price1);
            System.out.println("Enter Item2, count and its price:");
            item2 = scan.next();
            count2 = scan.nextInt();
            price2= scan.nextDouble();
            System.out.println("Item2 is " +item2+ ", count is " +count2+", price is "+price2);
            System.out.println("Enter Item3, count and its price:");
            item3 = scan.next();
            count3 = scan.nextInt();
            price3= scan.nextDouble();
            System.out.println("Item3 is " +item3+ ", count is " +count3+", price is "+price3);
            if (count1==0 && count2>0 && count3>0){
                totalPrice=(count2*price2)+(count3*price3);
                report=("Item2: "+item2+"Price: "+price2*count2+", Item3: "+item3+" Price: "+price3*count3);
            }
            else if (count2==0 && count1>0 && count3>0){
                totalPrice=(count1*price1)+(count3*price3);
                report=("Item1: "+item1+" Price: "+price1*count1+", Item3: "+item3+" Price: "+price3*count3);
            }
            else if (count3==0 && count1>0 && count2>0){
                totalPrice=(count1*price1)+(count2*price2);
                report=("Item1: "+item1+" Price: "+price1*count1+", Item2: "+item2+" Price: "+price2*count2);
            }
            else if (count1==0 && count2==0 && count3>0){
                totalPrice=(count3*price3);
                report=("Item3: "+item3+" Price: "+price3*count3);
            }
            else if (count1==0 && count3==0 && count2>0){
                totalPrice=(count2*price2);
                report=("Item2: "+item2+" Price: "+price2*count2);
            }
            else if (count2==0 && count3==0 && count1>0){
                totalPrice=(count1*price1);
                report=("Item1: "+item1+" Price: "+price1*count1);
            }
            else {
                totalPrice=(count1*price1)+(count2*price2)+(count3*price3);
                report=("Item1: "+item1+" Price: "+price1*count1+", Item2: "+item2+" Price: "+price2*count2+", Item3: "+item3+" Price: "+price3*count3);
            }

            System.out.println(report);
            System.out.println("Total price: "+totalPrice);
        }
    }
