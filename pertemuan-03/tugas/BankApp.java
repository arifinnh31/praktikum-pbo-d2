/* 
 * File      : BankApp.java    07/03/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Main Program BankApp
 */

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\nBank Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine();
                    try {
                        account.withdraw(withdrawalAmount);
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    scanner.close();
                    System.out.println("\nGoodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            while (true) {
                System.out.print("\nDo you want to continue? (y/n): ");
                String answer = scanner.nextLine();
                // System.out.println();
                if (answer.toLowerCase().equals("y")) { 
                    break;
                } else if (answer.toLowerCase().equals("n")) {
                    scanner.close();
                    System.out.println("\nGoodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid answer");
                }
            }
        }
    }
}