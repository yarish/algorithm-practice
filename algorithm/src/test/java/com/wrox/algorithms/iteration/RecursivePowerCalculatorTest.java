package com.wrox.algorithms.iteration;

import junit.framework.TestCase;

public class RecursivePowerCalculatorTest extends TestCase {

	RecursivePowerCalculator calculator ;
	
	@Override
		protected void setUp() throws Exception {
		 calculator = new RecursivePowerCalculator();
		}
	
	public void testpowerCalculator() {
		
		assertSame(1, calculator.powerCalculator(0, 0));
		assertSame(1, calculator.powerCalculator(10, 0));
		assertSame(0, calculator.powerCalculator(0, 1));
		assertSame(10, calculator.powerCalculator(10, 1));
		
		assertSame(8, calculator.powerCalculator(2, 3));
		assertSame(27, calculator.powerCalculator(3, 3));
		assertSame(64, calculator.powerCalculator(4, 3));
		assertSame(125, calculator.powerCalculator(5, 3));
		assertEquals(new Integer(216), calculator.powerCalculator(6, 3));
		assertEquals(new Integer(1000), calculator.powerCalculator(10, 3));
	}

}
