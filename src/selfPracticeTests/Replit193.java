package selfPracticeTests;
import java.util.*;
public class Replit193 {

    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0 ; i < r1.length ; i++){
            result.add(r1[i]);
        }
        result.add(" ");
        for (int j = 0 ; j < r2.length ; j++){
            result.add(r2[j]);
        }
        return result.toString();


    }
}
