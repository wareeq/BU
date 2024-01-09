public class SavingsAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double amount, double annualInterestRate) {
        this.balance = amount;
        this.interestRate = annualInterestRate;
    }

    // Subtract the amount of withdrawal from the balance.
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // Add deposit to the balance.
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Add the monthly interest to the balance.
    public void addInterest() {
        this.balance += calcInterest();
    }

    // Return the monthly interest.
    public double calcInterest() {
        return (this.interestRate / 12) * this.balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
}