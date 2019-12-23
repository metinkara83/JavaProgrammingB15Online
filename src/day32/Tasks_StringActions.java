package day32;

public class Tasks_StringActions {

    public static void main(String[] args) {

        reversePrintMyOwnName();
        reversePrintAnyName("Abdurrezzak");
        printLastCharacterOfName("Mahmut");
        printFullNameInformation("Sylvia", "Dostoyevski");
        compareNameCharacterCount("Metin","Okan");
        printZtoA();
        printAlphabetInRange('T','G');
        printProductInfo("Fire", "HD", 8, 79.99f);

    }

//        reversePrintMyOwnName
//        * create a method that has no parameter
//        and print your name in reversed order

    public static void reversePrintMyOwnName (){
        String myName = "Metin";
        String reversed = "";
        for (int i = myName.length()-1 ; i >= 0 ; i--) {
            reversed += myName.charAt(i)+"";
        }
        System.out.println(reversed);
    }

//        reversePrintAnyName
//        * create a method that has 1 String parameter called name
//        and print that name in reversed order

    public static void reversePrintAnyName (String name){
        String reversed = "";
        for (int i = name.length()-1 ; i >= 0 ; i--) {
            reversed += name.charAt(i)+"";
        }
        System.out.println(reversed);
    }

//        printLastCharacterOfName
//        * create a method that has 1 String parameter called name
//        and print last character of that name

    public static void printLastCharacterOfName (String name){
        char lastCharacter = name.charAt(name.length()-1);
        System.out.println(lastCharacter);
    }

//      printFullNameInformation
//      * create a method that has 2 String parameter called firstName,lastName
//      and print "Your first name is firstName , Your last Name is lastName
//      print " your full name length is lengthOfTheFullName"

    public static void printFullNameInformation (String firstName, String lastName) {
        String fullName = firstName+" "+lastName;
        System.out.println("Your first name is "+firstName+" , Your last name is "+lastName+".");
        System.out.println("Your full name length is "+fullName.length());
    }

//      compareNameCharacterCount
//      * create a method that has 2 String parameter called name1,name2
//	    if name 1 has more characters
//      print " name 1 is longer "
//            if name 2 has more characters
//      print " name 2 is longer "
//            if name 2 has same character count
//      print " name 1 and name 2 same character count"

    public static void compareNameCharacterCount (String name1, String name2) {
        if (name1.length()>name2.length()){
            System.out.println(name1+" is longer");
        }
        else if (name2.length()>name1.length()){
            System.out.println(name2+" is longer");
        }
        else {
            System.out.println(name1+" and "+name2+" same character count");
        }
    }

//      printZtoA
//      * create a method that has no parameter
//      and print Z-A in one line

    public static void printZtoA (){
        for (char i = 'Z'; i >= 'A' ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

//      printAlphabetInRange
//      * create a method that have 2 char as parameters: beginning, ending
//      if beginning character is before ending character
//	    for example beginning A , ending D  -->> ABCD
//      if beginning character is after ending character
//	    for example beginning D , ending A  -->> DCBA

    public static void printAlphabetInRange (char beginning, char ending){
        if (beginning<=ending){
            for (char i = beginning; i <=ending ; i++) {
                System.out.print(i+" ");
            }
        }
        else {
            for (char j = beginning; j >= ending ; j--) {
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }

//      turn it into a method called printProductInfo
//      this method  have 4 parameters and print any product information

    public static void printProductInfo (String productName, String model, int version, float price){
        System.out.println("I saw " + productName + " " + model +" "+ version + " hands-free with Alexa for " + price);
    }

}
