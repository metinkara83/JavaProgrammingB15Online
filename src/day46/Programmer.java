package day46;

// Programmer as super class
// JavaProgrammer     SQLProgrammer
// please override code and test under sub classes
// JavaProgrammer
    // unique behaviour : drinkCoffee, doRepl, doJavaDevelopment
//SQLProgrammer
    // unique behaviour : writeSQLQuery, createDatabase()

// Overriding is unique for instance method
// There is no concept of overriding for anything other than instance method

public class Programmer {

    void code(){
        System.out.println("any programmer code");
    }

    void test(){
        System.out.println("any programmer test");
    }
}
