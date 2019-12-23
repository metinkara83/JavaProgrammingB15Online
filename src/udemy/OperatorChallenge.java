package udemy;

public class OperatorChallenge {
    public static void main(String[] args) {
        double value1 = 20d;
        double value2 =80d;
        double value3;
        value3 = (value1 + value2) *100;
        System.out.println(value3);
        double value4 = value3%40d;
        System.out.println(value4);
        boolean remainder = (value4==0) ? true : false;
        System.out.println("The boolean remainder is :"+remainder);
        if (remainder){

        } else {
            System.out.println("Got some remainder");
        }
    }
}
