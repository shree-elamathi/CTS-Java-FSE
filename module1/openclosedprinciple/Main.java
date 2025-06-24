package com.elamathi.cts.module1.openclosedprinciple;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Addition addition = new Addition(10, 20);
		Subraction subraction = new Subraction(50, 30);
		
		calculator.calculate(addition);
		System.out.println("Result: " + addition.getResult());
		
		calculator.calculate(subraction);
		System.out.println("Result: " + subraction.getResult());
	}

}
