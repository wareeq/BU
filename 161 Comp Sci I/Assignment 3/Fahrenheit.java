public class Fahrenheit{
	public static void main(String[] args){
		// display table header
		System.out.println("Celsius temprature\tFahrenheit equivalents");
		System.out.println("_____________________________________________");

		// loop temperature
		for(int i=0;i<=20;i++){
			System.out.printf(i +"\t\t\t %.1f\n",(i * 9.0/5.0)+ 32.0);
		}
	}
}