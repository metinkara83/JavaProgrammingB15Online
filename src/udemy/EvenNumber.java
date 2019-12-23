package udemy;

public class EvenNumber {

    public static void main(String[] args) {
        int num = 4;
        int count = 0 ;
        int finishNumber = 20;
        while (num <= finishNumber){
            if (isEvenNumber(num)){
                System.out.println(num+" is an even number");
                count++;
            }
            if (count == 5){
                break;
            }
            num++;
        }
        System.out.println("The total number of even numbers are: "+count);
    }

    public static boolean isEvenNumber (int number){
        if (number %2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
