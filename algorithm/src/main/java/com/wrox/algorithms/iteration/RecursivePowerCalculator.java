package com.wrox.algorithms.iteration;

public class RecursivePowerCalculator {

	public RecursivePowerCalculator() {
	}

	public Integer powerCalculator(int base, int exponent) {
		assert base >= 0 : "base can't be < 0";
		assert exponent >= 0 : "exponent can't be < 0";

/*		if (exponent == 0)
			return 1;
		else if (exponent == 1) {
			return base;
		} else {
			return base * powerCalculator(base, exponent - 1);
		}*/
		
		return exponent > 0 ? base * powerCalculator(base, exponent-1) : 1 ;

	}

}
