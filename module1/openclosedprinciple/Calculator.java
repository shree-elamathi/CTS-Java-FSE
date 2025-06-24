package com.elamathi.cts.module1.openclosedprinciple;

import java.security.InvalidParameterException;

public class Calculator {
	
	public void calculate(CalculatorOperation operation) {
		if (operation == null) {
			throw new InvalidParameterException("Enter a valid operation");
		}
		
		operation.perform();
		
	}

}
