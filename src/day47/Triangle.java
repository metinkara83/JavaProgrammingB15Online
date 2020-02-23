package day47;

public class Triangle extends Shape{

//    String name;
//    int area;
    int height;
    int base;

    public Triangle(int height, int base){
        super("Triangle");
        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateArea(){
        area = (height * base) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
}
}
