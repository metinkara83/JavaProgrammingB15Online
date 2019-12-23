package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {

        String name = "I love Java I Love Java Java Java";

        // get the second Java from the sentence
        // assume you already know there is 4 Java in this sentence
        // second Java means -->> the Java showed up after first Java

        // first find out where is location of the first Java showed up
        // in order to find second one, instead of searching from beginning,
        // search from right after the location you found first Java
        // then it will give you the index of second Java,
        //
        // but how do I start from different location when using IndexOf, because index of always start from the beginning
        // indexOf method has 2 versions, 1 expect 1 external data, another expect 2 external data
        // yourString.indexOf()
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java", name.indexOf("Java")+1));

        // How do i start from the location that get past first Java
        // basically starting point different that 0 so that it get past first Java

        int firstJavaLocation = name.indexOf("Java"); // location of first Java, in this case 7
        // starting point can be right after the index of first character of the word
        // or you can start here +4
        // or you can start right after you finish the word you are searching, for the word Java +4
        // if we do not know the length of the word -->> +word.length()

        int startingPointToSearchSecondJava = firstJavaLocation + 1;
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        // I do not know how many words in this sentence. i only know there are more than 3+ words
        // I just want to know what is the second word
        // the word in between first space and the second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation+1);
        System.out.println("Second word in this sentence is :" + name.substring(firstSpaceLocation+1,secondSpace));


    }
}
