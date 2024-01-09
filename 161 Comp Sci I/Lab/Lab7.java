import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab7{
	public static void main(String[] args) throws FileNotFoundException{
        SavingsAccount account = new SavingsAccount(500.00, 0.05); // Starting balance $500, 5% interest rate

        // Process deposits
        File depositFile = new File("Deposits.txt");
        if (depositFile.exists()) {
            Scanner depositScanner = new Scanner(depositFile);
            while (depositScanner.hasNextDouble()) {
                double depositAmount = depositScanner.nextDouble();
                account.deposit(depositAmount);
            }
            depositScanner.close();
        } else {
            System.out.println("Deposits.txt file not found.");
        }

        // Process withdrawals
        File withdrawalFile = new File("Withdraws.txt");
        if (withdrawalFile.exists()) {
            Scanner withdrawalScanner = new Scanner(withdrawalFile);
            while (withdrawalScanner.hasNextDouble()) {
                double withdrawalAmount = withdrawalScanner.nextDouble();
                account.withdraw(withdrawalAmount);
            }
            withdrawalScanner.close();
        } else {
            System.out.println("Withdrawals.txt file not found.");
        }

        // Add monthly interest
        account.addInterest();

        // Display the ending balance and total interest earned
        System.out.printf("Ending Balance: $%.2f\n", account.getBalance());
    }
}
