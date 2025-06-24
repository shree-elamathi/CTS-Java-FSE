package com.elamathi.cts.module1.designPatterns.singleton;

public class Logger {
	
	private static Logger instance;
	
	private Logger() {
		System.out.println("Logger instantiated");
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
		
	}
	
	public void log(String message) {
		System.out.println("Log: " + message);
	}

}
