// 1. Sum of Numbers
// Write a program that asks the user for a positive nonzero integer value. 
// The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, 
// if the user enters 50, the loop will find the sum of 1, 2, 3, 4,.. 50.
import java.util.Scanner;

public class Lab4{
	public static void main(String[] args){
		int num,sum=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a positive nonzero integer: "); //asks the user for a positive nonzero integer value. 
		num = keyboard.nextInt();

		//input validation
		while(num <= 0){
			System.out.print("Re-enter a positive nonzero integer: "); //asks the user for a positive nonzero integer value. 
			num = keyboard.nextInt();
		}

		//sum
		for (int i = 0;i<=num;i++){
			// System.out.print(i);
			sum+=i;
		}
		System.out.println("Sum:"+sum);

	}
}