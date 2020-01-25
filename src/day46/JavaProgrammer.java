package day46;

public class JavaProgrammer extends Programmer{

    @Override
    void code(){
        System.out.println("I code Java!!!");
    }

    @Override
    void test(){
        super.test();
        System.out.println("We do test in JUnit");
    }

    void drinkCoffee(){
        System.out.println("Java Programmer is drinking coffee");
    }

    void doRepl(){
        System.out.println("Java Programmer is doing repl");
    }

    void doJavaDevelopment(){
        System.out.println("Java Programmer is doing Java Development");
    }
}
