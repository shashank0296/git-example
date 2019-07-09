package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {
	
	@Test
	public void testSimpleAddition() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("10 12 +");
		double expectedResult = 22.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpnCalculator.calculate("10 2 + 100 5 / *");
		expectedResult = 240.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	@Test
public void testSimpleSubStract() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("10 12 -");
		double expectedResult = -2.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpnCalculator.calculate("100 80 -");
		expectedResult = 20.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	@Test
public void testSimpleDivision() {
	
	RPNCalculator rpnCalculator = new RPNCalculator();
	
	double actualResult = rpnCalculator.calculate("10 2 /");
	double expectedResult = 5.0;
	
	assertEquals(expectedResult, actualResult, 0.0001);
	
	
	actualResult = rpnCalculator.calculate("100 20 /");
	expectedResult = 5;
	
	assertEquals(expectedResult, actualResult, 0.0001);
}
	@Test
	public void testSimpleMultiplication() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("10 2 *");
		double expectedResult = 20.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
		actualResult = rpnCalculator.calculate("100 20 *");
		expectedResult = 2000.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
	}
	@Test
public void testComplexRPNExpression() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double actualResult = rpnCalculator.calculate("10 2 + 100 5 / *");
		double expectedResult = 240.0;
		
		assertEquals(expectedResult, actualResult, 0.0001);
		
		
	}	
	
}
