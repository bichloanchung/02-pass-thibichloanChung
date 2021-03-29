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
		if (Double.isNaN(result)) {
			System.out.println("Do you want to raise the power values of negative number?");
			return 1e15;
		}
		return result;
	}

	public double squareRoot(double number) {
		double result = Math.sqrt(number);
		if (Double.isNaN(result)) {
			System.out.println("We can not get square root values of negative number!");
			return 1e20;
		}
		return result;
	}

	public double getSign(double number) {
		double result = Math.signum(number);
		return result;
	}

}
