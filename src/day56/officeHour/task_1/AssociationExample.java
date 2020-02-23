package day56.officeHour.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        create a class called AssociationExample:
//        create 5 objects of the students class
//        create a List of students called CybertekStudents and store those 5 objects into the List
//        create the object of the School and initialize school name to "Cybertek"
//        add two more new students "Denis" and "Irina" to cybertek school' student list
//        use for each loop to print out entire cybertek student' names

public class AssociationExample {

    public static void main(String[] args) {
        Student s1 = new Student("Taha");
        Student s2 = new Student("Said");
        Student s3 = new Student("Metin");
        Student s4 = new Student("Okan");
        Student s5 = new Student("Huseyin");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println(list);

        School cybertek = new School("Cybertek",list);
        System.out.println(cybertek.AllStudentsList);
        cybertek.addNewStudent(new Student ("Denis"));
        cybertek.addNewStudent(new Student ("Irina"));
        System.out.println(list);

        for (Student each : cybertek.AllStudentsList) {
            System.out.println(each);
        }

        System.out.println(cybertek);
    }

}
