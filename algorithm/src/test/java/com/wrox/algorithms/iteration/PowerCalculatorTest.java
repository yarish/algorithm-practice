package com.wrox.algorithms.iteration;

import junit.framework.TestCase;

public class PowerCalculatorTest extends TestCase {
	PowerCalculator calculator = PowerCalculator.INSTANCE;

	public void testAnythingRaisedTothePowerOfZeroIsOne() {
		assertEquals(1, calculator.calculate(0, 0));
		assertEquals(1, calculator.calculate(1, 0));
		assertEquals(1, calculator.calculate(27, 0));
		assertEquals(1, calculator.calculate(143, 0));
	}

	public void testAnythingRiasedToThepowerOfOneIsItself() {
		assertEquals(0, calculator.calculate(0, 1));
		assertEquals(1, calculator.calculate(1, 1));
		assertEquals(27, calculator.calculate(27, 1));
		assertEquals(143, calculator.calculate(143, 1));
	}

/*	public void testNegativeExponent() {
		assertEquals(1, calculator.calculate(0, -1));
		assertEquals(1, calculator.calculate(1, -2));
		assertEquals(1, calculator.calculate(27, -100));
		assertEquals(1, calculator.calculate(143, -235));
	}*/

	public void testAritary() {
		assertEquals(0, calculator.calculate(0, 2));
		assertEquals(1, calculator.calculate(1, 2));
		assertEquals(4, calculator.calculate(2, 2));
		assertEquals(8, calculator.calculate(2, 3));
		assertEquals(27, calculator.calculate(3, 3));
	}
}
