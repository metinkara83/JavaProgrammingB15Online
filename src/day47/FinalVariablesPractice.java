package day47;

public class FinalVariablesPractice {

    public static void main(String[] args) {

        // declaring and initializing a variable
        // declaring and assigning initial value
        int x = 10;
        // re-assigning new value to the variable
        // storing | giving new value to the variable
        // changing the original value of the variable
        x = 100;

        // declaring and initializing a final variable
        // declaring and assigning initial value to a final variable
        final int a = 20;
        // re-assigning new value to the final variable -- ERROR !!!!!
        // a = 200;

        final Student s1 = new Student(101);

        // the below does not work as the address in s1 is locked
        // with final keyword
        // cannot reassigned the value because it's final
        // Student s1 = new Student(102);

        // you can still change internal data attached to the object
        // as long as it is the same object s1 pointing to
        // as long as the address does not change
        // s1.studentID=200;
        System.out.println(s1.studentID);

        System.out.println(Student.SCHOOL);
        // cannot reassign value because it's final
        // Student.school="abc";

        System.out.println(Byte.MAX_VALUE);

        // PI in Java
        System.out.println(Math.PI);

    }

    /**
     * a void methid that accept a number and print out doubled number
     * @param x
     */
    // anywhere we declare a variable we have option to make it final (including method parameter)
    // making method parameter final,
    // it will make the method only use the argument user passed without modifying it;
    public static void printDoubledNumber(final int x){
//        x = x*2;
//        System.out.println("x*2 = " + x);
        System.out.println("x*2 = " + x*2);
    }
}
