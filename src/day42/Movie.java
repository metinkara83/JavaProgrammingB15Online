package day42;

public class Movie {

    String name;
    double length;
    String type;

    // default constructor:
    // a constructor that is given by compiler only if you do not have any constructor in your class
    // it is invisible and it has no parameter, it has no code inside

    public Movie(){
        System.out.println("Empty Movie");
    }

    // write a constructor to set all the fields value


    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
