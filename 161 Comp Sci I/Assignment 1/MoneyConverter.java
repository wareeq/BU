import java.util.Scanner;
/*
Write a program that reads from the user an amount of money (for example, the user may enter 3.87), 
and converts that amount into its equivalent in dollars, quarters, dimes, nickels, and pennies. 
So, if the input is 3.87, then the output should look like:

$ 3.87 is equivalent to:
Dollar(s): 3
Quarter(s): 3
Dime(s): 1
Nickel(s): 0
Penny(s): 2

Hint: converter 3.87 to integer 387 first, then use division operator "/" to get quotient and modulus operator "%" to get remainder.

Further Instructions for question 3: use Scanner class for user input.
*/

public class MoneyConverter{
	public static void main (String[] args){

		double amount;
		Scanner keyboard = new Scanner(System.in); //Create a scanner object

		System.out.print("Enter any amount: $"); // ask user to enter amount
		amount = keyboard.nextDouble(); // store user input to variable

		int cents = (int)(amount * 100); // convert amount to cent by multipling by 100;
		int dollar = (int)(cents / 100); // divide total cent by 100 to get dollar
		cents -= dollar * 100; //remove dollar from total cents

		int quarter = cents / 25 ; // divide by 25 to get quarter
		cents -= quarter * 25; //remove quarter from total cents

		int dime = cents / 10 ; // divide by 10 to get dime
		cents -= dime * 10; //remove dime from total cents

		int nickel = cents / 5; // divide by 5 to get nickels
		cents -= nickel * 5; //remove nickel from total cents

		int penny = cents; // remaining penny is equivalent to cent.

		//output equivalents
		System.out.println("$"+amount+" is equivalent to:");
		System.out.println("Dollar(s): "+dollar);
		System.out.println("Quarter(s): "+quarter);
		System.out.println("Dime(s): "+dime);
		System.out.println("Nickel(s): "+nickel);
		System.out.println("Penny(s): "+penny);



	}
}