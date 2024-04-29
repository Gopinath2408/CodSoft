import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Invalid deposit amount.");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}

class ATM {
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Please select an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdrawMenu();
                    break;
                case 2:
                    depositMenu();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private void withdrawMenu() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (bankAccount.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: " + bankAccount.checkBalance());
        }
    }

    private void depositMenu() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (bankAccount.deposit(amount)) {
            System.out.println("Deposit successful. Updated balance: " + bankAccount.checkBalance());
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: " + bankAccount.checkBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);  // Initial balance of $1000
        ATM atm = new ATM(userAccount);
        atm.menu();
    }
}