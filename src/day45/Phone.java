package day45;

public class Phone extends Electronics {

    // sub class inherits every visible instance field & static field
    // sub class inherits every visible instance method & static method
//    String brand;
//    static boolean useElectricity = true;

    double size;
    double price;

    // bad idea to have main here
    // but we are doing it anyway for less screen to look at
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";

        System.out.println(Electronics.useElectricity);
        System.out.println(Phone.useElectricity);
        // directly accessing the static field of same class in static method
        System.out.println(useElectricity);

        // how to call showBrand method
        p1.showBrand();

        // how to call displayUseElectricity static method
        displayUseElectricity();

        // STATIC WAY
        Electronics.displayUseElectricity();
        Phone.displayUseElectricity();
    }
}
