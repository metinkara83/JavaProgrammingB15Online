package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        /*
        create a long array or 5 items called salaries
        put your salary amounts that ok for your offer
        
        use for each loop to iterate over them and print them out
        
        Optionally; print only the salary more than 100K
         */

        long[] salaries={85000L, 60000L, 125000L, 95000L, 110000L};
        for (long eachSalary : salaries){
//            System.out.println("eachSalary = " + eachSalary);
//            if(eachSalary>100000) {
//                System.out.println("eachSalary more than 100000 = " + eachSalary);
//            }
            if(eachSalary<=100000){
                continue;
            }
            System.out.println("eachSalary = "+eachSalary);
        }
    }
}
