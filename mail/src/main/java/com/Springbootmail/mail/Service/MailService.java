package com.Springbootmail.mail.Service;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.Springbootmail.mail.Entity.Mail;

@Service
public class MailService {
	
	  @Autowired
	    private MailService mailService;
	  



		public void sendEmailWithAttachment(Mail mail, String filePath) {
			  try {
				  SimpleMailMessage message = new SimpleMailMessage();
		            mailService.sendEmailWithAttachment(mail, filePath);
		        } catch (Exception e) {
		           
		            e.printStackTrace();
		        }
		    }
		
			
			
		}
	
	
//	@Autowired
//	private JavaMailSender javaMailSender;

//	public void saveCus(Mail mail) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setTo(mail.getRecipient());
//		message.setText(mail.getText());
//		message.setSubject(mail.getSubject());
//
//		javaMailSender.send(message);
//
//		
//	}
	
	
	
	

