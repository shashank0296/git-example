package com.amdocs;

import java.util.Stack;

public class RPNCalculator {

	private Stack<Double> numberStack;
	private double firstNumber , secondNumber , result;
	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstNumber = secondNumber = result = 0.0;
		
	}
	public double calculate(String rpnMathExpression) {
		
		String[] rpnTokens = rpnMathExpression.split(" ");
		IMathOperation mathOperation = null;
		
		 for (String token : rpnTokens) {
			  
			 if(isMathOperator(token)) {
				 
				 mathOperation = MathFactory.getObject(token);
				 extractInput();
				 result = mathOperation.calculate(firstNumber,secondNumber);
				 
			 }
			 else 
				 numberStack.push(Double.parseDouble(token));
		 }
 		return numberStack.pop();
			 }
			
	
	private boolean isMathOperator(String tokenmathBinaryOperator) {
		String mathOperator = "+_*?/";
		return mathOperator.contains(mathOperator);
		
	}
 
	private void extractInput() {
		firstNumber = numberStack.pop();
		 secondNumber = numberStack.pop();
	}
	
	
	
	
}
