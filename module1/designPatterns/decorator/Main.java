package com.elamathi.cts.module1.designPatterns.decorator;

public class Main {
	public static void main(String[] args) {
		
		Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMS
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate with Slack
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Final output: Email -> SMS -> Slack
        slackNotifier.send();
		
	}

}
