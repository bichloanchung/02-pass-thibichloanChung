package com.assignment02.firstproject._pass_thibichloanChung;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator acal = new AdvancedCalculator();
	Random rd = new Random();
	
	//test square methods
	
	@Test
	public void testSquareZero() {
		double x = 0;
		
		assertEquals(acal.square(x), 0 , 0);
	}
	
	@Test
	public void testSquarePositiveNum() {
		double x = rd.nextDouble();
		double result = x * x;
		
		assertEquals(acal.square(x), result , 0);
	}
	
	@Test
	public void testSquareNegativeNum() {
		double x = rd.nextDouble() * (-1);
		double result = x * x;
		
		assertEquals(acal.square(x), result , 0);
	}
	
	// test absolutValue methods
	
	@Test
	public void testAbsValueZero() {
		double x = 0;
		
		assertEquals(acal.absolutValue(x), 0 , 0);
	}
	
	@Test
	public void testAbsValuePositiveNum() {
		double x = rd.nextDouble();
		
		assertEquals(acal.absolutValue(x), Math.abs(x) , 0);
	}
	
	@Test
	public void testAbsValueNegativeNum() {
		double x = rd.nextDouble() * (-1);
		
		assertEquals(acal.absolutValue(x), Math.abs(x) , 0);
	}
	
	// test raisedToThePowerOf methods
	
	@Test
	public void testRaisedPowerZero() {
		double x = rd.nextDouble();
		
		assertEquals(acal.raisedToThePowerOf(x, 0) , 1,  0);
	}
	
	@Test
	public void testRaisedPowerPositiveNum() {
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		double result = Math.pow(x, y);
		
		assertEquals(acal.raisedToThePowerOf(x, y) , result,  0);
	}
	
	@Test
	public void testRaisedPowerNegativeNum() {
		double x = rd.nextDouble();
		double y = rd.nextDouble() * (-1);
		double result = Math.pow(x, y);
		
		assertEquals(acal.raisedToThePowerOf(x, y) , result,  0);
	}
	
	@Test
	public void testRaisedPowerNegativeNum_1() {
		double x = rd.nextDouble() * (-1);
		double y = rd.nextDouble() * (-1);
		double result = Math.pow(x, y);
		
		assertEquals(acal.raisedToThePowerOf(x, y) , result,  0);
	}
	
	@Test
	public void testRaisedPowerNegativeNum_2() {
		double x = rd.nextDouble() * (-1);
		double y = rd.nextDouble();
		double result = Math.pow(x, y);
		
		assertEquals(acal.raisedToThePowerOf(x, y) , result,  0);
	}
	
	// test squareRoot methods
	
	@Test
	public void testSqrtZero() {
		double x = 0;
		
		assertEquals(acal.squareRoot(x), 0, 0);
	}
	
	@Test
	public void testSqrtPositiveNum() {
		double x = rd.nextDouble();
		
		assertEquals(acal.squareRoot(x), Math.sqrt(x), 0);
	}
	
	@Test
	public void testSqrtNegativeNum() {
		double x = rd.nextDouble() * (-1);
		
		assertEquals(acal.squareRoot(x), Math.sqrt(x), 0);
	}
	
	// test getSign methods
	
	@Test
	public void testSignZero(){
		double x = 0;
		
		assertEquals(acal.getSign(x), 0, 0);
	}
	
	@Test
	public void testSignPositiveNum(){
		double x = rd.nextDouble();
		//double result = Math.signum(x);
		//System.out.println(result);
		assertEquals(acal.getSign(x), +1.0, 0);
	}
	
	@Test
	public void testSignNegativeNum(){
		double x = rd.nextDouble() * (-1);
		//double result = Math.signum(x);
		//System.out.println(result);
		assertEquals(acal.getSign(x), -1.0, 0);
	}
	
	
	
	
	
	

}
