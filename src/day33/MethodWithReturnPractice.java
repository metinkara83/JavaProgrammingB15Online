package day33;

public class MethodWithReturnPractice {

    public static void main(String[] args) {

        /**
         * getDaysOfTheWeekFromNumber
         * This method will take number from 1-7
         * and convert that to actual day in word
         * parameter dayCode as int to represent day in number
         * return the day in word in English as string
         * if the number is not valid return FUNDAY
         */

        System.out.println(getDaysOfTheWeekFromNumber(8));

    }

    public static String getDaysOfTheWeekFromNumber (int dayCode){
        String day = "";
        switch (dayCode) {
            case 1:
                day ="Monday";
                break;  // if you remove break; you can use return "Monday" instead of day = "Monday";
            case 2:
                day= "Tuesday";
                break;
            case 3:
                day= "Wednesday";
                break;
            case 4:
                day= "Thursday";
                break;
            case 5:
                day= "Friday";
                break;
            case 6:
                day= "Saturday";
                break;
            case 7:
                day= "Sunday";
                break;
            default:
                day= "Funday";
                break;
        }
        return day;
    }
}
