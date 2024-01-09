/*

Using the JOptionPane class learnt in class to get input from a user and display the outputs,
solve the following problem:
A cookie recipe calls for the following ingredients:
• 1.5 cups of sugar
• 1 cup of butter
• 2.75 cups of flour
The recipe produces 48 cookies with these amounts of the ingredients. Write a program
that asks the user how many cookies he or she wants to make, and then displays the number
of cups of each ingredient needed for the specified number of cookies.
Note: No need to worry about the number format for this question (e.g. if you get a number like
0.4166666666663, then just leave it as it is.)

*/

import javax.swing.*;

public class Lab3{
	public static void main(String[] args){
		Double sugar=1.5/48,
				butter=1.0/48,
				flour=2.75/48;

		String str = JOptionPane.showInputDialog(null,"Enter amount of cookies you wants:"); //store number of cookies
		Double cookieAmount = Double.parseDouble(str);
		JOptionPane.showMessageDialog(null,"You need following\nCup of sugar:"+(cookieAmount*sugar)+"\nCup of butter:"	+(cookieAmount*butter)+"\nCup of flour:"+(cookieAmount*flour));

	System.exit(0);
	}
}