package day52.warmUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("John Snow", 10000));
        accountList.add(new Account("Vald", 11000));
        accountList.add(new Account("Svetlana", 13000));
        accountList.add(new Account("Muhammed", 8000));
        accountList.add(new Account("Emme", 17000));
        accountList.add(new Account("Ata", 15000));

        System.out.println("accountList before = \n" + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = \n" + accountList);

        // Create another account with your name
        // transfer everyone's money to your account

        Account mine = new Account ("Metin",35000);
        for (Account eachAccount : accountList) {
            eachAccount.transferAll(mine);
        }
        System.out.println("myAccount = " + mine);
        System.out.println("accountList = " + accountList);

        // What can be the data type of a1
        /**
         * Account a1;
         * Comparable a1;
         * Transferable a1;
         * Objact a1;
         *
         * An object can be referred by
         *       it's own type
         *       it's super class type
         *       interface type that it implemented
         */

        Account a1 = new Account("Polymorphism1",10000);
        Transferable t1 = new Account("Polymorphism2",10000);
        Comparable c1 = new Account("Polymorphism3",10000);
        Object o1 = new Account("Polymorphism4",10000);
    }
}
