package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		PdfGenerator pdf = new PdfGenerator("mehdi.pdf");
		MailSender mailSender = new MailSender();
		try {
			mailSender.send("belbalmehdi@gmail.com", "Testing java app", "Test Worked well thanks");
		} catch (Exception e) {
			System.out.println("Exception"+ e.getMessage());
		}
	}
}
