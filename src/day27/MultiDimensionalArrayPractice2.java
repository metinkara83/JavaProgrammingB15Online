package day27;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {


        String[] developersTeam = {"Vladislav" , "Hasan" , "Tolkun" , "Abide"};
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi" , "Nursultan"};
        String[] businessAnalysisTeam = {"Lisa" , "Ershad" , "Naila"};

        String[][] scrumTeam = {developersTeam,testersTeam,businessAnalysisTeam};

        int maxLength = scrumTeam[0][0].length();
        String longestString = "";

        for(String[] each1DArray  :  scrumTeam  ){
            for (String eachElement  : each1DArray ){
                if(maxLength < eachElement.length() ){
                    maxLength = eachElement.length();
                    longestString = eachElement;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(longestString);
    }
}
