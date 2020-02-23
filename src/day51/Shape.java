package day51;

public abstract class Shape {

    public abstract void draw();
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Pentagon extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Pentagon");
    }
}