package com.sahar.CalculatorProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	public void testAddition() {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 10);
		Assertions.assertEquals(15, result);
	}

	@Test
	public void testSubtraction() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(10, 5);
		Assertions.assertEquals(5, result);
	}

	@Test
	public void testMultiplication() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(5, 10);
		Assertions.assertEquals(50, result);
	}

	@Test
	public void testDivision() {
		Calculator calculator = new Calculator();
		double result = calculator.divide(10, 5);
		Assertions.assertEquals(2.0, result);
	}
}
