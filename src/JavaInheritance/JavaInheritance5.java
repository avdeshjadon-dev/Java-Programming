// ------------------- 5. Method Overriding with Condition -------------------
//
// Write a Java program to create a class known as "BankAccount" with methods
// called deposit() and withdraw(). Create a subclass called SavingsAccount that
// overrides the withdraw() method to prevent withdrawals if the account balance
// falls below one hundred.
//
// ------------------- SAMPLE OUTPUT -------------------
// Deposit successful. Balance: 500
// Withdrawal successful. Balance: 300
// Withdrawal denied. Minimum balance of 100 must be maintained.


package JavaInheritance;

class BankAccount {
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdrawl(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance :");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
class SavingAccount extends BankAccount {
    SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    void withdrawl(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of ₹100 required!");
        } else {
            super.withdrawl(amount);
        }
    }
}
public class JavaInheritance5 {
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. PNB1324) with initial balance of ₹23422.34:");
        SavingAccount PNB1324=new SavingAccount("PNB1324",23422.34);
        System.out.println("Deposited amount : 10000");
        PNB1324.deposit(10000);
        System.out.println("New balance after depositing ₹1000: ₹" + PNB1324.getBalance());
        System.out.println("Withdraw ₹600 from account PNB1324:");
        PNB1324.withdrawl(6000);
        System.out.println("New balance after withdrawl ₹600: ₹" + PNB1324.getBalance());
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of ₹450:");
        SavingAccount SA1234 = new SavingAccount("SA1234", 450);
        SA1234.withdrawl(300);
        System.out.println("Balance after trying to withdraw ₹300: ₹" + SA1234.getBalance());
        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of ₹300:");
        SavingAccount SA1000 = new SavingAccount("SA1000", 300);
        System.out.println("Try to withdraw ₹250 from SA1000!");
        SA1000.withdrawl(250);
    }
}
