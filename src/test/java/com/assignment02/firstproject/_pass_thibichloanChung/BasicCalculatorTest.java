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
		assertEquals(bcal.addition(x, 0), x ,0);	
	}
	
	@Test
	public void testAddPositiveNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		
		assertEquals(bcal.addition(x, y), (x+y) ,0);	
	}
	
	@Test
	public void testAddNegativeNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble()* (-1);
		
		assertEquals(bcal.addition(x, y), (x+y) ,0);	
	}
	
	@Test
	public void testAddNegPosN() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble();
	
		assertEquals(bcal.addition(x, y), (x+y) ,0);	
	}
	
	@Test
	public void testSubZero() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
	
		assertEquals(bcal.subtraction(x, 0), x ,0);	
	}
	@Test
	public void testSubPositiveNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble();
	
		assertEquals(bcal.subtraction(x, y), (x-y) ,0);	
	}
	
	@Test
	public void testSubNegativeNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble()* (-1);
	
		assertEquals(bcal.subtraction(x, y), (x-y) ,0);	
	}
	
	@Test
	public void testSubNegPosN() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble()* (-1);
	
		assertEquals(bcal.subtraction(x, y), (x-y) ,0);	
	}
	
	@Test
	public void testMultiZero() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
	
		assertEquals(bcal.multiplication(x, 0), 0 ,0);	
	}
	
	@Test
	public void testMultiPositiveNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble();
	
		assertEquals(bcal.multiplication(x, y), (x*y) ,0);	
	}
	
	@Test
	public void testMultiNegativeNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble()* (-1);
	
		assertEquals(bcal.multiplication(x, y), (x*y) ,0);	
	}
	
	@Test
	public void testDivZero() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
	
		assertEquals(bcal.division(x, 0), 1e10, 0);	
	}
	
	@Test
	public void testDivPositiveNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble();
	
		assertEquals(bcal.division(x, y), (x/y), 0);	
	}
	@Test
	public void testDivNegativNbrs() {
		BasicCalculator bcal = new BasicCalculator();
		Random rd = new Random();
		double x = rd.nextDouble();
		double y = rd.nextDouble()* (-1);
	
		assertEquals(bcal.division(x, y), (x/y), 0);	
	}
	
	

}
