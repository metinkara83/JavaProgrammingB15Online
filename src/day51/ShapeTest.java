package day51;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        Shape s4 = new Square();
        Shape s5 = new Pentagon();

//        s1.draw();
//        s2.draw();
//        s3.draw();

        // Create Array of shape to store
        // 5 concrete Shape Object
        // and call the draw the method on each of them
        Shape[] shapeList = {s1,s2,s3,s4,s5};
//        Shape[] shapeList = {s1,s2,s3,new Square(),s5};
        for (Shape eachShape : shapeList) {
            eachShape.draw();
        }

        System.out.println("================");

        // Also try to create ArrayList of Shape
        // and store 4 concrete Shape objects
        // and call the draw method on each of them
        ArrayList<Shape> manyShapes = new ArrayList<>();
        manyShapes.addAll(Arrays.asList(s1,s2,s3,s4,s5));
        for (Shape eachShape : manyShapes) {
            eachShape.draw();
        }
    }
}
