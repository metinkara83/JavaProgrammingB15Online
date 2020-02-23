package day49;

// interface is like a contract, once someone sign a contract he/she will provide all the details that he/she must do
public interface Edible {

    // In interface fields are automatically public static final if not defined so.
    // public static final field naming convention is ALL_CAPS!!!
    // you can have as many constants as you want
    public static final boolean IS_HUMAN_FOOD = true;

    // If a method with no body is not defined public abstract, it is automatically public abstract
    public abstract void eat();
    public abstract void drink();

    // default method was added since Java 8 to provide
    // default implementation to not break existing implementing classes
    // classes have option to use it as is
    // or override it according to their own requirements
    // the default method only exists in an interface !!!
    // default keyword here is not an access modifier
    // Implicitly the method is public if you do not specify public
    public default void digest(){
        System.out.println("You implement the code yourself");
    }
}
