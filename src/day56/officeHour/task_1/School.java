package day56.officeHour.task_1;

import java.util.Arrays;
import java.util.List;

//        create a class called School:
//        instance variables: String schoolName
//        List<Student> AllStudentsList;
//        initialize instance variables within a constructor
//        create a method called addNewStudent() that can add students to the AllStudentsList

public class School {

    String schoolName;
    List<Student> AllStudentsList;

    public School (String schoolName,List<Student> AllStudentsList ){
        this.schoolName=schoolName;
        this.AllStudentsList=AllStudentsList;
    }

    public void addNewStudent(Student student){
        this.AllStudentsList.add(student);
    }

    public void addNewStudent(Student[] students){
        this.AllStudentsList.addAll(Arrays.asList(students));
    }

    public void addNewStudent(List<Student> list){
        this.AllStudentsList.addAll(list);
    }

    public String toString(){
        return ""+AllStudentsList;
    }
}
