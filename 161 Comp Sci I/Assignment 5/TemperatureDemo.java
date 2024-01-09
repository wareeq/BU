import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please Enter Temperature:");
        double userTemp = keyboard.nextDouble();

        Temperature temp = new Temperature(userTemp);

        // Display result in Celsius and Kelvin
        System.out.printf("Celsius equivalent: %.2f \n", temp.getCelsius());
        System.out.printf("Kelvin equivalent: %.2f \n", temp.getKelvin());

        // Close the Scanner to prevent resource leaks
        keyboard.close();
    }
}
