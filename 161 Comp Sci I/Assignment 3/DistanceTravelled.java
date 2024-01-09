import java.util.*;

public class DistanceTravelled{
	public static void main(String[] args){
		int speed,hours;
		//Create scanner object to take input
		Scanner keyboard = new Scanner(System.in);

		//asks for the speed of a vehicle (in miles-per-hour)
		System.out.print("Enter the speed of vehicle (in miles-per-hour): ");
		speed = keyboard.nextInt();

		//Do not accept a negative number for speed
		while(speed < 0){
			System.out.print("Please enter a speed of vehicle greater than zero: ");
			speed = keyboard.nextInt();
		}


		System.out.print("Enter the number of hour(s): ");
		hours = keyboard.nextInt();

		//do not accept any value less than 1 for time.
		while(hours < 1){
			System.out.print("Please enter the number of hour(s): ");
			hours = keyboard.nextInt();
		}

		//display report
		System.out.println("HOURS \tDISTANCE");
		for(int i = 1; i <= hours; i++){
			System.out.println(i+"\t"+ i*speed);
		}
	}

}