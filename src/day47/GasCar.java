package day47;

// this is called concrete class
// concrete class must provide body for all inherited abstract methods
// or it will not even compile
public class GasCar extends Car{

    int gasLevel;

    // implementing an abstract method in sub class means
    // providing body for the method in sub class
    @Override
    public void start() {
        System.out.println("GasCar is starting");
    }

    @Override
    public void goForward() {
        System.out.println("GasCar is going forward");

    }

    @Override
    public void goBackward() {
        System.out.println("GasCar is going backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("GasCar is turning "+direction);
    }


    public static void main(String[] args) {
        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("left");
    }
}
