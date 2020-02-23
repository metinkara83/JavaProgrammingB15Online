package day56.officeHour.task_2;
//        Task2:
//        create a class called circle:
//        instance variables: radius
//        override equals() method:
//        returns true if the one circle' radius is same with another circle
//        create a class called Test:
//        create two objects of circle, one' radius is 3, the other' radius is 5
//        verify if those two circles are equal
public class Circle {

    double radius;

    public Circle (double radius){
        this.radius=radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle c = (Circle) obj;

        if (obj instanceof Circle) // checks if obj is the object of a circle
            if (radius==c.radius)
//            if(radius==((Circle)obj).radius)
        return true;
        return false;
    }
}
