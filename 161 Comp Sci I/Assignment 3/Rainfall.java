import java.util.*;

public class Rainfall{
	public static void main(String[] args){
		int yearNum,rainFall,rainFalls=0,months=0;

		Scanner keyboard = new Scanner(System.in);

		//ask for the number of years.
		System.out.print("Enter number of years: ");
		yearNum = keyboard.nextInt();
		while (yearNum < 1){
			System.out.print("Please enter number of years: ");
			yearNum = keyboard.nextInt();
		}

		//The outer loop will iterate once for each year.
		for(int i=1; i<=yearNum; i++){

			//The inner loop to iterate 12 times.
			for(int j=1; j<=12;j++){
				System.out.print("Enter the inches of rainfall for that month "+j+": ");
				rainFall = keyboard.nextInt();

				while (rainFall < 0){
					System.out.print("Please enter the inches of rainfall for that month "+j+": ");
					rainFall = keyboard.nextInt();
				}

				rainFalls += rainFall;
				months++;
			}
		}

		//display the number of months, the total inches of rainfall, and the average rainfall per month for the entire period.
		System.out.println("The number of months = "+months);
		System.out.println("The total inches of rainfall = "+rainFalls);
		System.out.println("The average rainfall per month for the entire period = " + (double)rainFalls / months);




	}
}