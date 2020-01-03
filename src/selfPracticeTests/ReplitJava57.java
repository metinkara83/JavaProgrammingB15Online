package selfPracticeTests;

public class ReplitJava57 {

    public static String surroundStr (String s, String search_term) {

        String updated = "";
        String term = "";

//        for (int i = 0; i < s.length(); ) {
            term = "("+search_term+")";
            updated = s.replace(search_term, term);
//            if (s.substring(i, i + search_term.length()).equals(search_term)) {
//                updated += term;
//                i += search_term.length();
//            }
//            else {
//                updated += s.substring(i, i + 1);
//                i++;
//            }
//        }
        return updated;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surroundStr("abcabcabc","abc")); //"(abc)(abc)(abc)"
        System.out.println(surroundStr("there, on planeth hoth","th")); //"(th)ere, on plane(th) ho(th)"
 //       System.out.println(surroundStr("sakjdlkjsl kjfkdkieufkdkms,mvklds kjdklsjkvjkld","jk"));
        System.out.println(surroundStr("How does coding work?","does coding work"));
    }
}
