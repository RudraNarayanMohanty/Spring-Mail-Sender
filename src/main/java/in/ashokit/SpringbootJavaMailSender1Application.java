package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringbootJavaMailSender1Application {
	@Autowired
	private EmailSenderService emailSenderService;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJavaMailSender1Application.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail() throws Exception {
	emailSenderService.sendSimpleMessage("myofficedemomail@gmail.com",
			"This is body",
			"hi, Please find my resume as an attachment.","C:\\Users\\HP\\Downloads\\xyz.pdf");	
	}
	

}
