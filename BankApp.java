import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs. " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal failed.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Current balance: Rs. " + balance);
        } else {
            balance -= amount;
            System.out.println("Rs. " + amount + " withdrawn successfully.");
        }
    }

    // Display details
    public void displayDetails() {
        System.out.println("--------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("--------------------------------");
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Bank Account Management System ===");
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Deposit Amount: Rs. ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accNo, name, initialBalance);
        System.out.println("\nAccount Created Successfully!");

        int choice;
        do {
            System.out.println("\n--- Operations Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance / Account Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double dep = scanner.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double with = scanner.nextDouble();
                    account.withdraw(with);
                    break;
                case 3:
                    account.displayDetails();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking services!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}