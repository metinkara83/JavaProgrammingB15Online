package day45;

public class Earth extends Planet {

    int population;

    // Practical usage of super() keyword to call super class constructor is
    // to reuse the functionality of super class constructor in sub class constructor
    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
        this.population = population;
    }

    public static void main(String[] args) {
        Earth e1 = new Earth(9.81,5000,true,100000);
        System.out.println("e1 = " + e1);
    }

    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }
}
