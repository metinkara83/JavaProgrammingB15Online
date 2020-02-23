package day59;

public class General {

    public static void main(String[] args) {

        System.out.println("The Start");
        String str = "";

        // if you have multi try catch block
        // The most specific type (child type) should come first
        // The more generic type (super type) should come last
        try{
            System.out.println(str.charAt(0));
            System.out.println("End of Try");
        } catch (NullPointerException bla){
            System.out.println("No Object Here");
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("This is the rest of exceptions");
        }
        System.out.println("The End");


    }
}
