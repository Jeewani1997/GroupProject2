package com.WasteManagementSystem.Backend.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
<<<<<<< HEAD
<<<<<<< HEAD

import com.sendgrid.helpers.mail.objects.Content;

=======
import com.sendgrid.helpers.mail.objects.Content;
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
=======
import com.sendgrid.helpers.mail.objects.Content;
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;

@Service
public class EmailService {
<<<<<<< HEAD
<<<<<<< HEAD
	@Value("${app.sendgrid.templateId}")
	private String templateId;
	
	@Autowired
	SendGrid sendGrid;
=======
=======
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
//	@Value("${app.sendgrid.templateId}")
//	private String templateId;
	
	@Autowired
	SendGrid sendGrid;
	Content content;
<<<<<<< HEAD
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
=======
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
	
	public String sendEmail(String email) {
		try {
			Mail mail = prepareMail(email);
			Request request = new Request();
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sendGrid.api(request);
			if(response!=null) {
				System.out.println("response code from sendgrid" + response.getHeaders());
			}
		} catch(IOException e) {
			e.printStackTrace();
			return "Error in sent";
		}
		return "Mail has been sent check your email!";
	}
	
	public Mail prepareMail(String email) {
		Mail mail = new Mail();
		Email fromEmail = new Email();
		fromEmail.setEmail("ssakunchamikara@gmail.com");
		
		Email to = new Email();
		to.setEmail(email);
		
<<<<<<< HEAD
<<<<<<< HEAD
		Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
=======
//		Content content = new Content("text/plain", "Dear customer, Thank you for being with us!");
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
=======
//		Content content = new Content("text/plain", "Dear customer, Thank you for being with us!");
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
		String subject = "Sending with SendGrid is Fun";
		
		Personalization personalization = new Personalization();
		
		personalization.addTo(to);
		mail.addContent(content);
//		mail.setTemplateId(templateId);
		mail.setFrom(fromEmail);
		mail.setSubject(subject);
		mail.addPersonalization(personalization);
		
		return mail;
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae

	public void setcontent(String c) {
		content = new Content("text/plain", c);
		
	}
<<<<<<< HEAD
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
=======
>>>>>>> c97b06ef4a08dd1dc8e99918a4f583d2be7ad0ae
}
