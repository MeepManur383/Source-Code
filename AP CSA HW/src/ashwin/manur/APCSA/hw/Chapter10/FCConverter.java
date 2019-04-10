package ashwin.manur.APCSA.hw.Chapter10;

public class FCConverter {
	private double fahrenheit;
	private double celsius;

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double getFahrenheit() {
		return (9.0 / 5) * celsius + 32; 
	}
	
	public double getCelsius() {
		return 5.0 / 9 * (fahrenheit - 32);
	}
}
