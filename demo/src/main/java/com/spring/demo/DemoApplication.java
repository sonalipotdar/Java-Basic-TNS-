
package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		MessageSender emailSender = new EmailMessageSender();

		NotificationServiceWithDependencyInjection emailService =
				new NotificationServiceWithDependencyInjection(emailSender);

		emailService.sendNotification("Welcome to loose coupling!");

		MessageSender smsSender = new SmsMessageSender();

		NotificationServiceWithDependencyInjection smsService =
				new NotificationServiceWithDependencyInjection(smsSender);

		smsService.sendNotification("This message uses SMS.");
	}
}
