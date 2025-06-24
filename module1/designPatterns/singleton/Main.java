package com.elamathi.cts.module1.designPatterns.singleton;

public class Main {
	public static void main(String[] args) {
		Logger logger1 = Logger.getInstance();
		logger1.log("Application Started");
		
		Logger logger2 = Logger.getInstance();
		logger2.log("User logged in ");
		
		if (logger1 == logger2) {
			System.out.println("Both have the same reference");
		}
		else {
			System.out.println("Both have different reference");
		}
	}

}
