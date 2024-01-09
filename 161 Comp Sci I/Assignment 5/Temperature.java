public class Temperature {
    private double ftemp;

	// Constructor to initialize the Temperature object with a Fahrenheit temperature.
    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFahrenheit() {
        return this.ftemp;
    }
	// Convert the Fahrenheit temperature to Celsius.    
    public double getCelsius() {
        return (5.0 / 9.0) * (this.ftemp - 32);
    }

	 // Convert the Fahrenheit temperature to Kelvin.
    public double getKelvin() {
        return ((5.0 / 9.0) * (this.ftemp - 32)) + 273.15;
    }
}
