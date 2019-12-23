package day21;

public class Task1_NamePrinter {

    public static void main(String[] args) {
        // Given your name stored in a variable myName as String
        // for example : "My name is YourName":
        // 1, loop through each and every character, print them out like this ;
        // M->y-> >n->a->m->e-> and so on, put arrow in between the characters
        // Optionally,
        // 2, print the sentence by 2 character at a time just by incrementing 1
        // 3, print the sentence by 3 character at a time
        // 4, print the sentence by 4 character at a time
        String myName = "My name is Metin";
        String arrowMyName = "";

        for (int x=0 ; x<=myName.length()-1; x++) {
            arrowMyName += myName.substring(x,x+1)+"->";
        }
        System.out.println(arrowMyName);

        for (int i=0 ; i<=myName.length()-2; i++){
           System.out.println(myName.substring(i,i+2));
        }
        for (int y=0 ; y<=myName.length()-3; y+=3){
            System.out.println(myName.substring(y,y+3));
        }
        for (int z=0 ; z<=myName.length()-4; z+=4){
            System.out.println(myName.substring(z,z+4));
        }
    }
}
