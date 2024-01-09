public class Celsius{
	public static void main(String[] args){
		//display output
		System.out.printf("Fahrenheit \t\t Celsius\n");
		System.out.printf("=================================\n");
		for (int i=0; i<=20;i++){
			System.out.printf(i + "\t\t %.2f\n",celsius(i));
		}
	}

	//method to calculate celsius
	public static double celsius(double f){
		return 5.0/9.0 * (f - 32.0);
	}

}