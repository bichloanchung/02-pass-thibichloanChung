package com.assignment02.firstproject._pass_thibichloanChung;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator acal = new AdvancedCalculator();
	Random rd = new Random();

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
	public void testSquarePositiveNum_1() {
		double x = rd.nextDouble();
		double result = x * x;
		
		assertTrue(acal.square(x) == result);
	}

}
