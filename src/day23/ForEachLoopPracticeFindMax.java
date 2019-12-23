package day23;

public class ForEachLoopPracticeFindMax {

    public static void main(String[] args) {

        long[] salaries={85000L, 60000L, 125000L, 95000L, 110000L};
        // I need to pick up an item from this array so I can compare with other items
        // since first one is right there, I just decided to pick it up
        // and make it temporarily the max value
        // can I pick 2nd and 3rd instead -->> YES YOU CAN!!!
        long maxSalary=salaries[0];
        for (long salary : salaries) {
            // check the current salary is more than max
            if(salary > maxSalary) {
                // if so replace the existing value of max with current bigger salary
                maxSalary = salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);
    }
}
