package com.amdocs;

import java.util.HashMap;

public class MathFactory {
	private static HashMap<String,String>() classNameMap;
	static {
		classNameMap = new HashMap<String, String>();
		classNameMap.put("+","com.amdocs.Addition");
		classNameMap.put("-","com.amdocs.Subtract");
		classNameMap.put("*","com.amdocs.Multiply");
		classNameMap.put("/","com.amdocs.Division");
		}
	public static IMathOperation getObject(String binaryMathOperator) {
		
		
		
		
		
		IMathOperation mathOperation = null;
		String classNmae = classNameMap.get(binaryMathOperator);
		mathOperation = Class.forName(className).newInstance();
		
		try {
			mathOperation = (IMathOperation) Class.forName(className).newInstance();
		}
		catch{
			e.printStackTrace();
		}
		catch{
			e.printStackTrace();
		}
		catch{
			e.printStackTrace();
		}
		return matchOperation;
	}
}
