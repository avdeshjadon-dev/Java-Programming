// ------------------- 8. Static Members in Different Contexts -------------------
//
// Write a Java program to create a class called "BankAccount" with instance variables
// 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'.
// Provide static methods to get and set the static variables. Create several 'BankAccount'
// objects and print their details along with the static variables.
//
// ------------------- SAMPLE OUTPUT -------------------
// Bank Name: ABC Bank
// Interest Rate: 5.0
// Account Number: 101
// Balance: 5000.0
//
// Bank Name: ABC Bank
// Interest Rate: 5.0
// Account Number: 102
// Balance: 3000.0


package JavaStaticMembers;

class BankAccount {
    private String accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static String setBankName(String name) {
        bankName = name;
        return name;
    }

    public static double setInterestRate(double rate) {
        interestRate = rate;
        return rate;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class JavaStaticMember8 {
    public static void main(String[] args) {
        BankAccount.setBankName("National Bank");
        BankAccount.setInterestRate(3.5);

        BankAccount account1 = new BankAccount("123456789", 1000.00);
        BankAccount account2 = new BankAccount("987654321", 2000.00);

        account1.printDetails();
        System.out.println();
        account2.printDetails();
    }
}
