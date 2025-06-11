// ------------------- 6. Constructor with Validation -------------------
//
// Create a class called "Account" with instance variables accountNumber and balance.
// Implement a parameterized constructor with validation:
//   - accountNumber must be non-null and non-empty
//   - balance must be non-negative
// Print an error message if validation fails.
//
// ------------------- SAMPLE OUTPUT -------------------
// Valid Account:
// Account Number: 12345
// Balance: 1000.0
//
// Invalid Account (empty account number):
// Error: Account number cannot be null or empty
//
// Invalid Account (negative balance):
// Error: Balance cannot be negative

package JavaConstructor;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        if (accountNumber <= 0) {
            System.out.println("Error: Account number must be non-null and non-empty.");
            return;
        }
        if (balance < 0) {
            System.out.println("Error: Balance must be non-negative.");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Constructor6 {


    public static void main(String[] args) {
        Account myAccount = new Account(123212342, 65347.76);
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());
    }
}
