package com.Springbootmail.mail.Controller;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Springbootmail.mail.Entity.Mail;
import com.Springbootmail.mail.Service.MailService;

@RestController
@RequestMapping("mail")
public class MailControler {
	@Autowired
	private MailService mailService;
	
	

    @PostMapping("/sendEmailWithAttachment")
    public String sendEmailWithAttachment(
            @RequestParam("recipient") String recipient,
            @RequestParam("subject") String subject,
            @RequestParam("text") String text,
            @RequestParam("file") MultipartFile file
    ) throws MessagingException {
        try {
            // Save the uploaded file to a temporary location
            String filePath = "/tmp/" + file.getOriginalFilename();
            file.transferTo(new File(filePath));

            // Create a Mail object
            Mail mail = new Mail();
            mail.setRecipient(recipient);
            mail.setSubject(subject);
            mail.setText(text);

            
            mailService.sendEmailWithAttachment(mail, filePath);

            File tempFile = new File(filePath);
            if (tempFile.exists()) {
                tempFile.delete();
            }

            return "success"; 
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

//	@PostMapping(value = "/sendmail")
//	public String sendMail(@RequestBody Mail mail) {
//		MailService.saveCus(mail);
//
//		return "Mail sent succesfully";
//	}

}
