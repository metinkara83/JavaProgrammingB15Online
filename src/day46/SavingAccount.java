package day46;

public class SavingAccount extends BankAccount{
    
    double interestRate;

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {
        
        SavingAccount s1 = new SavingAccount("Mohammed",12345,50000,4.2);
        System.out.println("s1.toString() = " + s1.toString());
        
        s1.withdraw(10000);
        System.out.println("s1 = " + s1);
        s1.deposit(100);
        System.out.println("s1 = " + s1);
    }
    
    // in our SavingAccount, if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement
    @Override
    public void withdraw(int amount){
        super.withdraw(amount);
        //balance -= 30;
        super.withdraw(30);
        // balance -= (amount+30);
    }
    @Override
    public void deposit(int amount){
        super.deposit((int)(amount * (1+(this.interestRate/100))));
    }

    @Override  // it is optional, once being used, it will enforce overriding rule
    // if any rule does not match, it will not even compile
    // so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
