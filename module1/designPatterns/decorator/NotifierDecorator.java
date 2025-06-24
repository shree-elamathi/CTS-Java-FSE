package com.elamathi.cts.module1.designPatterns.decorator;

public abstract class NotifierDecorator implements Notifier{
	
	protected Notifier decoratedNotifier;
	
	public NotifierDecorator(Notifier decoratedNotifier) {
		this.decoratedNotifier = decoratedNotifier;
	}

}
