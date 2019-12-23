package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        int[] ages = new int[]{3,5,11,33,77,85};
        int itemCount = ages.length;
        System.out.println("itemCount = "+itemCount);
        System.out.println("ages = " + ages);

        for (int x = 0; x < itemCount ; x++) {
            System.out.print(ages[x]+" ");
        }
        System.out.println();

        int[] areaCode = {703,404,470,300};
        // if you do it this way: IT MUST HAPPEN IN ONE LINE TOGETHER
        for (int x = 0; x < areaCode.length ; x++) {
            System.out.print(areaCode[x]+" ");
        }
    }
}
