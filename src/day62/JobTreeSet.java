package day62;

import day61.Job;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        SortedSet<Job> jobList = new TreeSet<>();
        Job j1 = new Job("Florida", 135000, "SunTrust");
        Job j2 = new Job("Georgia", 127000,"Mercedes-Benz");
        Job j3 = new Job("Texas", 124000,"Visa");
        Job j4 = new Job("North Carolina",115000,"Bank of America");
        Job j5 = new Job("Indiana",129000,"Valeo");
        jobList.addAll(Arrays.asList(j1,j2,j3,j4,j5));

        System.out.println("jobList = " + jobList);

        for (Job each : jobList) {
            System.out.println("each = " + each);
        }
    }
}
