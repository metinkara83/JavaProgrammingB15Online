package selfPracticeTests;

public class Replit187 {

    public static String lameDb(String db, String op,String id,String data)
    {
        String result = "";
        String[] splitted = db.split("#");
        if (op.equals("add")){
            for (int i = 0 ; i < splitted.length ; i++){
                result += splitted[i]+"#";
            }
            result += id+data;
        }
        else if (op.equals("edit")){
            for (int i = 0 ; i < splitted.length ; i++){
                if (!splitted[i].substring(0,1).equals(id)){
                    result += splitted[i];
                    if (i!=splitted.length-1){
                        result += "#";
                    }
                }
                else {
                    result += id+data;
                    if (i!=splitted.length-1){
                        result+="#";
                    }
                }
            }
        }
        else if (op.equals("delete")){
            for (int i = 0 ; i < splitted.length ; i++){
                if (!splitted[i].substring(0,1).equals(id)){
                    result += splitted[i];
                    if ((i+1)!=splitted.length-1){
                        result += "#";
                    }
                }
                else if (i==0){
                    result += "#";
                }
            }
        }
        else if (op.equals("none")){
            for (int i = 0 ; i < splitted.length ; i++){
                result += splitted[i];
                if (i!=splitted.length-1){
                    result += "#";
                }
            }
        }
        return result;
    }//end lameDb


    public static void main(String[] args)
    {


        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","3","xxx")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","3","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","3","")+"\n"
        );

    }
}
