package com.jbk.service;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
//private static void sendAttach(String to,String subject,String msg) {
//		
//	}
public boolean sendEmail(String to,String subject,String msg) {
	boolean f=false;
	String host="smtp.gmail.com";
	String from="ravikiran.masule@gmail.com";
	Properties properties=System.getProperties();
	System.out.println("properties"+properties);
	properties.put("mail.smtp.host", host);
	properties.put("mail.smtp.port", "465");
	properties.put("mail.smtp.ssl.enable", "true");
	properties.put("mail.smtp.auth", "true");
	properties.put("mail.smtp.starttls.required", "true");
	properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
	
//	sendAttach(to,subject,msg);
	Session session=Session.getInstance(properties, new Authenticator() {

		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			
			return new PasswordAuthentication("ravikiran.masule@gmail.com","turtlesrace");
		}
	});
	session.setDebug(true);
	MimeMessage m=new MimeMessage(session);
	try {
		m.setFrom(from);
		m.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
		m.setSubject(subject);
		m.setText(msg);
		Transport.send(m);
//		String path="C:\\Users\\RAVIKIRAN\\Pictures\\Saved Pictures\\img.jpg";
//		MimeMultipart mimeMultipart = new MimeMultipart();
//		MimeBodyPart filemime = new MimeBodyPart();
//		MimeBodyPart textmime = new MimeBodyPart();
//		try {
//			textmime.setText(msg);
//			File file=new File(path);
//			filemime.attachFile(file);
//			mimeMultipart.addBodyPart(textmime);
//			mimeMultipart.addBodyPart(filemime);
//			
//		} catch (Exception e) {
//		 e.printStackTrace();
//		}
//		m.setContent(mimeMultipart);
		
		System.out.println("send successfully");
		f=true;
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
	
}
}
