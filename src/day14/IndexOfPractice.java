package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        // indexOf -->>
        // find out index of another String inside this String
        String name = "Game of Java";
        // find out the location of Java
        // find out the location of letter "O"
        // find out the location of first space
        System.out.println("find the location of Java");
        System.out.println(name.indexOf("Java"));

        System.out.println("find the location of o");
        System.out.println(name.indexOf("o"));

        System.out.println("find the location of O");
        System.out.println(name.indexOf("O"));

        System.out.println("find the location of a");
        System.out.println(name.indexOf("a"));
        // find out the location of the first space
        System.out.println("find the location of first space");
        System.out.println(name.indexOf(" "));


    }
}
