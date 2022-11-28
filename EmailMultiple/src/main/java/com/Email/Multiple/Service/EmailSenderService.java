package com.Email.Multiple.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailsender;
	
	public void sendEmail(String to,String subject,String text) {
		SimpleMailMessage mailmessage=new SimpleMailMessage();
		mailmessage.setFrom("chintadajayasurya1999@gmail.com");
		mailmessage.setTo(to);
		mailmessage.setSubject(subject);
		mailmessage.setText(text);
		mailsender.send(mailmessage);
		System.out.println("mail send..............");
	}
}
