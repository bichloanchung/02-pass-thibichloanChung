package com.assignment02.firstproject._pass_thibichloanChung;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bcal = new BasicCalculator();
	Random rd = new Random();

	@Test
	public void testAddZero() {
		double x = rd.nextDouble();
		
		assertEquals(bcal.addition(x, 0), x, 0);	
	}
	
	@Test
	public void testAddPositiveNbrs() {
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		double result = x + y;
		
		assertEquals(bcal.addition(x, y), result ,0);	
	}
	
	@Test
	public void testAddNegativeNbrs() {
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble()* (-1);
		double result = x + y;
		
		assertEquals(bcal.addition(x, y), result ,0);	
	}
	
	@Test
	public void testAddNegPosN() {
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble();
		double result = x + y;
	
		assertEquals(bcal.addition(x, y), result, 0);	
	}
	
	@Test
	public void testSubZero() {
		double x = rd.nextDouble();
	
		assertEquals(bcal.subtraction(x, 0) , x , 0);	
	}
	@Test
	public void testSubPositiveNbrs() {
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		double result = x - y;
	
		assertEquals(bcal.subtraction(x, y), result ,0);	
	}
	
	@Test
	public void testSubNegativeNbrs() {
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble()* (-1);
		double result = x - y;
	
		assertEquals(bcal.subtraction(x, y), result ,0);	
	}
	
	@Test
	public void testSubNegPosN() {
		double x = rd.nextDouble();
		double y = rd.nextDouble()* (-1);
		double result = x - y;
	
		assertEquals(bcal.subtraction(x, y), result ,0);	
	}
	
	@Test
	public void testMultiZero() {
		double x = rd.nextDouble();
	
		assertEquals(bcal.multiplication(x, 0), 0, 0);	
	}
	
	@Test
	public void testMultiPositiveNbrs() {
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		double result = x * y;
	
		assertEquals(bcal.multiplication(x, y), result ,0);	
	}
	
	@Test
	public void testMultiNegativeNbrs() {
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble()* (-1);
		double result = x * y;
	
		assertEquals(bcal.multiplication(x, y), result, 0);	
	}
	
	@Test
	public void testMultiNegPosN() {
		double x = rd.nextDouble();
		double y = rd.nextDouble()* (-1);
		double result = x * y;
	
		assertEquals(bcal.multiplication(x, y), result ,0);	
	}
	
	@Test
	public void testDivZero() {
		double x = rd.nextDouble();
	
		assertEquals(bcal.division(x, 0), 1e10, 0);	
	}
	
	@Test
	public void testDivPositiveNbrs() {
		double x = rd.nextDouble();
		double y = rd.nextDouble();
		double result = x / y;
	
		assertEquals(bcal.division(x, y), result, 0);	
	}
	@Test
	public void testDivNegativNbrs() {
		double x = rd.nextDouble()* (-1);
		double y = rd.nextDouble()* (-1);
		double result = x / y;
	
		assertEquals(bcal.division(x, y), result, 0);	
	}
	
	@Test
	public void testDivNegPosN() {
		double x = rd.nextDouble();
		double y = rd.nextDouble()* (-1);
		double result = x / y;
	
		assertEquals(bcal.division(x, y), result, 0);	
	}
	
	

}
