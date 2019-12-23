package day31;

public class MethodPractice2 {

    public static void count1to10() {

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        count1to10();
//        System.out.println();
        count1to10();

        nameCaller("Metin");

        // write piece of reusable code to count from 1 to 10
        // give a name count1to10                               : methodName
        // no need for object when being called                 : static
        // it should be accessible anywhere in your project     : public
        // it does not return any value                         : void
        // does not need any external data when being called    : (nothing inside)
    }

    public static void nameCaller(String myName){

        String updated = "";

        for (int i = 0; i < myName.length() ; i++) {
            updated += myName.substring(i,i+1)+"-";
        }

        System.out.println(updated);

    }
}
