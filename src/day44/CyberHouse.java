package day44;

public class CyberHouse {

//    CyberHouse
//    instance fields : houseNum, design
//    static field : neighbourhoodName
//    add 2 args constructor
//    to set the houseNum, design
//    instance method
//    void showAllInfo()
//    just print the houseNum, design neighbourhoodName in one line
//    static void method showNeighborhood
//    print the neighbourhoodName only
    // try to access houseNum, design and see what happen

    private int houseNum;
    private String design;

    // we can change default value of the fields by assigning value directly in the template class
    private static String neighborhoodName = "Cybertek Avenue";

    // constructor can access anything
    public CyberHouse(int houseNum, String design){
        this.houseNum=houseNum;
        this.design=design;
    }

    // instance method can access anything
    public void showAllInfo(){
        System.out.println("houseNum = " + houseNum + ", design = " + design + ", neighborhoodName = " + neighborhoodName);
    }

    // static method can only access static members of same class
    public static void showNeighborhoodName(){
        System.out.println("neighborhoodName = " + neighborhoodName);
        // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHOD
        // System.out.println("houseNum = " + houseNum);
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public static String getNeighborhoodName() {
        return neighborhoodName;
    }

    public static void setNeighborhoodName(String neighborhoodName) {
        CyberHouse.neighborhoodName = neighborhoodName;
    }
}
