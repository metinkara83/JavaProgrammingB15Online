package day45;

// If we do not explicitly (visibly, manually) extend another class
// we always automatically extend Object class
// Object class is super class of all the classes in Java
public class Book {

    public static void main(String[] args) {

        Book b1 = new Book();
        System.out.println("b1.toString() = " + b1.toString());
    }
}
