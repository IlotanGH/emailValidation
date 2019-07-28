package jnatoli.email.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jnatoli.email.model.EmailResponse;
import jnatoli.email.services.intercefes.EmailService;

/**
 * Email validation controller.
 * @author jose.natoli.bueno
 *
 */
@RestController
@RequestMapping("/email")
public class EmailController {
	
	/**
	 * Email Controller logger.
	 */
	private Logger logger = Logger.getLogger(EmailController.class.getName());
	
	/**
	 * Email validation service.
	 */
	@Autowired
	private EmailService service;
	
	/**
	 * Email validation method.
	 * @param email email to validate.
	 * @return EmailResponse email response.
	 */
	@GetMapping("/validate/{email}")
	public EmailResponse validate(@PathVariable String email) {
		logger.info("Validating email " + email);
		String response = service.validate(email) ? "true" : "false";
		EmailResponse emailResponse = new EmailResponse(response);
		logger.info(emailResponse.toString());
		return emailResponse;
	}
	
}
