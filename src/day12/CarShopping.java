package day12;

public class CarShopping {

    public static void main(String[] args) {

        // Buy Corolla or Tesla (only if it is within the range)

        // there is only one car covered with cloth
        // we do not know what car it is and what the price is
        // once we take out the cloth, we check whether it is Corolla, if it is we buy it without checking the price
        // if it is not we check if it is Tesla and also check whether it is within the budget

        String carBrand="corolla";
        int carPrice = 60000;
        int budget = 40000;

//        if (carBrand.equals("corolla") || (carBrand.equals("Tesla") && carPrice<=budget)) {
//            System.out.println("Car Acquired!!!");
//        }
//        else {
//            System.out.println("Not What I am looking for");
//        }
//      DO NOT REPEAT YOURSELF ("Car Acquired!!!")
        if (carBrand.equals("corolla")){
            System.out.println("Corolla Car Acquired!!!");
        }
        else if (carBrand.equals("Tesla")&& carPrice<=budget) {
            System.out.println("Tesla Car Acquired!!!");
        }
        else {
                System.out.println("Not What I am looking for");
            }
    }
}
