package com.assignment02.firstproject._pass_thibichloanChung;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BasicCalculatorTest {

	@Test
	public void testAddZero() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		//assertEquals(bcal.addition(0.0, 0.0),0,0);
		assertEquals(bcal.addition(x, 0),x,0);	
	}
	
	@Test
	public void testAddPosNumbers() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble();
	
		assertEquals(bcal.addition(x, y), x+y ,0);	
	}
	
	@Test
	public void testAddNegNumbers() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble()* (-1);
	
		assertEquals(bcal.addition(x, y), x+y ,0);	
	}

}
