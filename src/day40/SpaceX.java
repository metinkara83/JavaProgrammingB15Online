package day40;

public class SpaceX {

    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip();

        s1.name = "SpaceX";

        s1.setInitialPosition(2,3);
        s1.setDirection("RIGHT");
        s1.setDirection("right");
        s1.setDirection("up");
        s1.setDirection("left");
        s1.setDirection("down");
        System.out.println("s1 = " + s1);
    }
}
