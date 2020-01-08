package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {

    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurun");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);

        // find longest name
        // assume the first one is the longest then compare with the rest
        String longest = nameLst.get(0);

        for (int x = 0; x < nameLst.size() ; x++) {
            String currentName = nameLst.get(x);
            if (currentName.length()>longest.length()){
                longest = currentName;
            }
        }
        System.out.println("longestName = " + longest);

        // How do I get the concatenation of all longest words if there are more than one
        // first find out the longest word and get the character count
        // then loop through each name and check whether character count equal to longest word character count
        for (int i = 0; i < nameLst.size() ; i++) {
            if (nameLst.get(i).length()==longest.length()){
                System.out.println("Longest Words = " + nameLst.get(i));
            }
        }
        
        // How do we use for each loop to go through each items
        for (String currentName : nameLst) {
            System.out.println("currentName = " + currentName);
        }
    }
}
