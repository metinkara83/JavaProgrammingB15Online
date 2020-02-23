package day52.warmUp;

public class Account implements Transferable, Comparable<Account>{

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    @Override
    public void transferAll(Account otherAccount){
//        otherAccount.deposit(this.balance);
//        this.withdraw(balance);
        otherAccount.balance += this.balance;
        this.balance = 0;
    }

    public boolean isPalindrome(){
        String nameCopy = this.name.toLowerCase().replace(" ","");
        String reverseResult = "";
        for (int x = nameCopy.length()-1 ; x >= 0 ; x--){
            reverseResult += ""+nameCopy.charAt(x);
        }
        if (reverseResult.equals(nameCopy)){
            return true;
        }
        return false;
    }
    // add logic to compare by balance
    @Override
    public int compareTo(Account otherAccount){
        if(this.balance>otherAccount.balance){
            return 1;
        }
        else if (this.balance<otherAccount.balance){
            return -1;
        }
        else {
            return 0;
        }
    }

}
