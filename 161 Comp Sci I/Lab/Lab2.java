import java.util.Scanner;
// Write a program that asks the user to enter three test scores. The program should display
// each test score, as well as the average of the scores.

public class Lab2{
	public static void main(String[] args){
		double score1,score2,score3; // declare variable

		Scanner keyboard = new Scanner(System.in); // Declare scanner object

		System.out.print("Enter user test score 1:"); // Ask user to enter test score 1
		score1 = keyboard.nextDouble(); // take user input 1

		System.out.print("Enter user test score 2 :"); // Ask user to enter test score 2
		score2 = keyboard.nextDouble(); // take user input 2

		System.out.print("Enter user test score 3:"); // Ask user to enter test score 3
		score3 = keyboard.nextDouble(); // take user input 3

		// display each test score and average score
		System.out.println("Score 1: "+score1);
		System.out.println("Score 2: "+score2);
		System.out.println("Score 3: "+score3);
		System.out.println("Average score: "+ (score1 + score2 + score3) / 3); 
	}
}