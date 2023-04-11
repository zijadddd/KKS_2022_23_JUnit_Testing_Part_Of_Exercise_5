package ptf.kks;

public class Calculator {
	public static double InchToCentimeters(double inch) {
		return inch*2.54;
	}
	
	public static double FahrenheitToCelsius(double fahrenheit) {
		if (fahrenheit < (-459.67)) throw new IllegalArgumentException("The Fahrenheit temperature value cannot go bellow OK.");
		if(fahrenheit == 0) return 0;
		return Math.round(((fahrenheit - 32) / 1.8)*100.0)/100.0;
	}
	
	public static int Factorial(int n) {
		if(n < 0) throw new IllegalArgumentException("The n value cannot be less than 0.");
		int factorial = 1;
		for(int i = 1; i <= n; i++) factorial *= i;
		return factorial;
	}
}
