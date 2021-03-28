package com.assignment02.firstproject._pass_thibichloanChung;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations{

	public double square(double number) {
		double result = number * number;
		return result;
	}

	public double absolutValue(double number) {
		double result = Math.abs(number);
		return result;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}

	public double squareRoot(double number) {
		double result = Math.sqrt(number);
		return result;
	}

	public double getSign(double number) {
		double result = Math.signum(number);
		return result;
	}

}
