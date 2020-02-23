package day56.officeHour.task_2;
//        create a class called Test:
//        create two objects of circle, one' radius is 3, the other' radius is 5
//        verify if those two circles are equal
public class Test {

    public static void main(String[] args) {

        Circle c1 = new Circle (3.5);
        Circle c2 = new Circle (4);
        Circle c3 = new Circle (3.5);
        System.out.println( c1.equals(c2) );
        System.out.println( c1.equals(c3) );
    }
}
