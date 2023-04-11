package ptf.kks;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void testInchToCentimeters() {
		assertEquals(5.08, Calculator.InchToCentimeters(2), DELTA);
		assertEquals(0, Calculator.InchToCentimeters(0), DELTA);
	}

	@Test
	public void testFahrenheitToCelsius() {
		assertEquals(86.11, Calculator.FahrenheitToCelsius(187), DELTA);
		assertEquals(0, Calculator.FahrenheitToCelsius(0), DELTA);
		assertThrows(IllegalArgumentException.class, () -> Calculator.FahrenheitToCelsius(-460));
	}
	
	@Test
	public void testFactorial() {
		assertEquals(120, Calculator.Factorial(5), DELTA);
		assertEquals(1, Calculator.Factorial(0), DELTA);
		assertThrows(IllegalArgumentException.class, () -> Calculator.Factorial(-2));
	}

}
