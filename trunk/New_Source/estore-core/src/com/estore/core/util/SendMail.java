package com.estore.core.util;



import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;


public class SendMail {

	public static final void sendMail(String to, String title, String content) {
		try {
			int addProvider = Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
			Properties props = System.getProperties();
			props.setProperty("mail.smtp.host", "smtp.gmail.com");
			props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
			props.setProperty("mail.smtp.socketFactory.fallback", "false");
			props.setProperty("mail.smtp.port", "465");
			props.setProperty("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.auth", "true");
			final String username = "noreply.estore@gmail.com";
			final String password = "12378976224";
			Session session = Session.getDefaultInstance(props,
					new Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username,
									password);
						}
					});

			// -- Create a new message --
			Message msg = new MimeMessage(session);

			// -- Set the FROM and TO fields --
			msg.setFrom(new InternetAddress(to));
			msg.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to, false));
			try
			{
				msg.setSubject(MimeUtility.encodeText(title, "UTF-8", null));
			}
			catch (Exception ex)
			{
				msg.setSubject(title);
			}
			msg.setHeader("Content-Type","text/plain; charset=\"utf-8\"");
			
			//////

		 
			MimeBodyPart msgPart = new MimeBodyPart();
			 

			MimeMultipart multipart = new MimeMultipart();
			multipart.addBodyPart(msgPart);  // adding message part
			 
			//Setting the Email Encoding	
			msgPart.setText(content,"utf-8");
			msgPart.setHeader("Content-Type","text/html; charset=\"utf-8\"");
			//msgPart.setHeader("Content-Transfer-Encoding", "quoted-printable");
			 
			msg.setContent(multipart);
			msg.setSentDate(new Date());
			
			//////
			Transport.send(msg);

		} catch (MessagingException e) {
			System.out.println("Error send mail: " + e.toString());
		}

	}

}
