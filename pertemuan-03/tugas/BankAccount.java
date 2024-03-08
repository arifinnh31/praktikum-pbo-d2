/* 
 * File      : BankAccount.java    07/03/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File Kelas BankAccount
 */

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $" + MIN_BALANCE);
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    public double getBalance() {
        return balance;
    }
}