// Create a class Account with data member as Balance
// create two constructors no arguments and two arguments
// and perform deposite withdraw and display opertaions
import java.util.Scanner;

public class Account {
    private double balance;
    private int accountNo;

    // Constructor to initialize balance and account holder
    public Account(double balance, int accountNo) {
        this.balance = balance;
        this.accountNo = accountNo;
    }

    // Method to deposit the amount to the account
    public void deposit() {
        double amount;
        System.out.println("Enter amount to deposit");
        Scanner scanner = new Scanner(System.in);
        amount=scanner.nextDouble();
        if (amount > 0) {

            balance += amount;
            System.out.println("Deposited " + amount + " successfully.");

        }
    }

    // Method to withdraw the amount from the account
    public void withdraw() {
        double amount;
        System.out.println("Enter amount to withdraw");
        Scanner scanner = new Scanner(System.in);
        amount=scanner.nextDouble();

        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Account number: " + accountNo);
        System.out.println("Current Balance: " + balance);
    }


    public static void main(String[] args) {
        Account account = new Account(1000, 1022080911);
        account.deposit();
        account.displayBalance();
        account.withdraw();
        account.displayBalance();

    }
}

