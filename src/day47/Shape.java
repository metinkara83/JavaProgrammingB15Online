package day47;

import java.awt.font.ShapeGraphicAttribute;

public abstract class Shape {

    String name;
    int area;

    // add a constructor to set the name
    public Shape(String name){
        this.name = name;
    }

    // add an abstract method called calculateAnArea
    public abstract void calculateArea();

    // I want to enforce sub classes to provide toString method!!!
    public abstract String toString();

    // add two concrete class of Shape
        // Triangle: instance fields: int height and base
        // constructor: to set name, height, base
        // implements calculateArea method area = height * base /2

        // Rectangle: instance fields: int height and width

}
