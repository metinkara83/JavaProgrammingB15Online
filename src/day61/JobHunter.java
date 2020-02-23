package day61;

import java.util.*;

public class JobHunter {

    public static void main(String[] args) {

        List<Job> jobList = new LinkedList<>();
        Job j1 = new Job("Florida", 135000, "SunTrust");
        Job j2 = new Job("Georgia", 127000,"Mercedes-Benz");
        Job j3 = new Job("Texas", 124000,"Visa");
        Job j4 = new Job("North Carolina",115000,"Bank of America");
        Job j5 = new Job("Indiana",129000,"Valeo");
        jobList.addAll(Arrays.asList(j1,j2,j3,j4,j5));

        System.out.println("Before sorting "+jobList);
        // How does the sort method know how to sort?
        // It uses the comparing logic provided inside
        // compareTo(Job o) method then sort them accordingly
        Collections.sort(jobList);
        System.out.println("After sorting "+jobList);
        // Comparator.reverseOrder() will give you an object with reversed comparing logic
//        Collections.sort(jobList,Comparator.reverseOrder());
//        System.out.println("After 2nd sorting "+jobList);

        // Collections.reverseOrder() will also give you an object with reversed comparing logic
        Collections.sort(jobList,Collections.reverseOrder());
        System.out.println("After 3rd sorting "+jobList);
    }
}
