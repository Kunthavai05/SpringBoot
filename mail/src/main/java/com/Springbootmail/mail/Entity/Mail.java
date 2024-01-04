package com.Springbootmail.mail.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mail {
	private String recipient;
	private String text;
	private String subject;

}
