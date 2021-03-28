package com.assignment02.firstproject._pass_thibichloanChung;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bcal = new BasicCalculator();
		AdvancedCalculator acal = new AdvancedCalculator();
		
		System.out.println(bcal.addition(2.0, 2.0));
		System.out.println(bcal.division(2.0, 0.0));
		
		System.out.println(acal.absolutValue(-2));
		System.out.println(acal.squareRoot(4.0));
		
		System.out.println(acal.multiplication(9.0, 2.0));
		
		System.out.println(acal.getSign(-2));
		System.out.println(acal.subtraction(10.0, 2.0));
	}

}
