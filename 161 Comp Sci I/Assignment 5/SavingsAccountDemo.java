import java.util.Scanner;

public class SavingsAccountDemo {
    public static void main(String[] args) {
        // Declare variables
        double balance, annualRate, amountDeposited, amountWithdrawn;
        double totalDeposits = 0.0, totalWithdrawn = 0.0, totalInterest = 0.0;

        // Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);

        // Prompt user for the initial savings
        System.out.print("Enter the savings account's starting balance: ");
        balance = keyboard.nextDouble();

        System.out.print("Enter the savings account's annual interest rate: ");
        annualRate = keyboard.nextDouble();

        // SavingsAccount object with the provided initial details
        SavingsAccount acct = new SavingsAccount(balance, annualRate);

        // Prompt user for the number of months that have passed since the account was opened
        System.out.print("How many months have passed since the account was opened? ");
        int month = keyboard.nextInt();

        // Iterate through each month, performing transactions and calculations
        for (int x = 1; x <= month; x++) {
            System.out.printf("Enter the amount deposited during month %d: ", x);
            amountDeposited = keyboard.nextDouble();

            System.out.printf("Enter the amount withdrawn during month %d: ", x);
            amountWithdrawn = keyboard.nextDouble();

            // Update the SavingsAccount object based on user input
            acct.deposit(amountDeposited);
            totalDeposits += amountDeposited;
            acct.withdraw(amountWithdrawn);
            totalWithdrawn += amountWithdrawn;
            
            // Calculate and add monthly interest to the balance
            acct.addInterest();
            totalInterest += acct.calcInterest();
        }

        // Display the final results
        System.out.printf("\nEnding balance: $%.2f \n", acct.getBalance());
        System.out.printf("Total deposited: $%.2f \n", totalDeposits);
        System.out.printf("Total withdrawn: $%.2f \n", totalWithdrawn);
        System.out.printf("Interest earned: $%.2f \n", totalInterest);
    }
}
