import javax.swing.JOptionPane;

public class softwareSales{
	public static void main(String[] args) {
        double amount, totalPrice, discount;

        String str = JOptionPane.showInputDialog(null, "Enter Number of packages purchased:"); // Ask the user how many they purchased
        amount = Double.parseDouble(str); // Parse input using wrapper

        totalPrice = amount * 99; // Store the total amount price

        if (amount >= 10 && amount <= 19) {
            discount = totalPrice * 0.2; // Calculate discount
            JOptionPane.showMessageDialog(null, "Amount: " + amount + "\nDiscount: 20%\nTotal: $" + String.format("%.2f", (totalPrice - discount))); // Display amount, discount, and total
        } else if (amount >= 20 && amount <= 49) {
            discount = totalPrice * 0.3; // Calculate discount
            JOptionPane.showMessageDialog(null, "Amount: " + amount + "\nDiscount: 30%\nTotal: $" + String.format("%.2f", (totalPrice - discount))); // Display amount, discount, and total
        } else if (amount >= 50 && amount <= 99) {
            discount = totalPrice * 0.4; // Calculate discount
            JOptionPane.showMessageDialog(null, "Amount: " + amount + "\nDiscount: 40%\nTotal: $" + String.format("%.2f", (totalPrice - discount))); // Display amount, discount, and total
        } else if (amount >= 100) {
            discount = totalPrice * 0.5; // Calculate discount
            JOptionPane.showMessageDialog(null, "Amount: " + amount + "\nDiscount: 50%\nTotal: $" + String.format("%.2f", (totalPrice - discount))); // Display amount, discount, and total
        } else {
            JOptionPane.showMessageDialog(null, "Amount: " + amount + "\nTotal: $" + String.format("%.2f", totalPrice)); // Display amount without discount
        }
        System.exit(0);
    }
}