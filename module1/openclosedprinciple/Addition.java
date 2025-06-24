package com.elamathi.cts.module1.openclosedprinciple;

public class Addition implements CalculatorOperation {
	
	private double left;
	private double right;
	private double result = 0.0;
	
	Addition(double left, double right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		result = left + right;
		
	}
	
	public double getResult() {
		return result;
	}
	
	
	
	

}
