package day43;

public class StarbucksUtil {

    public static void main(String[] args) {

        Coffee c = new Coffee("Blonde",5,1.6);
        printCoffeeInfo(c);

        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);
        printCoffeeInfo(new Coffee ("Intensito",10));

        // we would need an object of current class if we wanted call instance method of current class
//        StarbucksUtil util = new StarbucksUtil();
//        util.printCoffeeInfo(c);

    }

    // Create a static method to accept a coffee object and print it's information like the below:
    // This coffee is : name , price is <price> , caffeine level is <level>
//    public void printCoffeeInfo(Coffee co){
//        System.out.println("This coffee is : "+ co.getType()+" , price is <"+ co.getPrice()+
//                "> , caffeine level is <"+ co.getCaffeineLevel()+">.");
//    }

    public static void printCoffeeInfo(Coffee co){
        System.out.println("This coffee is : "+ co.getType()+" , price is <"+ co.getPrice()+
                "> , caffeine level is <"+ co.getCaffeineLevel()+">.");
    }

}
