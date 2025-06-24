package com.elamathi.cts.module1.designPatterns.decorator;

public class EmailNotifier implements Notifier {
	
	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Email is sent");
	}

}
