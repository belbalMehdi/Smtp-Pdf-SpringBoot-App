package com.example.demo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailSender {
	public MailSender() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private JavaMailSender javaMailSender;
	public void send(String to,String subject,String body){
		try {
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setSubject(subject);
			mail.setTo(to);
			mail.setText(body);
			javaMailSender.send(mail);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
