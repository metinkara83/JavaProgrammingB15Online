package day44;

public class CourseCreator {

    public static void main(String[] args) {

        System.out.println("Course.counter = " + Course.counter);

        Course c1 = new Course("Java","Foundation");
        System.out.println("c1.counter = " + c1.counter);
        
        Course c2 = new Course("Selenium","Automation");
        Course c3 = new Course("SQL","Database");
        Course c4 = new Course("API","WebServices");
        Course c5 = new Course("Agile","SoftSkills");
        System.out.println("c5.counter = " + c5.counter);

        System.out.println("Course.counter = " + Course.counter);
    }
}
