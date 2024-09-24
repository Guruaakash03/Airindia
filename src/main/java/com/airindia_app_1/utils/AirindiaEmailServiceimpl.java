package com.airindia_app_1.utils;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class AirindiaEmailServiceimpl implements AirindiaEmailService {

	@Autowired
	private JavaMailSender sender;//javamailsender comes from mail dependency
	@Override
	public void EmailServices(String to, String sub, String text) {

		SimpleMailMessage msg = new SimpleMailMessage();//Simplemailmessage comes from mail dependency
		msg.setTo(to);
		msg.setSubject(sub);
		msg.setText(text);
		sender.send(msg);
	}

}
