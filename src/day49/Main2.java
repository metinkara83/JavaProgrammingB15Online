package day49;

public class Main2 {

    public static void main(String[] args) {

        Tesla t1 = new Tesla(2020,285,"ModelX");
        t1.start();
        t1.goForward();
        t1.selfDrive();
        t1.charge();
        System.out.println(t1.toString());


    }
}
