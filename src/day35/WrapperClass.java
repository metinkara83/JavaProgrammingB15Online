package day35;

public class WrapperClass {

    public static void main(String[] args) {
        
        float f6 = Float.parseFloat("3.14f");
        print(f6);

        String sentence = "I bought 3 tomato and the price was 3.14 each";
        // How much did you pay total??
        // The count is always 3rd word
        // The price is always at 2nd word from the last
        String[] splitted = sentence.split(" ");
        float price = Float.parseFloat(splitted[splitted.length-2]);
        int count = Integer.parseInt(splitted[2]);
        float total = (float) count * price;
        System.out.println(total);
    }

    private static void print(float f6) {
    }
}
