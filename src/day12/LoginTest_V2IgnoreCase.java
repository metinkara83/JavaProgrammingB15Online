package day12;

import jdk.swing.interop.SwingInterOpUtils;

public class LoginTest_V2IgnoreCase {

    public static void main(String[] args) {

        String userName = "aBc123";

        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
        System.out.println(nameCheckIgnoreCase);

        String name = "Metin";
        String lastName = "Kara";
        String fullName = name + " "+lastName;

        boolean CheckCaseSensitive = fullName.equals("METIN KARA");
        System.out.println(CheckCaseSensitive);

        boolean CheckIgnoreCase = fullName.equalsIgnoreCase("METIN KARA");
        System.out.println(CheckIgnoreCase);

    }
}
