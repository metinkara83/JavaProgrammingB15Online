package day47;

public class Student {

    // final INSTANCE FIELD
    final int studentID;
    // public final static field with initial value set
    // This type of field name always suggested to make all UPPERCASE
    // to make it clear that this is a public static field that never change
    // other languages has specific term called CONSTANT for this
    // public static final String school = "Cybertek";
    // if interviewer asks how do I define CONSTANT in Java???
    // you would say I will create public static final field
    public static final String SCHOOL = "Cybertek";

    public Student(int studentID){
        this.studentID=studentID;
    }
}
