package com.elamathi.cts.module1.designPatterns.decorator;

public class SlackNotifierDecorator extends NotifierDecorator{
	

	public SlackNotifierDecorator(Notifier decoratedNotifier) {
		super(decoratedNotifier);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send() {
		decoratedNotifier.send();
		System.out.println("Slack is sent");
		
	}
	
}
