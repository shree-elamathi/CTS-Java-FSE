package com.elamathi.cts.module1.designPatterns.decorator;

public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier decoratedNotifier) {
		super(decoratedNotifier);
	}

	@Override
	public void send() {
		decoratedNotifier.send();
		System.out.println("Sms is sent");
		
	}
	

}
