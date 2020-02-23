package day47;

public class Rectangle extends Shape{

//    String name;
//    int area;
    int height;
    int width;

    public Rectangle(int height, int width){
        // I want to set the name to word Rectangle;
        // I am reusing the functionality of super class
        // to set the name to rectangle
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea(){
        area = height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

