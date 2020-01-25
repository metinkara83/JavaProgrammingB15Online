package day44;

public class CyberHouseAction {

    public static void main(String[] args) {

//        CyberHouse.neighborhoodName="Brooklyn";
        CyberHouse.showNeighborhoodName();

        CyberHouse h1 = new CyberHouse(1317,"Manolia");
        h1.showAllInfo();

        CyberHouse h2 = new CyberHouse(1453,"Jasmin");
        h2.showAllInfo();

        CyberHouse h3 = new CyberHouse(1344,"Tulip");
        h3.showAllInfo();

    }
}
