import java.util.Scanner;

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {

            balance = balance - amount;
            previousTransaction = -amount;

        }
    }

    void getPreviousTransaction() {

        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);

        } else if (previousTransaction < 0) {
            System.out.println("Withdrawed: " + Math.abs(previousTransaction));

        } else {
            System.out.println("No Transaction is occured");

        }

        // System.out.println("Previous Transaction: " + previousTransaction);

    }

    void showMenu() {
        char option = '\0';
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Name");
        customerName = s.nextLine();

        System.out.println("Enter your Account Number");
        customerId = s.nextLine();

        System.out.println("Welcome: " + customerName);
        System.out.println("Your Account Number is: " + customerId);
        System.out.println();

        do {

            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Show Previous Transaction");
            System.out.println("E. Exit");

            System.out.println("************************");
            System.out.println("Enter the option");
            System.out.println("************************");

            option = s.next().charAt(0);

            // Character.toUpperCase(option);

            switch (option) {
                case 'A':
                    System.out.println("************************");
                    System.out.println("Balance is: " + balance);
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("************************");
                    System.out.println("Enter the amount to deposit");
                    int amount = s.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("************************");
                    System.out.println("Enter the amount to withdraw");
                    int amount2 = s.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("************************");
                    getPreviousTransaction();
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("=============*End*=============");
                    break;

                default:
                    System.out.println("Invalid Option");

            }

        } while (option != 'E');

    }
}

public class Banking_Application {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        obj.showMenu();
    }
}