package day41;
// Make this product a well encapsulated
// make all the instance fields private so it can only be accessible in same class
// provide public getters and setters method
public class Product {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }
    }
}
