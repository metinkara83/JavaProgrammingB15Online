package day24;

public class OfficeHour1 {

    public static void main(String[] args) {

        String[] cars = {"bmw" , "vw" , "audi"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // for each loop
        // temporary variable : array name
        for (String carModel : cars) {
            System.out.println("I am done assigning the car "+carModel );
        }

        for (int x = 0; x < cars.length ; x++) {
            System.out.println(cars[x]);
        }
    }
}
