package day47;

public class ShapeCreator {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(4,5);
        Triangle t2 = new Triangle(7,8);
        System.out.println(t1);
        t1.calculateArea();
        System.out.println(t1);

        System.out.println(t2);
        t2.calculateArea();
        System.out.println(t2);

        Rectangle r1 = new Rectangle(3,5);
        Rectangle r2 = new Rectangle(9,15);
        System.out.println(r1);
        r1.calculateArea();
        System.out.println(r1);

        System.out.println(r2);
        r2.calculateArea();
        System.out.println(r2);
    }
}
