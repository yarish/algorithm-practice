package com.wrox.algorithms.iteration;

public class PowerCalculator {

	public static final PowerCalculator INSTANCE = new PowerCalculator();

	PowerCalculator() {

	}

	public int calculate(int base, int exponent) {
		assert exponent >  0  : "exponent can't be < 0";
		
		if( exponent <  0){
			System.out.println( "exponent can't be < 0");
		}
		
		int result = 1;

		for (int i = 0; i < exponent; ++i) {
			result = result * base;
		}

		return result;
	}

	public static void main(String[] args) {
		PowerCalculator calculator = PowerCalculator.INSTANCE;
		System.out.println(calculator.calculate(10, -2));
	}

}
