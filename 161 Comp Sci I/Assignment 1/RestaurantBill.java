import java.util.Scanner;
/*

13. Restaurant Bill
Write a program that computes the tax and tip on a restaurant bill. The program should ask
the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax
amount, tip amount, and total bill on the screen.

*/
public class RestaurantBill{
	public static void main(String[] args){

		double charges; //declare variables

		Scanner keyboard = new Scanner(System.in); // declare a scanner object for input
		System.out.print("Enter the total charge for meal:"); //display question for user
		charges = keyboard.nextDouble(); //store the user input in a variable

		//Display the meal charge, tax amount, tip amount, and total bill on the screen.
		System.out.println("The meal charge: $"+charges);
		System.out.println("The tax amount: $"+ 0.0675 * charges);
		System.out.println("The tip amount: $"+ 0.20 * charges);

	}
}