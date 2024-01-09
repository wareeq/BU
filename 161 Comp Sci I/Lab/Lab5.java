import java.util.*;
import java.io.*;

public class Lab5{
	public static void main(String[] args)throws IOException{
		//declare varible outside
		int number;

		//create scanner and printwriter object. 
		Scanner keyboad = new Scanner(System.in);
		PrintWriter file = new PrintWriter(new FileWriter("output.txt"));

		//asks the user for a positive integer no greater than 15
		System.out.print("Enter a number between 1 and 15:");
		number = keyboad.nextInt();

		//validate input
		while (number < 1 || number > 15){
			System.out.print("Please enter a number between 1 and 15:");
			number = keyboad.nextInt();
		}

		//for each true condition print one row of x
		for (int i = 1; i <= number;i++){
			for (int j = 1; j <= number;j++){
				file.print("X");
			}
			file.print("\n");
		}

		//close PrintWriter
		file.close();
	}

}