package day52.warmUp;

import day52.warmUp.Account;

public class AccountAction {

    public static void main(String[] args) {

    Account a1 = new Account("John Snow",10000);
    Account a2 = new Account("Hannah",7000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after = " + a1);
        System.out.println("a2 after = " + a2);

        a1.deposit(50000);
        a1.withdraw(10000);

        a2.transferAll(a1);
        System.out.println("a1 after 2nd transfer = " + a1);
        System.out.println("a2 after 2nd transfer = " + a2);

        System.out.println(a1.isPalindrome());
        System.out.println(a2.isPalindrome());

    }
}
