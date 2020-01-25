package day42;

public class ComputerShop {

    public static void main(String[] args) {

        Computer c1 = new Computer();
        c1.setBrand("Apple");
        c1.setRam(32);
        c1.setPrice(2000);

        c1.runProgram();
        c1.calculate();
        
        c1.setPrice(12);
        c1.setRam(1000);
        System.out.println("c1 = " + c1.toString());
        
        int myRam = c1.getRam();
        System.out.println("myRam = " + myRam);
        
        Computer c2 = new Computer();
        c2.setBrand("HP");
        c2.setPrice(c1.getPrice()/2);
        c2.setRam(myRam/4);
        System.out.println("c2 = " + c2);
    }
}
