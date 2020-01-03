package day35;

public class StringToIntegerParsing {

    public static void main(String[] args) {
        
        // I have an employee ID : "FB-457"
        // give me the employee number and store it into a number
        
        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);
        
        String empID = "FB-457";
        /**
         * Integer class is a class coming from java.lang package
         * It is primarily used for wrapping up primitive value and treat it 
         * what we will focus here is though
         * many useful static methods it provide already
         * parseInt is a static method of Integer class
         * It will turn a String that has only numbers and return int result
         * if we have any non-numerical character -->> It will throw NumberFormatException
         */
        
        // int id = Integer.parseInt(empID.split("-")[1]);
        String[] empIDsplit = empID.split("-");
        int id = Integer.parseInt(empIDsplit[1]);
        System.out.println("id = " + id);

        // I have a String called twoNumbers
        // String twoNumbers ="100,600";
        String num1str = "100";
        String num2str = "600";
        // I want you to add them and give the result 700

        // In order to perform arithmetic operation, we must have numbers stored in INT
        // So first we need to turn String into Int
        // JDK already provide such methods and it comes from integer class from java.lang package
        // Integer.parseInt("YourNumberInString")
        int num1 = Integer.parseInt(num1str);
        int num2 = Integer.parseInt(num2str);
        System.out.println("sum of num1 and num2 = " + (num1+num2));
    }
}
