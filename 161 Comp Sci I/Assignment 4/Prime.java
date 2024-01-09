import java.util.Scanner;

public class Prime{
	public static void main(String[] args){
		int number;
		Scanner keyboard = new Scanner(System.in); //declare scanner instance

		//collect number from user
		System.out.print("Enter a numer to test if prime:");
		number = keyboard.nextInt();

		//if true then its prime else it's not prime
		if (isPrime(number)){
			System.out.println("The number is a prime number.");
		}
		else{
			System.out.println("The number is NOT a prime number.");
		}

	}
	
	 // if the remainder is not equal to zero then return true
    public static boolean isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}